package Oops;

//import java.util.Scanner;

//Encapsulation --> to wrapping data into single unit.

class laptop {
	private int ram; // --> data is private means data hiding.
	 String model;
	 double price;
	
//	public void setram(int ram) {
//		this.ram = ram;
//	}
//	public void setmodel(String model) {
//		this.model = model;
//	}
//	public void setprice(double price) {
//		this.price = price;
//	}
	
	public laptop (int ram, String model, double price) {
		this.ram = ram;
		this.model = model;
	    this.price = price;
	}
	
	public int getram() {
		return ram;
	}
	public String getmodel() {
		return model;
	}
	public double getprice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "ram : "+ram+" model : "+model+" price : "+price;
		// TODO Auto-generated method stub
	}
}

public class Encapsulation {
	public static void main(String args[]) {
		laptop l1 = new laptop (9, "lenovo", 45000.98);
		System.out.println(l1);
	    laptop l2 = new laptop (7, "hp", 78000.9);
		System.out.println(l2);
		laptop l3 = new laptop (8, "dell", 45000.98);
		System.out.println(l3);
		
//   laptop l1 = new laptop();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter ram : ");
//		int ram = sc.nextInt();
//		l1.setram(ram);
//		System.out.println("Enter model : ");
//		String model = sc.next();
//		l1.setmodel(model);
//		System.out.println("Enter price : ");
//		double price = sc.nextInt();
//		l1.setprice(price);
		
//		System.out.println(l1.getram());
//		System.out.println(l1.getmodel());
//		System.out.println(l1.getprice());
//		System.out.println(l1);
	}
}

