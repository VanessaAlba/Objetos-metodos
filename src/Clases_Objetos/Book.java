package Clases_Objetos;

/**
 * Creation of the book class with its attributes and methods.
 * @author LAURA ALBA GONZALEZ
 *
 */
public class Book {
	
	public String title;
	protected int year;
	public float price;
	
	/**
	 * 
	 * @param title. This parameter is the title of the book
	 * @param year. This parameter is the year of the book
	 * @param price. This parameter is the price of the book
	 */
	public Book(String title, int year, float price) {
		this.title= title;
		this.year=year;
		this.price=price;
	}
	public Book() {
		
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	/**
	 * Returns the name of the book
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public float getPrice() {
		return price;
	}

}
