package columbia.plt.tt.interpreter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.runtime.RecognitionException;

public class TTMain {

	public static void main(String[] args) throws RecognitionException {
		try {

			FileInputStream fileStream = new FileInputStream(args[0]);
			Interpreter interpreter = new Interpreter();
			interpreter.interp(fileStream);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			e.printStackTrace();
		}
	}

}
