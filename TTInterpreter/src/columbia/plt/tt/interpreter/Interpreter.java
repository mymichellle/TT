package columbia.plt.tt.interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;

import antlr.RecognitionException;
import columbia.plt.tt.TTLexer;
import columbia.plt.tt.TTParser;
import columbia.plt.tt.datatype.Date;
import columbia.plt.tt.datatype.TimeFrame;

public class Interpreter {
		
	TTLexer lexer;
  TokenStream tokenStream;
	TTParser parser;
	// Right now our TTGrammar.g makes each node a CommonTree
	CommonTree root;
	SymbolTable symbolTable = new SymbolTable();
	ArrayList<String> errors = new ArrayList<String>();
		      					
	public void interp(InputStream input) throws RecognitionException, IOException, org.antlr.runtime.RecognitionException {
		CharStream stream = new ANTLRInputStream(input);       
		lexer = new TTLexer(stream);
		tokenStream = new CommonTokenStream(lexer);
		parser = new TTParser(tokenStream);
		// Do we have a tree adaptor??
		//parser.setTreeAdaptor(InterPie.pieAdaptor);
		
		// Show any lexer/parser errors
		for (int i = 0; i < lexer.getErrors().size(); i++) {
			System.out.println(lexer.getErrors().get(i));
		}
		
		for (int i = 0; i < parser.getErrors().size(); i++) {
			System.out.println(parser.getErrors().get(i));
		}
		
		TTParser.translationUnit_return r = parser.translationUnit();
		if( parser.getNumberOfSyntaxErrors()==0 ) {
			root = r.getTree();
			System.out.println("tree: "+root.toStringTree());
		  tunit(root);
		}
	}
	
	
	/** visitor dispatch according to node token type */
	public Object exec(CommonTree t) {
	
	//System.out.println(t.getType());
	try {
		switch ( t.getType() ) 
		{
			case TTParser.TUNIT : tunit(t); break;     // (PL)
		  case TTParser.IMPORTS : imports(t); break; // (PL)
		  //case TTParser.IMPORT : imports(t); break; // (PL)  is this same with IMPORTS?
		  case TTParser.MAIN : mainBlock(t); break;  // (PL)
		  case TTParser.SLIST : block(t); break;     // (PL)
		  //case TTParser.STRINGTYPE:         (AA)
		  case TTParser.NUMBERTYPE : numberType(t); break;       //(AA)
		  //case TTParser.DATETYPE :            (AA)
		  //case TTParser.TASKTYPE :            (AA)
		  //case TTParser.TIMEFRAMETYPE :  (AA)
		  //case TTParser.CALENDARTYPE :    (AA)
		  //case TTParser.TIMETYPE :           (AA)
		  //case TTParser.IF :                  (MA)
		  //case TTParser.ELSE :                (MA)
		  case TTParser.EVERYDATE : everyDate(t); break; //(MA)
		  case TTParser.EVERYTASK : everyTask(t); break; // (MA)
		  case TTParser.FROM : return from(t);  // (MA)
		  case TTParser.TO :  return to(t);           // (MA)
		  case TTParser.BY :  return by(t);           // (MA)
		  //case TTParser.IN :             (MA)
		  //case TTParser.ON :             (MA)
		  //case TTParser.BREAK :            (MA)
		  //case TTParser.EXIT :             (MA)
		  //case TTParser.CONTINUE :      (MA)
		  //case TTParser.TRUE :         (JL)
		  //case TTParser.FALSE :       (JL)
		  case TTParser.IDENT : identity(t); break;     //(JL)
		  case TTParser.ASSIGN : assign(t); break;      //(JL)
		  case TTParser.NUMBER : return Integer.parseInt(t.getText());  //(JL)
		  case TTParser.PLUS : return plus(t);                          //(AA)
		  //case TTParser.CALL : call(t); break;      (PL)
		  //case TTParser.RETURN :      (PL)
		  //case TTParser.READ :      (PL)
		  case TTParser.PRINT :  print(t); break;     //(PL)
		  
		  //case TTParser.TIMEFRAME_YEAR  //(JL)
		  //case TTParser.TIMEFRAME_YEARS  //(JL)
		  //case TTParser.TIMEFRAME_MONTH  //(JL)
		  //case TTParser.TIMEFRAME_MONTHS  //(JL)
		  //case TTParser.TIMEFRAME_DAY  //(JL)
		  //case TTParser.TIMEFRAME_DAYS  //(JL)
		  //case TTParser.TIMEFRAME_HOUR  //(JL)
		  //case TTParser.TIMEFRAME_HOURS  //(JL)
		  //case TTParser.TIMEFRAME_MINUTE  //(JL)
		  //case TTParser.TIMEFRAME_MINUTES  //(JL)
		  //case TTParser.TIMEFRAME_MONDAY  //(JL)
		  //case TTParser.TIMEFRAME_TUESDAY  //(JL)
		  //case TTParser.TIMEFRAME_WEDNESDAY  //(JL)
		  //case TTParser.TIMEFRAME_THURSDAY  //(JL)
		  //case TTParser.TIMEFRAME_FRIDAY  //(JL)
		  //case TTParser.TIMEFRAME_SATURDAY  //(JL)
		  //case TTParser.TIMEFRAME_SUNDAY  //(JL)
		  //case TTParser.TIMEFRAME_JANUARY  //(JL)
		  //case TTParser.TIMEFRAME_FEBRUARY  //(JL)
		  //case TTParser.TIMEFRAME_MARCH  //(JL)
		  //case TTParser.TIMEFRAME_APRIL  //(JL)
		  //case TTParser.TIMEFRAME_MAY  //(JL)
		  //case TTParser.TIMEFRAME_JUNE  //(JL)
		  //case TTParser.TIMEFRAME_JULY  //(JL)
		  //case TTParser.TIMEFRAME_AUGUST  //(JL)
		  //case TTParser.TIMEFRAME_SEPTEMBER  //(JL)
		  //case TTParser.TIMEFRAME_OCTOBER  //(JL)
		  //case TTParser.TIMEFRAME_NOVEMBER  //(JL)
		  //case TTParser.TIMEFRAME_DECEMBER  //(JL)
		  //case TTParser.TIMEFRAME_WEEKEND  //(JL)
		  //case TTParser.TIMEFRAME_WEEKDAY  //(JL)
		  
		  
		  /*   case PieParser.BLOCK : block(t); break;
		  case PieParser.ASSIGN : assign(t); break;
		  case PieParser.RETURN : ret(t); break;
		  case PieParser.PRINT : print(t); break;
		  case PieParser.IF : ifstat(t); break;
		  case PieParser.WHILE : whileloop(t); break;
		  case PieParser.CALL : return call(t);
		  case PieParser.NEW : return instance(t);
		  case PieParser.ADD : return add(t);
		  case PieParser.SUB : return op(t);
		  case PieParser.MUL : return op(t);
		  case PieParser.EQ : return eq(t);
		  case PieParser.LT : return lt(t);
		  case PieParser.INT : return Integer.parseInt(t.getText());
		  case PieParser.CHAR : return new Character(t.getText().charAt(1));
		  case PieParser.FLOAT : return Float.parseFloat(t.getText());
		  case PieParser.STRING :
		  String s = t.getText();
		  return s.substring(1,s.length()-1);
		  case PieParser.DOT :
		  case PieParser.ID :
		  return load(t);*/
		  default : // catch unhandled node types
		  throw new UnsupportedOperationException("Node "+
		  t.getText()+"<"+t.getType()+"> not handled");
		  }
		}
		catch (Exception e) {
		}
		return null;
	}
	
