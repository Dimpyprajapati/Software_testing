package Oops;

// Polymorphism --> poly(many),morphism(forms)
//                 [same method name but having different functionality]
// Two types --> 1. Method overloading,
//               2. Method overriding
// Method overloading --> same method name, different arguments into same class. 

class abc {
	public void add (int i) {
		System.out.println("first : " +i);
	}
	public void add(int i,int j) {
		System.out.println("first : " +(i+j));
	}
	public void add(int i,int j,String k) {
		System.out.println("first : " +(i+j)+k);
	}
}

public class Overloading {
	public static void main (String args[]) {
		abc a = new abc();
		a.add(3, 5, "java");
	}
}
