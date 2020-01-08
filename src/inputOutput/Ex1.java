package inputOutput;

import java.io.FileWriter; // input-outout import.
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		// Creating the ability to write to a file.

//		FileWriter writer = null;
//
//		try {
//			writer = new FileWriter("c:\\Ofir arieli\\test.txt"); // gest a string that is the directory of a file.
//			writer.write("Testing the FileWriter object.\n");
//			writer.write("The other test.\n");
//			// writer.close(); // Mandatory for the writer operation to save the operation.
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		} finally { // Makes it so that the next actions will always happen.
//			try {
//				writer.close(); // writer.close() can also throw IOException.
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
//		}

		try (FileWriter writer = new FileWriter("c:\\Ofir arieli\\test.txt")) { // This is the above but shortened.
																				// Including the finally with close.
			// try (FileWriter writer = new FileWriter("c:\\Ofir arieli\\test.txt, true")) {
			// // The FileWriter ctor can be overloaded with a boolean expression that asks
			// if the operation is of "append" --> aka adding text rather than re-writing
			// text.
			writer.write("Testing the FileWriter object.\n");
			writer.write("The other test.\n");
			writer.write(36); // This gets a Unicode value of a char.
			writer.write("\n500\n"); // This will write a number to the file.
			int x = 100;
			writer.write(String.valueOf(x));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} // Any operation that is "closable" can be defined using this try() block.
	}
}
