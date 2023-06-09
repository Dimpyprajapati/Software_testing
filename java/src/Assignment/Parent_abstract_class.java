package Assignment;

//*   create an abstract class 'parent' with a method 'message'.It has two 
// subclass each having a method with the same name 'message' that prints "this 
// is first subclass" and "this is second subclass" respectively.
//       call the methods 'message' by creating an object for each subclass. //

class parentclass {
	public void parentmessage() {
		System.out.println("This is parent class");	
	}
}
class childclass extends parentclass {
	public void childmessage() {
		System.out.println("This is first subclass");
	}
}
class childclass2 extends parentclass {
	public void child2message() {
		System.out.println("This is second subclass");
	}
}
public class Parent_abstract_class {
	public static void main(String[] args) {
		System.out.println("PARENT CLASS OBJECT-------->");
		parentclass p = new parentclass();
		p.parentmessage();
		System.out.println("CHILD CLASS OBJECT--------->");
		childclass c = new childclass();
		c.childmessage();
		c.parentmessage();
		System.out.println("cHILD CLASS2 OBJECT--------->");
		childclass2 x = new childclass2();
		x.child2message();
		x.parentmessage();
	}
}
