package core;

import basic.Selenium_java.laptop;

class laptop {
	  int ram;
	  String model;
	  double price;
	  laptop(){
		  System.out.println("default constructor");
      }
	  laptop (int data) {
		  System.out.println("para int");
	  }
	  laptop (String data) {
		  System.out.println("para String");
	  }
}	 

public class Constructor {
       public static void main(String args[]) {
	  	  laptop l1 = new laptop();
       } 
}
		

