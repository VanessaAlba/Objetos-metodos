package Clases_Objetos;
/**
 * Creation of the book class with its attributes and methods.
 * @author LAURA ALBA GONZALEZ
 *
 */
public class Product {
	
	private int idProduct;
	public float price;
	public int stock;
	/**
	 * 
	 * @param idProduct. This parameter is the product identifier
	 * @param price. This parameter is the price of the product
	 * @param stock. This parameter is the number of units in the warehouse
	 */
	public Product(int idProduct, float price, int stock) {
		this.idProduct= idProduct;
		this.price=price;
		this.stock=stock;
	}
	public Product() {
		System.out.printnln("Hola mundo");
	}
	public void setIdProduct(int idProduct) {
		this.idProduct=idProduct;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public void setStock(int stock) {
		this.stock=stock;
	}
	/**
	 * Returns the product identifier
	 * @return
	 */
	public int getIdProduct() {
		return idProduct;
	}
	public float getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	
}
