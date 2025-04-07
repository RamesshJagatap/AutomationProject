package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class FirstJava {

	/* Advantages of Print Statements */

	// Debugging and error detection
	// Testing and validation
	// Monitoring program execution

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("First Java");

		System.out.printf("Java is language, Java is programming language");
		System.out.println();
		System.out.printf("%s is completed btech and empId is %d and visa status is %b", "Ramesh", 123, false);
		System.out.println();

		// join multiple statements together
		System.out.append("Parent>>").append("Child");
		System.out.println();

		// Join the character based ASCII value
		System.out.write(65);

		// Use of PrintWriter
		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\src\\log.txt");
		writer.println("Using Printwriter");
		writer.close();

		// Use of Logger
		Logger Log = Logger.getLogger("Test");
		Log.info("current line is 36");
		Log.warning("This is warning msg from Logger");
	}

}

/*
 * This is the Multiline Comment
 */

// Single Line Comment
