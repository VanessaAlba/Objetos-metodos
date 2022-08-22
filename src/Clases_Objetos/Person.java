package Clases_Objetos;

import java.util.Date;
/**
 * Creation of the person class with its attributes and methods.
 * @author LAURA ALBA GONZALEZ
 *
 */
public class Person {
	
		public String name;
		public String lastName1;
		public String lastName2;
		public Date dateBirth; 
		public float height;
		
		/**
		 * 
		 * @param name. This parameter is the name of the person
		 * @param lastName1. This parameter is the person's first surname
		 * @param lastName2. This parameter is the second surname of the person
		 * @param dateBirth. This parameter is the date of birth
		 * @param height. This parameter is the height of the person
		 */
		
		public Person(String name,String lastName1, String lastName2, Date dateBirth, float height) {
			this.name = name;
			this.lastName1 = lastName1;
			this.lastName2 = lastName2;
			this.dateBirth = dateBirth;
			this.height = height;
		}
		
		public Person() {
			
		}
		
		public void setName (String name) {
			this.name = name;
		}
		public void setLastName1(String lastName1) {
			this.lastName1= lastName1;
		}
		public void setLastName2(String lastName2) {
			this.lastName2= lastName2;
		}
		public void setDateBirth(Date dateBirth) {
			this.dateBirth= dateBirth;
		}
		public void setHeight(float height) {
			this.height= height;
		}
		/**
		 * Returns the name of the person
		 * @return
		 */
		public String getName() {
			return name;
		}
		public String getLastName1() {
			return lastName1;
		}
		public String getLastName2() {
			return lastName2;
		}
		public Date getDateBirth() {
			return dateBirth;
		}
		public float getHeight() {
			return height;
		}

	}

