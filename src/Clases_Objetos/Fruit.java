package Clases_Objetos;

import java.util.ArrayList;

/**
 * Creation of the fruit class with its attributes and methods.
 * @author LAURA ALBA GONZALEZ
 *
 */
public class Fruit {
	
	public String name;
	private float averageWeight;
	public ArrayList<String> colors;
	/**
	 * 
	 * @param name. This parameter is the name of the fruit
	 * @param averageWeight. This parameter is the weight of the fruit
	 * @param colors. This parameter is the color of the fruit
	 */
	
	public Fruit (String name, float averageWeight, ArrayList<String> colors) {
		this.name= name;
		this.averageWeight= averageWeight;
		this.colors= colors;
	}
	
	public Fruit () {
		
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setAverageWeight(float averageWeight) {
		this.averageWeight= averageWeight;
	}
	public void setColors(ArrayList<String> colors) {
		this.colors= colors;
	}
	/**
	 * Returns the name of the fruit
	 * @return
	 */
	public String getName() {
		return name;
	}
	public float getAverageWeight() {
		return averageWeight;
	}
	public ArrayList<String> getColors(){
		return colors;
	}
	
}
