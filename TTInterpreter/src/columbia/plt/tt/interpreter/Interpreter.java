package columbia.plt.tt.interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import antlr.RecognitionException;
import columbia.plt.tt.DefinitionAnalyzer;
import columbia.plt.tt.TTLexer;
import columbia.plt.tt.TTParser;
import columbia.plt.tt.datatype.Calendar;
import columbia.plt.tt.datatype.Date;
import columbia.plt.tt.datatype.Task;
import columbia.plt.tt.datatype.TimeFrame;
import columbia.plt.tt.typecheck.*;



public class Interpreter {

	TTLexer lexer;
	TokenStream tokenStream;
	TTParser parser;
	// Right now our TTGrammar.g makes each node a CommonTree
	CommonTree root;
	SymbolTable symbolTable = new SymbolTable();
	ArrayList<String> errors = new ArrayList<String>();


	public enum TimeFrameConst {
		YEAR, YEARS, MONTH, MONTHS, DAY, DAYS, HOUR, HOURS, MINUTE, MINUTES,
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY,
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER,
		WEEKEND, WEEKDAY
	}


    
	public InterpreterListener listener = // default response to messages
	        new InterpreterListener() {
	            public void info(String msg) { System.out.println(msg); }
	            public void error(String msg) { System.err.println(msg); }
	            public void error(String msg, Exception e) {
	                error(msg); e.printStackTrace(System.err);
	            }
	           
				@Override
				public void error(String msg, org.antlr.runtime.Token t) {
	            error("line "+t.getLine()+": "+msg);
					
				}
	        };
	
	
//add interpreterListener to collect errors
	public void interp(InputStream input) throws RecognitionException,
			IOException, org.antlr.runtime.RecognitionException {
		// Lexical and Syntax Analysis
		CharStream stream = new ANTLRInputStream(input);
		lexer = new TTLexer(stream);
		tokenStream = new CommonTokenStream(lexer);
		parser = new TTParser(tokenStream);
		// Do we have a tree adaptor??
		// parser.setTreeAdaptor(InterPie.pieAdaptor);

		// Show any lexer/parser errors
		for (int i = 0; i < lexer.getErrors().size(); i++) {
			System.out.println(lexer.getErrors().get(i));
		}
		for (int i = 0; i < parser.getErrors().size(); i++) {
			System.out.println(parser.getErrors().get(i));
		}
		TTParser.translationUnit_return r = parser.translationUnit();
		root = r.getTree();
		System.out.println("tree: " + root.toStringTree());
		// If Syntax errors exit
		if (parser.getNumberOfSyntaxErrors() != 0)
			return;

		// Semantic Analysis
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(root);
		nodes.setTokenStream(tokenStream); // pass the tokens from the lexer
		//nodes.setTreeAdaptor(TTAdaptor);
		
		// Phase 1 - Analyze all method and variable definitions and populate the SymbolTable
		DefinitionAnalyzer def = new DefinitionAnalyzer(nodes, symbolTable);
		def.downup(root); // trigger define actions upon certain subtrees
		
//		// Phase 2 - Analyze expression types and resolve symbols
//		nodes.reset();
//		TypeAnalyzer typeComp = new TypeAnalyzer(nodes, symbolTable);
//		typeComp.downup(root); // trigger resolve/type computation actions

//		if (errors)
//			return;
		
		// Run program it is correct
		tunit(root);
	}

