package Oops;

 class car {
	 int price;
	 String model;
	 public void carIsDriving() {
		 System.out.println("car is driven by object");
	 }
   }
 class Sportscar extends car {
	 String prime;
	 String autopilot;
	 public void autoDriver() {
		 System.out.println("auto driven car");
	 }
 }
 public class Single_inheritance {
	 public static void main(String args[]) {
		  Sportscar s = new Sportscar();
		  s.autoDriver();
		  s.carIsDriving();
		  s.model = "tesla";
		  System.out.println("s.model = tesla");
		}
	}
