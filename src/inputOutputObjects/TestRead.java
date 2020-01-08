package inputOutputObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestRead {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("car.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Car c = (Car) ois.readObject();
			System.out.println(c);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
