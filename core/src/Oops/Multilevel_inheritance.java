package Oops;

class parent1Class {
    public void parent1Method() {
   	 System.out.println("Parent method1 calling");
    }
}
class Childclass extends parent1Class {
	 public void childMethod() {
		 System.out.println("Child method calling");
	 }
}
class GrandChildclass extends Childclass {
	 public void grandchildMethod() {
		 System.out.println("Grand Child method calling");
	 }
}

 public class Multilevel_inheritance {
	public static void main (String args[]) {
		GrandChildclass c = new GrandChildclass();
		c.parent1Method();
		c.childMethod();
		c.grandchildMethod();
	}
}

