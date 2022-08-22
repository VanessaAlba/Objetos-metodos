package Clases_Objetos;

/**
 * Creation of the car class with its attributes and methods.
 * @author LAURA ALBA GONZALEZ
 *
 */
public class Car {
	public String brand;
	public String licensePlate;
	public String color;
	private int price;
	
	/**
	 * 
	 * @param brand. This parameter is the car brand
	 * @param licensePlate. This parameter is the car plate
	 * @param color. This parameter is the color of the car
	 * @param price. This parameter is the price of the car
	 */
	public Car(String brand, String licensePlate, String color, int price) {
		this.brand= brand;
		this.licensePlate= licensePlate;
		this.color= color;
		this.price= price;
	}
	public Car() {
		
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setLicensePlate (String licensePlate) {
		this.licensePlate= licensePlate;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	/**
	 * returns the car make
	 * @return
	 */
	public String getBrand() {
		return brand;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	

}
