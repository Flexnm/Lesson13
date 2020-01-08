package inputOutputObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObIO {
	public static void main(String[] args) {

		Car car1 = new Car("Subaro", "Blue", 1980, true);
		// System.out.println(car1);

		try (FileOutputStream fos = new FileOutputStream("car.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(car1);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