	public void tunit(CommonTree t) {
		if ( t.getType()!=TTParser.TUNIT) {
			System.out.println("NOT a TUNIT");
		}
		// Execute code    	
		List<CommonTree> stats = null;
		for (int i = 0; i < t.getChildCount(); i++)
		{
			exec((CommonTree)t.getChild(i));
		}
	}
	
	public void imports(CommonTree t) {
		//System.out.println("Imports");
	}
	
	public void mainBlock(CommonTree t) {
		//System.out.println("main");
		
		symbolTable.addScope();  // add a scope for a main block
		
		if ( t.getType()!=TTParser.MAIN ) {
			// Handle error
		  //listener.error("not a block: "+t.toStringTree());
		}
		// Execute code    	
		List<CommonTree> stats = null;
		for (int i = 0; i < t.getChildCount(); i++)
		{
			//exec((CommonTree)t.getChild(i));
		  exec((CommonTree)t.getChild(i));
		}
		
		System.out.println("a: " + symbolTable.getCurrentScope().get("a").getType() + ", " + symbolTable.getCurrentScope().get("a").getValue());
		System.out.println("b: " + symbolTable.getCurrentScope().get("b").getType() + ", " + symbolTable.getCurrentScope().get("b").getValue());
		System.out.println("c: " + symbolTable.getCurrentScope().get("c").getType() + ", " + symbolTable.getCurrentScope().get("c").getValue());
		//System.out.println("d: " + symbolTable.getCurrentScope().get("d").getType() + ", " + symbolTable.getCurrentScope().get("d").getValue());
	}
	
