package Assignment;

//* demonstrate try catch block. *//

public class Try_catch_block {
	public static void main(String[] args) {
		int a = 6000;
		int b = 0;
		try {
			int c = a/b;
			System.out.println("The result is : " +c);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Number cannot devide by zero");
		}
		System.out.println("Done");	
	}
}
