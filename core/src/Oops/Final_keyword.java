package Oops;

//Final keyword --> It is used to indicate that a variable holds a constant value.
//Final variable --> We cannot change value of variable.
//Final method --> Method cannot be override.
//Final class --> Class cannot be inherited.

final class AAA {
    final int i = 10;
	final public void cell() {
///		i++;
		System.out.println(" i = "+i);
	}	 
}

class B extends AAA {
	public void cell() {
		System.out.println("call in B class");
	}	
}

public class Final_keyword {
	public static void main (String args[]) {
		AAA a = new AAA();
		a.cell();
		B b  = new B();
		b.cell();
	}
}