	/** visitor dispatch according to node token type */
	public Object exec(CommonTree t) {

		// System.out.println(t.getType());
		try {
			switch (t.getType()) {
			case TTParser.TUNIT:
				tunit(t);
				break; // (PL)
			case TTParser.IMPORTS:
				imports(t);
				break; // (PL)
			// case TTParser.IMPORT : imports(t); break; // (PL) is this same
			// with IMPORTS?
			case TTParser.MAIN:
				mainBlock(t);
				break; // (PL)
			case TTParser.SLIST: return block(t);// (PL)
				
			case TTParser.STRINGTYPE: 
			case TTParser.NUMBERTYPE:	
			case TTParser.DATETYPE : 
			case TTParser.TASKTYPE : 
			case TTParser.TIMEFRAMETYPE : 
			case TTParser.CALENDARTYPE : 
			case TTParser.TIMETYPE :
			
			case TTParser.DECLARE:	
				declarationEval(t);
				break;

			// case TTParser.STRINGTYPE: (AA)
//			case TTParser.NUMBERTYPE:
//				numberType(t);
//				break; // (AA)
			case TTParser.DATE_CONSTANT_TOKEN: return dateConstant(t);
			case TTParser.TIMEFRAME_CONSTANT: return timeFrameConstant(t);
			// case TTParser.DATETYPE : (AA)
			// case TTParser.TASKTYPE : (AA)
			// case TTParser.TIMEFRAMETYPE : (AA)
			// case TTParser.CALENDARTYPE : (AA)
			// case TTParser.TIMETYPE : (AA)
			case TTParser.IF:
				ifStatement(t);
				break;// (MA)
			case TTParser.ELSE:
				elseStatement(t);
				break;// (MA)
			case TTParser.EVERYDATE:
				everyDate(t);
				break; // (MA)
			case TTParser.EVERYTASK:
				everyTask(t);
				break; // (MA)
			case TTParser.FROM:
				return dateOrIdent(t); // (MA)
			case TTParser.TO:
				return dateOrIdent(t); // (MA)
			case TTParser.BY:
				return timeFrameOrIdent(t); // (MA)
			case TTParser.IN:
				return in(t);// (MA)
				// case TTParser.ON : (MA)
				// case TTParser.BREAK : (MA)
				// case TTParser.EXIT : (MA)
				// case TTParser.CONTINUE : (MA)
			/*case TTParser.TRUE : return true;
			case TTParser.FALSE : return false;*/
			case TTParser.IDENT_TOKEN:
			case TTParser.IDENT:
				return identity(t);
				// (JL)
			case TTParser.ASSIGN:
				assign(t);
				break; // (JL)
			case TTParser.NUMBER:
				return Integer.parseInt(t.getText()); // (JL)
			case TTParser.STRING_CONSTANT:
				return t.getText();
			case TTParser.TRUE:
			case TTParser.FALSE:
				return Boolean.parseBoolean(t.getText());
			case TTParser.PLUS:
				return plusEval(t);

			case TTParser.MINUS:
			case TTParser.DIV:
			case TTParser.MULT:
			case TTParser.MOD:
				return arithmeticEval(t);
			case TTParser.AND:
			case TTParser.OR:
			case TTParser.NOT:
				return logicalEval(t);

			case TTParser.GT:
			case TTParser.GTEQ:
			case TTParser.LT:
			case TTParser.LTEQ:
				return relationalEval(t);

			case TTParser.EQUALS:
			case TTParser.NOTEQUALS:
				return equalityEval(t); // (AA)
			case TTParser.CALL : return call(t); 
			case TTParser.RETURN : return returnStmt(t);
				// case TTParser.READ : (PL)
			case TTParser.PRINT:
				print(t);
				break; // (PL)

			case TTParser.TIMEFRAME_YEAR : return TimeFrameConst.YEAR;
			case TTParser.TIMEFRAME_YEARS : return TimeFrameConst.YEARS;
			case TTParser.TIMEFRAME_MONTH : return TimeFrameConst.MONTH;
			case TTParser.TIMEFRAME_MONTHS : return TimeFrameConst.MONTHS;
			case TTParser.TIMEFRAME_DAY : return TimeFrameConst.DAY;
			case TTParser.TIMEFRAME_DAYS : return TimeFrameConst.DAYS;
			case TTParser.TIMEFRAME_HOUR : return TimeFrameConst.HOUR;
			case TTParser.TIMEFRAME_HOURS : return TimeFrameConst.HOURS;
			case TTParser.TIMEFRAME_MINUTE : return TimeFrameConst.MINUTE;
			case TTParser.TIMEFRAME_MINUTES : return TimeFrameConst.MINUTES;
			case TTParser.TIMEFRAME_MONDAY : return TimeFrameConst.MONDAY;
			case TTParser.TIMEFRAME_TUESDAY : return TimeFrameConst.TUESDAY;
			case TTParser.TIMEFRAME_WEDNESDAY : return TimeFrameConst.WEDNESDAY;
			case TTParser.TIMEFRAME_THURSDAY : return TimeFrameConst.THURSDAY;
			case TTParser.TIMEFRAME_FRIDAY : return TimeFrameConst.FRIDAY;
			case TTParser.TIMEFRAME_SATURDAY : return TimeFrameConst.SATURDAY;
			case TTParser.TIMEFRAME_SUNDAY : return TimeFrameConst.SUNDAY;
			case TTParser.TIMEFRAME_JANUARY : return TimeFrameConst.JANUARY;
			case TTParser.TIMEFRAME_FEBRUARY : return TimeFrameConst.FEBRUARY;
			case TTParser.TIMEFRAME_MARCH : return TimeFrameConst.MARCH;
			case TTParser.TIMEFRAME_APRIL : return TimeFrameConst.APRIL;
			case TTParser.TIMEFRAME_MAY : return TimeFrameConst.MAY;
			case TTParser.TIMEFRAME_JUNE : return TimeFrameConst.JUNE;
			case TTParser.TIMEFRAME_JULY : return TimeFrameConst.JULY;
			case TTParser.TIMEFRAME_AUGUST : return TimeFrameConst.AUGUST;
			case TTParser.TIMEFRAME_SEPTEMBER : return TimeFrameConst.SEPTEMBER;
			case TTParser.TIMEFRAME_OCTOBER : return TimeFrameConst.OCTOBER;
			case TTParser.TIMEFRAME_NOVEMBER : return TimeFrameConst.NOVEMBER;
			case TTParser.TIMEFRAME_DECEMBER : return TimeFrameConst.DECEMBER;
			case TTParser.TIMEFRAME_WEEKEND : return TimeFrameConst.WEEKEND;
			case TTParser.TIMEFRAME_WEEKDAY : return TimeFrameConst.WEEKDAY;

			/*
			 * case PieParser.BLOCK : block(t); break; case PieParser.ASSIGN :
			 * assign(t); break; case PieParser.RETURN : ret(t); break; case
			 * PieParser.PRINT : print(t); break; case PieParser.IF : ifstat(t);
			 * break; case PieParser.WHILE : whileloop(t); break; case
			 * PieParser.CALL : return call(t); case PieParser.NEW : return
			 * instance(t); case PieParser.ADD : return add(t); case
			 * PieParser.SUB : return op(t); case PieParser.MUL : return op(t);
			 * case PieParser.EQ : return eq(t); case PieParser.LT : return
			 * lt(t); case PieParser.INT : return Integer.parseInt(t.getText());
			 * case PieParser.CHAR : return new
			 * Character(t.getText().charAt(1)); case PieParser.FLOAT : return
			 * Float.parseFloat(t.getText()); case PieParser.STRING : String s =
			 * t.getText(); return s.substring(1,s.length()-1); case
			 * PieParser.DOT : case PieParser.ID : return load(t);
			 */
			default: // catch unhandled node types
				throw new UnsupportedOperationException("Node " + t.getText()
						+ "<" + t.getType() + "> not handled");
			}
		} catch (Exception e) {
			listener.error("problem executing " + t.toStringTree(), e);
		}
		return null;
	}

