package Oops;

 class Parentclass {
	public void Parentmethod() {
	  System.out.println("parent method calling");
    }
}
 class Childclass1 extends Parentclass {
	public void child1method() {
		System.out.println("child1 method calling");
	}
}
 class childclass2 extends Parentclass {
	 public void child2method() {
		 System.out.println("child2 method calling");
	 }
 }	
 class childclass3 extends Parentclass {
	 public void child3method() {
		 System.out.println("child3 method calling");
	 }
 }	

 public class Hierarchical_inheritance {
	 public static void main(String args[]) {
		 System.out.println("PARENT CLASS OBJECT---------->");
		 Parentclass p = new Parentclass();
		 p.Parentmethod();
		 System.out.println("CHILD CLASS1 OBJECT----------->");
		 Childclass1 x = new Childclass1();
		 x.child1method();
		 x.Parentmethod();
		 System.out.println("CHILD CLASS2 OBJECT---------->");
		 childclass2 y = new childclass2();
		 y.child2method();
		 y.Parentmethod();
		 System.out.println("CHILD CLASS3 OBJECT---------->");
		 childclass3 z = new childclass3();
		 z.child3method();
		 z.Parentmethod();
	 }

}
