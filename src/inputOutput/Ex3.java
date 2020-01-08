package inputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in);
				FileWriter writer = new FileWriter("c:\\Ofir arieli\\ClassEx.txt")) {
			System.out.print("Enter your first sentense: ");
			writer.write(scan.nextLine() + "\n");
			System.out.print("\nEnter your second sentense: ");
			writer.write(scan.nextLine() + "\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}