	public void tunit(CommonTree t) {
		if (t.getType() != TTParser.TUNIT) {
			listener.error("not a tunit: " + t.toStringTree());
		}
		MethodSymbol mainSymbol = (MethodSymbol) symbolTable.getSymbol("main");
		if (mainSymbol == null) {
			System.out.println("No main");
			listener.error("no main method to execute: " + t.toStringTree());
		} else
			exec(mainSymbol.methodBody);

		// Clear global scope
		symbolTable.removeScope();
	}

	public void imports(CommonTree t) {
		// System.out.println("Imports");
	}

	public void mainBlock(CommonTree t) {
		System.out.println("main");
		symbolTable.addScope(); // add a scope for a main block

		if (t.getType() != TTParser.MAIN) {
			listener.error("not a mainblock: " + t.toStringTree());
		}
		CommonTree mainBody = (CommonTree) t.getChild(0);
		exec((CommonTree) mainBody);
		symbolTable.removeScope();
	}

	public Object block(CommonTree t) {
		System.out.println("block");
		// Execute code
		if (t.getType() != TTParser.SLIST) {
			// Handle error
			 listener.error("not a block: " + t.toStringTree());
		}
		int childrenCount = t.getChildCount();
		for (int i = 0; i < childrenCount; i++) {
			CommonTree childNode = (CommonTree)t.getChild(i);
			Object rv = exec(childNode);
			if (childNode.getType() == TTParser.RETURN)
				return rv;
		}
		return null;
	}
	
