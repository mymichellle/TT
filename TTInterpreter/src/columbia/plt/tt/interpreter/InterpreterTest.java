package columbia.plt.tt.interpreter;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.TokenStream;

import columbia.plt.tt.TTLexer;
import columbia.plt.tt.TTParser;
import columbia.plt.tt.datatype.Date;

import junit.framework.TestCase;

public class InterpreterTest extends TestCase {

	private Interpreter interpreter;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	protected void setUp() throws Exception {
		super.setUp();
		interpreter = new Interpreter();
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		interpreter = null;
	    System.setOut(null);
	    System.setErr(null);
	}
	
	public void testLoops()
	{
		try {

			FileInputStream fileStream = null;
			fileStream = new FileInputStream("src/columbia/plt/tt/programs/Loops.tt");
			interpreter.interp(fileStream);
			
			// Compare the actual output with the expected output
			String[] programOut = outContent.toString().split("\n");
			assertEquals(programOut[0], "2013.01.01.00.00");
			assertEquals(programOut[1], "2013.01.02.00.00");
			assertEquals(programOut[2], "2013.01.03.00.00");
			assertEquals(programOut[3], "Name: temp, Start: 2013.01.01.00.00, End: 2013.01.01.04.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[4], "Name: temp, Start: 2013.01.02.00.00, End: 2013.01.02.04.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[5], "Name: temp, Start: 2013.01.03.00.00, End: 2013.01.03.04.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[6], "Show Tasks between 2013.01.01.12 and 2013.01.02.01");
			assertEquals(programOut[7], "Name: temp, Start: 2013.01.02.00.00, End: 2013.01.02.04.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[8], "Name: temp, Start: 2013.01.03.00.00, End: 2013.01.03.04.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[9], "Show eat tasks");
			assertEquals(programOut[10], "Name: eat, Start: 2013.01.05.12.00, End: 2013.01.05.13.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[11], "Name: eat, Start: 2013.01.07.20.00, End: 2013.01.07.22.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[12], "Show temp tasks from the 3rd to the 7th");
			assertEquals(programOut[13], "Name: temp, Start: 2013.01.03.00.00, End: 2013.01.03.04.00, Location: , Priority: -1, Description: ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testIfElse()
	{
		FileInputStream fileStream = null;
		try {

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/ifelse.tt");
			interpreter.interp(fileStream);
			
			String[] programOut = outContent.toString().split("\n");
			assertEquals(programOut[0], "YES n is in range");
			assertEquals(programOut[1], "c is less than d");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testDeclare()
	{
		FileInputStream fileStream = null;
		try {

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/declaredefine.tt");
			interpreter.interp(fileStream);
			
			String[] programOut = outContent.toString().split("\n");
			assertEquals(programOut[0], "2013.01.01.00.00");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testMethods()
	{
		FileInputStream fileStream = null;
		try {

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/methods.tt");
			interpreter.interp(fileStream);
			
			// Nothing is printed in this test
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testOperator()
	{
		FileInputStream fileStream = null;
		try {

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/operator.tt");
			interpreter.interp(fileStream);

			String[] programOut = outContent.toString().split("\n");
			assertEquals(programOut[0], "2013.01.01.03.00");
			assertEquals(programOut[1], "Years: 0, Months: 0, Weeks: 0, Days: 2, Hours: 1, Minutes: 0");
			assertEquals(programOut[2], "2013.01.03.04.00");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testProgram1()
	{
		FileInputStream fileStream = null;
		try {

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/Program1.tt");
			interpreter.interp(fileStream);

			// Nothing is printed in this test
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testTutorial_MeetingTime()
	{
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream("src/columbia/plt/tt/programs/tutorial_MeetingTime.tt");
			interpreter.interp(fileStream);

			String[] programOut = outContent.toString().split("\n");
			
			
			assertEquals(programOut[0], "Name: Meeting, Start: 2013.05.16.00.00, End: 2013.05.16.01.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[1], "Name: Meeting, Start: 2013.05.16.00.30, End: 2013.05.16.01.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[2], "Name: Meeting, Start: 2013.05.16.01.00, End: 2013.05.16.02.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[3], "Name: Meeting, Start: 2013.05.16.01.30, End: 2013.05.16.02.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[4], "Name: Meeting, Start: 2013.05.16.02.00, End: 2013.05.16.03.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[5], "Name: Meeting, Start: 2013.05.16.02.30, End: 2013.05.16.03.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[6], "Name: Meeting, Start: 2013.05.16.03.00, End: 2013.05.16.04.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[7], "Name: Meeting, Start: 2013.05.16.03.30, End: 2013.05.16.04.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[8], "Name: Meeting, Start: 2013.05.16.04.00, End: 2013.05.16.05.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[9], "Name: Meeting, Start: 2013.05.16.04.30, End: 2013.05.16.05.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[10], "Name: Meeting, Start: 2013.05.16.05.00, End: 2013.05.16.06.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[11], "Name: Meeting, Start: 2013.05.16.05.30, End: 2013.05.16.06.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[12], "Name: Meeting, Start: 2013.05.16.06.00, End: 2013.05.16.07.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[13], "Name: Meeting, Start: 2013.05.16.06.30, End: 2013.05.16.07.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[14], "Name: Meeting, Start: 2013.05.16.07.00, End: 2013.05.16.08.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[15], "Name: Meeting, Start: 2013.05.16.07.30, End: 2013.05.16.08.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[16], "Name: Meeting, Start: 2013.05.16.08.00, End: 2013.05.16.09.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[17], "Name: Meeting, Start: 2013.05.16.08.30, End: 2013.05.16.09.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[18], "Name: Meeting, Start: 2013.05.16.12.30, End: 2013.05.16.13.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[19], "Name: Meeting, Start: 2013.05.16.13.00, End: 2013.05.16.14.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[20], "Name: Meeting, Start: 2013.05.16.16.30, End: 2013.05.16.17.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[21], "Name: Meeting, Start: 2013.05.16.17.00, End: 2013.05.16.18.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[22], "Name: Meeting, Start: 2013.05.16.17.30, End: 2013.05.16.18.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[23], "Name: Meeting, Start: 2013.05.16.18.00, End: 2013.05.16.19.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[24], "Name: Meeting, Start: 2013.05.16.23.30, End: 2013.05.17.00.30, Location: , Priority: -1, Description: ");
			assertEquals(programOut[25], "Name: Meeting, Start: 2013.05.17.00.00, End: 2013.05.17.01.00, Location: , Priority: -1, Description: ");

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testTutorial_daysLeft()
	{
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream("src/columbia/plt/tt/programs/tutorial_daysLeft.tt");
			interpreter.interp(fileStream);

			String[] programOut = outContent.toString().split("\n");

			assertEquals(programOut[0], "Days until these events: ");
			assertEquals(programOut[1], "Graduation Ceremony!");
				//Years: 0, Months: 0, Weeks: 0, Days: 10, Hours: -3, Minutes: -46
			assertEquals(programOut[3], "Memorial Day Weekend");
				//Years: 0, Months: 0, Weeks: 0, Days: 13, Hours: -13, Minutes: -46
			assertEquals(programOut[5], "4th of July");
				//Years: 0, Months: 2, Weeks: 0, Days: -8, Hours: -13, Minutes: -46
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testTutorial_HelloWorld()
	{
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream("src/columbia/plt/tt/programs/tutorial_HelloWorld.tt");
			interpreter.interp(fileStream);

			String[] programOut = outContent.toString().split("\n");
			assertEquals(programOut[0], "Name: Hello World!, Start: 2012.03.15.08.24, End: 2012.03.15.09.35, Location: CS lounge, Priority: -1, Description: ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testTutorial_RecurringTask()
	{
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream("src/columbia/plt/tt/programs/tutorial_RecurringTask.tt");
			interpreter.interp(fileStream);

			String[] programOut = outContent.toString().split("\n");
			assertEquals(programOut[0], "Name: AI, Start: 2013.01.22.14.40, End: 2013.01.22.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[1], "Name: PLT, Start: 2013.01.23.14.40, End: 2013.01.23.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[2], "Name: AI, Start: 2013.01.25.14.40, End: 2013.01.25.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[3], "Name: PLT, Start: 2013.01.28.14.40, End: 2013.01.28.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[4], "Name: AI, Start: 2013.01.29.14.40, End: 2013.01.29.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[5], "Name: PLT, Start: 2013.01.30.14.40, End: 2013.01.30.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[6], "Name: PLT, Start: 2013.02.04.14.40, End: 2013.02.04.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[7], "Name: AI, Start: 2013.02.05.14.40, End: 2013.02.05.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[8], "Name: PLT, Start: 2013.02.06.14.40, End: 2013.02.06.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[9], "Name: AI, Start: 2013.02.08.14.40, End: 2013.02.08.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[10], "Name: PLT, Start: 2013.02.11.14.40, End: 2013.02.11.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[11], "Name: AI, Start: 2013.02.12.14.40, End: 2013.02.12.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[12], "Name: PLT, Start: 2013.02.13.14.40, End: 2013.02.13.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[13], "Name: AI, Start: 2013.02.15.14.40, End: 2013.02.15.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[14], "Name: PLT, Start: 2013.02.18.14.40, End: 2013.02.18.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[15], "Name: AI, Start: 2013.02.19.14.40, End: 2013.02.19.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[16], "Name: PLT, Start: 2013.02.20.14.40, End: 2013.02.20.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[17], "Name: AI, Start: 2013.02.22.14.40, End: 2013.02.22.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[18], "Name: PLT, Start: 2013.02.25.14.40, End: 2013.02.25.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[19], "Name: AI, Start: 2013.02.26.14.40, End: 2013.02.26.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[20], "Name: PLT, Start: 2013.02.27.14.40, End: 2013.02.27.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[21], "Name: AI, Start: 2013.02.29.14.40, End: 2013.02.29.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[22], "Name: AI, Start: 2013.03.01.14.40, End: 2013.03.01.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[23], "Name: PLT, Start: 2013.03.04.14.40, End: 2013.03.04.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[24], "Name: AI, Start: 2013.03.05.14.40, End: 2013.03.05.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[25], "Name: PLT, Start: 2013.03.06.14.40, End: 2013.03.06.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[26], "Name: AI, Start: 2013.03.08.14.40, End: 2013.03.08.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[27], "Name: PLT, Start: 2013.03.11.14.40, End: 2013.03.11.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[28], "Name: AI, Start: 2013.03.12.14.40, End: 2013.03.12.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[29], "Name: PLT, Start: 2013.03.13.14.40, End: 2013.03.13.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[30], "Name: AI, Start: 2013.03.15.14.40, End: 2013.03.15.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[31], "Name: PLT, Start: 2013.03.18.14.40, End: 2013.03.18.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[32], "Name: AI, Start: 2013.03.19.14.40, End: 2013.03.19.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[33], "Name: PLT, Start: 2013.03.20.14.40, End: 2013.03.20.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[34], "Name: AI, Start: 2013.03.22.14.40, End: 2013.03.22.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[35], "Name: PLT, Start: 2013.03.25.14.40, End: 2013.03.25.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[36], "Name: AI, Start: 2013.03.26.14.40, End: 2013.03.26.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[37], "Name: PLT, Start: 2013.03.27.14.40, End: 2013.03.27.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[38], "Name: AI, Start: 2013.03.29.14.40, End: 2013.03.29.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[39], "Name: AI, Start: 2013.04.02.14.40, End: 2013.04.02.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[40], "Name: PLT, Start: 2013.04.03.14.40, End: 2013.04.03.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[41], "Name: AI, Start: 2013.04.05.14.40, End: 2013.04.05.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[42], "Name: PLT, Start: 2013.04.08.14.40, End: 2013.04.08.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[43], "Name: AI, Start: 2013.04.09.14.40, End: 2013.04.09.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[44], "Name: PLT, Start: 2013.04.10.14.40, End: 2013.04.10.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[45], "Name: AI, Start: 2013.04.12.14.40, End: 2013.04.12.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[46], "Name: PLT, Start: 2013.04.15.14.40, End: 2013.04.15.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[47], "Name: AI, Start: 2013.04.16.14.40, End: 2013.04.16.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[48], "Name: PLT, Start: 2013.04.17.14.40, End: 2013.04.17.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[49], "Name: AI, Start: 2013.04.19.14.40, End: 2013.04.19.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[50], "Name: PLT, Start: 2013.04.22.14.40, End: 2013.04.22.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[51], "Name: AI, Start: 2013.04.23.14.40, End: 2013.04.23.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[52], "Name: PLT, Start: 2013.04.24.14.40, End: 2013.04.24.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[53], "Name: AI, Start: 2013.04.26.14.40, End: 2013.04.26.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[54], "Name: PLT, Start: 2013.04.29.14.40, End: 2013.04.29.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[55], "Name: AI, Start: 2013.04.30.14.40, End: 2013.04.30.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[56], "Name: PLT, Start: 2013.04.31.14.40, End: 2013.04.31.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[57], "Name: PLT, Start: 2013.05.01.14.40, End: 2013.05.01.15.55, Location: 535 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[58], "Name: AI, Start: 2013.05.03.14.40, End: 2013.05.03.15.55, Location: 833 MUDD, Priority: -1, Description: ");
			assertEquals(programOut[59], "Name: PLT, Start: 2013.05.06.14.40, End: 2013.05.06.15.55, Location: 535 MUDD, Priority: -1, Description: ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testTutorial_scheduleTasks()
	{
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream("src/columbia/plt/tt/programs/tutorial_ScheduleTasks.tt");
			interpreter.interp(fileStream);
			

			String[] programOut = outContent.toString().split("\n");
			assertEquals(programOut[0], "Cannot add reviseTask anywhere in the Calendar");
			assertEquals(programOut[1], "Name: Study, Start: 2013.04.01.10.00, End: 2013.04.01.12.00, Location: , Priority: -1, Description: ");
			assertEquals(programOut[2], "Name: Meeting, Start: 2013.04.01.13.00, End: 2013.04.01.15.00, Location: , Priority: -1, Description: ");
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testTutorial_studyTime()
	{
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream("src/columbia/plt/tt/programs/tutorial_studyTime.tt");
			interpreter.interp(fileStream);

			String[] programOut = outContent.toString().split("\n");
			assertEquals(programOut[0], "Time spent studying Compilers: ");
			assertEquals(programOut[1], "Years: 0, Months: 0, Weeks: 0, Days: 0, Hours: 20, Minutes: 0");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
