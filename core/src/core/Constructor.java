package core;

class cons {
	int l,b;
	cons() {
		System.out.println("default cons");
	}
	cons(int l, int b) {
		this.l = l;
		this.b = b;
		System.out.println("l = "+l+" b = "+b);
		System.out.println("area of rectangle = "+(l*b));
	}
	cons(double per){
		System.out.println("para");
	}
	cons(String name){
		System.out.println("para "+name);
	}
	cons(double per,int i){
		System.out.println("para with int : "+per+" i = "+i);
	}
	public void area() {
		System.out.println("area of rectangle = "+(l*b));
	}
}

class Rectangle{
	int l,b;
	Rectangle(cons c) {
		this.l = c.l;
		this.b = c.b;
	}
	public void area() {
		System.out.println("area of rectangle = "+(l*b));
	}
}

public class Constructor {
	public static void main(String[] args) {
		cons c = new cons(2,3);
		c.area();
		Rectangle r = new Rectangle(c);
		r.area();
	}
}
		

