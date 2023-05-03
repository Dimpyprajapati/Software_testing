package extra;

class calling implements inter1, inter2 {
	public void interface3() {
		System.out.println("interface 3");
	}
	public void interface2() {
		System.out.println("interface 2");
	}
	public void interface1() {
		System.out.println("interface 1");
	}
}

public class Interface {
	public static void main (String args[]) {
		calling c = new calling();
		c.interface1();
		c.interface2();
		c.interface3();
		inter1.inter1call();
		inter2.inter2call();
		inter3.inter3call();	
	}
}
