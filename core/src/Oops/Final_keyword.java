package Oops;

//Final keyword --> It is used to indicate that a variable holds a constant value.
//Final variable --> We cannot change value of variable.
//Final method --> Method cannot be override.
//Final class --> Class cannot be inherited.

final class data {
    final int i = 12;
	final public void increment() {
		i++;
		System.out.println(i);
	}	 
}

class childdata extends data {
	public void increment() {
		System.out.println("child data method");
	}	
}

public class Final_keyword {
	public static void main (String args[]) {
		data d = new data();
		d.increment();
	}
}
