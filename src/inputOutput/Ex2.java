package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
	public static void main(String[] args) {
		// FileReader

		try (FileReader reader = new FileReader("c:\\Ofir arieli\\test.txt")) {
			
			int c = reader.read();
			while(c != -1) {
				System.out.print((char)c);
				c = reader.read();
			}
		} catch (FileNotFoundException e) { // Throws an exception if the file does not exist.
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