	public void block(CommonTree t) {
		//System.out.println("block");
		// Execute code    	
		List<CommonTree> stats = null;
		for (int i = 0; i < t.getChildCount(); i++)
		{
			exec((CommonTree)t.getChild(i));
		}
	}
	
	public void numberType(CommonTree t) {
		System.out.println("number");
		System.out.println(t.getChild(0).getText());
		
		for (int i = 0; i < t.getChildCount(); i++)
		{
			symbolTable.addSymbol(t.getChild(i).getText(), t.getText(), null);  // Number a;
		  exec((CommonTree)t.getChild(i));
		}
		
	}
	
	public void identity(CommonTree t) {
		//System.out.println("identity");    	
	
		for (int i = 0; i < t.getChildCount(); i++)
		{
			//System.out.println(((CommonTree)t.getChild(i)).getText());
			//System.out.println("here1 " + exec((CommonTree)t.getChild(i)));
			exec((CommonTree)t.getChild(i));
		}	
	}
	
	public void assign(CommonTree t) {
		System.out.println("assign");
		//System.out.println(t.getChild(0).getText());
		symbolTable.setValue(t.getChild(0).getText(), exec((CommonTree)t.getChild(1)));
		
		/*
		for (int i = 0; i < t.getChildCount(); i++)  
		{
		System.out.println(((CommonTree)t.getChild(i)).getText());
		//System.out.println("here2 " + exec((CommonTree)t.getChild(i)));
		Object o = exec((CommonTree)t.getChild(i));
		}
		*/
	}
	
	public Object plus(CommonTree t) {
		System.out.println("plus");
		int a = Integer.parseInt(symbolTable.getValue(t.getChild(0).getText()).toString());
		int b = Integer.parseInt(symbolTable.getValue(t.getChild(1).getText()).toString());
		
		//t.getToken().setText(Integer.toString(a + b));
		return a + b;
	}
	
	public void call(CommonTree t) {    	
		System.out.println("call");
		symbolTable.addScope();
		
		for (int i = 0; i < t.getChildCount(); i++)  
		{
			System.out.println(((CommonTree)t.getChild(i)).getText());
		  //System.out.println("here2 " + exec((CommonTree)t.getChild(i)));
		  exec((CommonTree)t.getChild(i));
		}
		
		symbolTable.removeScope();
	}
	
	public void everyDate(CommonTree t){
		System.out.println("every!");
		// First child is the Task/Date declaration -- TODO pass on as a declare statement?
		Date itterDate = null;
		String type = ((CommonTree)t.getChild(0)).getText();
		String name = ((CommonTree)t.getChild(0)).getChild(0).getText();
		symbolTable.addSymbol(name, type, itterDate);

		// Handling from/to/by only for now
		System.out.println("every! in symboltable");	
		Date start = (Date)exec((CommonTree)t.getChild(1));
		Date end = (Date)exec((CommonTree)t.getChild(2));
		TimeFrame inc = (TimeFrame)exec((CommonTree)t.getChild(3));
		// Define the itterDate
		itterDate = start;
		symbolTable.addSymbol(name, type, itterDate);

		System.out.println("itterDate: "+itterDate.toString() + " end: "+end.toString() + "compare" + itterDate.compareTo(end));
		while(itterDate.compareTo(end) <= 0)
		{
			System.out.println("LOOP: "+itterDate.toString());
			// nth Child is the Block to execute every loop
			exec((CommonTree)t.getChild(4));
			
			// Increment the itterDate and update symbolTable
			itterDate.add(inc);
			symbolTable.addSymbol(name, type, itterDate);
		}
	}
	
	public void everyTask(CommonTree t){
		
	}
	
	public Date from(CommonTree t){
		// This only handles DATE_CONSTANT
		return new Date(((CommonTree)t.getChild(0)).getText());
	}
	
	public Date to(CommonTree t){
		// This only handles DATE_CONSTANT
		return new Date(((CommonTree)t.getChild(0)).getText());
	}
	
	public TimeFrame by(CommonTree t){
		// This only handles timeFrameConstant
		String tf = "";
		for (int i = 0; i < t.getChildCount(); i++)  
		{
			tf = tf + " " + ((CommonTree)t.getChild(i)).getText();
		}		
		System.out.println("by: "+tf);
		return new TimeFrame(tf);
	}
	
	public void print(CommonTree t){
		System.out.println(t.getChild(0).getText());
	}
}