	/*public void numberType(CommonTree t) {
		System.out.println("number");
		System.out.println(t.getChild(0).getText());

		for (int i = 0; i < t.getChildCount(); i++) {
			symbolTable.addSymbol(t.getChild(i).getText(), t.getText(), null); // Number
																				// a;
			exec((CommonTree) t.getChild(i));
		}

	}
	*/
	public void declarationEval(CommonTree t){
		
		System.out.println("Type" + t.getChild(0).getText());
		
		String dataType = t.getChild(0).getText();
		int rightChildCount = t.getChildCount() - 1;
		
		for (int i = 1 ; i <= rightChildCount ; i++ )
			symbolTable.addSymbol(t.getChild(1).getText(), dataType, null); 
		
	}

	public Symbol identity(CommonTree t) {
		 System.out.println("identity" + t.getChild(0));
		 
		 Symbol s = symbolTable.getSymbol(t.getChild(0).getText());
		 return s;
	}

	public void assign(CommonTree t) {
		System.out.println("assign");
		// System.out.println(t.getChild(0).getText());
		symbolTable.setValue(t.getChild(0).getText(),
				exec((CommonTree) t.getChild(1)));

		/*
		 * for (int i = 0; i < t.getChildCount(); i++) {
		 * System.out.println(((CommonTree)t.getChild(i)).getText());
		 * //System.out.println("here2 " + exec((CommonTree)t.getChild(i)));
		 * Object o = exec((CommonTree)t.getChild(i)); }
		 */
	}

	public Object plusEval(CommonTree t) {

		System.out.println("" +
				" Operator Evaluation");
		Object a = exec((CommonTree) t.getChild(0));
		Object b = exec((CommonTree) t.getChild(1));

		if (a instanceof String && b instanceof String)
			return a.toString() + b.toString();
		else {
			return arithmeticEval(t);
		}

	}

	public int arithmeticEval(CommonTree t) {
		System.out.println("Arithmetic Evaluation");

		int a = (Integer) exec((CommonTree) t.getChild(0));
		int b = (Integer) exec((CommonTree) t.getChild(1));

		switch (t.getType()) {

		case TTParser.PLUS:
			System.out.println(a+b);
			return a + b;

		case TTParser.MINUS:
			return a - b;

		case TTParser.MULT:
			return a * b;

		case TTParser.DIV:
			{	if (b == 0) {
					listener.error("invalid operation:" + t.toStringTree());
					}
				return a / b;
			
			}
			 // to do throw error on divide by zero

		case TTParser.MOD:
			return a % b;

		default:
			return 0;

		}

	}

