package inputOutputObjects;

import java.io.Serializable;

public class Car implements Serializable {

	/**
	 * SerialVersionUID is asked from the interface.
	 */
	private static final long serialVersionUID = 1L;
	private String model;
	private String color;
	private int year;
	private boolean isAutomatic;

	public Car(String model, String color, int year, boolean isAutomatic) {
		setModel(model);
		setColor(color);
		setYear(year);
		setAutomatic(isAutomatic);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	@Override
	public String toString() {
		return "Car[Model: " + model + ", Color: " + color + ", Year: " + year + ", Automatic: " + isAutomatic + "]";
	}

}