	public boolean logicalEval(CommonTree t) {

		System.out.println("Logical Evaluation");

		boolean a = (Boolean)exec((CommonTree) t.getChild(0));
		boolean b = (Boolean)exec((CommonTree) t.getChild(1));

		switch (t.getType()) {
		case TTParser.AND:
			return a && b;
		case TTParser.OR:
			return a || b;
		case TTParser.NOT:
			return !a;
		default:
			return false;
		}

	}

	public boolean equalityEval(CommonTree t) {

		System.out.println("Equality Evaluation");
		Object a = exec((CommonTree) t.getChild(0));
		Object b = exec((CommonTree) t.getChild(1));


		switch (t.getType()) {

		case TTParser.EQUALS:
			return a == b;
		case TTParser.NOTEQUALS:
			return a != b;
		default:
			return false;
		}
	}

	public boolean relationalEval(CommonTree t) {

		System.out.println("Relational Evaluation");
		int a = (Integer) exec((CommonTree) t.getChild(0));
		int b = (Integer) exec((CommonTree) t.getChild(1));

		switch (t.getType()) {

		case TTParser.GTEQ:
			return a >= b;
		case TTParser.LTEQ:
			return a <= b;
		case TTParser.GT:
			return a > b;
		case TTParser.LT:
			return a < b;

		default:
			return false;
		}

	}

	public Object call(CommonTree t) {
		System.out.println("call");

		String methodName = t.getChild(0).getText();
		MethodSymbol methodSymbol = (MethodSymbol) symbolTable
				.getSymbol(methodName);
		if (methodName == null) {
			listener.error("no such method " + methodName, t.token);
			return null;
		}

		int argCount = t.getChildCount() - 1;
		// check for argument compatibility
		ArrayList<Symbol> argsList = methodSymbol.getArgumentList();
		if (argsList == null && argCount > 0 || argsList != null
				&& argsList.size() != argCount) {
			listener.error("method '" + methodName + "' argument list mismatch");
			return null;
		}
		symbolTable.addScope(false);
		int i = 0;
		// evaluate and define arguments
		for (Symbol arg : argsList) {
			CommonTree ithArg = (CommonTree) t.getChild(i + 1);
			Object argValue = exec(ithArg);
			symbolTable.addSymbol(arg.getName(), arg.getType(), argValue);
			i++;
		}

		Object result = exec(methodSymbol.methodBody);
		symbolTable.removeScope();
		return result;
	}

	public Object returnStmt(CommonTree t) {
		int childrenCount = t.getChildCount();
		if (childrenCount == 0)
			return null;
		return exec((CommonTree) t.getChild(0));
	}

	public void ifStatement(CommonTree t) {
		System.out.println("IF" + t.getChildCount());
		// 0th Child is the expr to evaluate
		if ((Boolean) exec((CommonTree) t.getChild(0))) {
			System.out.println("HERE");
			// 1st Child is the block
			exec((CommonTree) t.getChild(0));
		} else if (t.getChildCount() >= 3) {
			System.out.println("HERE");
			exec((CommonTree) t.getChild(2));
			System.out.println(((CommonTree) t.getChild(2)).getText());
		}

	}

	public void elseStatement(CommonTree t) {
		for (int i = 0; i < t.getChildCount(); i++) {
			exec((CommonTree) t.getChild(i));
		}
	}

	public void everyDate(CommonTree t) {
		System.out.println("\neveryDate! ");
		// Declare variables
		Date start = null;
		Date end = null;
		TimeFrame inc = null;
		CommonTree block = null;
		Date itterDate = null;
		String type = null;
		String name = null;
		
		// Create a new scope that is a child of parent scope
		symbolTable.addScope(true);
		symbolTable.addSymbol(name, type, itterDate);

		for (int i = 0; i < t.getChildCount(); i++) {
			switch (t.getChild(i).getType()) {
			case TTParser.FROM:
				start = (Date) exec((CommonTree) t.getChild(i));
				break;
			case TTParser.TO:
				end = (Date) exec((CommonTree) t.getChild(i));
				break;
			case TTParser.BY:
				inc = (TimeFrame) exec((CommonTree) t.getChild(i));
				break;
			case TTParser.SLIST:
				block = (CommonTree) t.getChild(i);
				break;
			default:
				// Handle "Date"
				type = ((CommonTree) t.getChild(i)).getText();
				name = ((CommonTree) t.getChild(i)).getChild(0).getText();
				symbolTable.addSymbol(name, type, itterDate);
				break;
			}
		}

		if (start == null || end == null)
		{
			// End of loop remove the scope
			symbolTable.removeScope();
			return;
		}

		// Define the itterDate
		itterDate = start;
		symbolTable.addSymbol(name, type, itterDate);
		
		

		while (itterDate.compareTo(end) <= 0) {
			// Execute the block
			exec(block);

			// Increment the itterDate and update symbolTable
			//itterDate = (Date)symbolTable.getSymbol(name);
			itterDate.add(inc);
			symbolTable.addSymbol(name, type, itterDate);
		}
		
		// End of loop remove the scope
		symbolTable.removeScope();
	}

	public Date dateConstant(CommonTree t) {
		return new Date(((CommonTree) t.getChild(0)).getText());
	}

	public Date dateOrIdent(CommonTree t) {
		return (Date)exec((CommonTree) t.getChild(0));
	}
	
	public TimeFrame timeFrameOrIdent(CommonTree t) {
		// This only handles timeFrameConstant
		System.out.println("timeFrameOrIdent");
		return (TimeFrame)exec((CommonTree)t.getChild(0));
	}

	public TimeFrame timeFrameConstant(CommonTree t) {
		String tf = "";
		for (int i = 0; i < t.getChildCount(); i++) {
			tf = tf + " " + ((CommonTree) t.getChild(i)).getText();
		}
		return new TimeFrame(tf);
	}
	
	public void everyTask(CommonTree t) {
		System.out.println("\neveryTask!");

		String type = null;
		String name = null;

		Date start = null;
		Date end = null;

		CommonTree on = null;
		Calendar c = null;

		CommonTree block = null;
		Task itterTask = null;

		for (int i = 0; i < t.getChildCount(); i++) {
			switch (t.getChild(i).getType()) {
			case TTParser.IN:
				c = (Calendar) exec((CommonTree) t.getChild(i));
				break;
			case TTParser.FROM:
				start = (Date) exec((CommonTree) t.getChild(i));
				break;
			case TTParser.TO:
				end = (Date) exec((CommonTree) t.getChild(i));
				break;
			case TTParser.ON:
				on = (CommonTree) t.getChild(i);
				break;
			case TTParser.SLIST:
				block = (CommonTree) t.getChild(i);
				break;
			default:
				// Handle "Task"
				type = ((CommonTree) t.getChild(i)).getText();
				name = ((CommonTree) t.getChild(i)).getChild(0).getText();
				symbolTable.addSymbol(name, type, itterTask);
				break;
			}
		}

		// Get the subset of tasks from Calendar
		ArrayList<Task> taskList = null;
		if (start != null && end != null) {
			taskList = c.getTasksWithinRange(start, end);
		} else {
			taskList = c;
		}

		for (Task task : taskList) {
			// If there is an on expression evaluate it for each loop
			if (on == null || (Boolean) exec(on)) {
				// Update the symbol table
				itterTask = task;
				symbolTable.addSymbol(name, type, itterTask);

				// execute the block of code
				exec(block);
			}
		}

	}

	public Calendar in(CommonTree t) {
		return new Calendar("Temp");
	}

	public void print(CommonTree t) {
		if(((CommonTree)t.getChild(0)).getType() == TTParser.IDENT_TOKEN)
		{
			System.out.println("in here");
			Symbol s = (Symbol)exec((CommonTree)t.getChild(0));
			System.out.println(s.getValue());
		}
		else
			System.out.println(t.getChild(0).getText());
	}
}
