package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_exception {
	public void division() throws ArithmeticException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter i : ");
		int i = sc.nextInt();
		System.out.println("Enter j : ");
		int j = sc.nextInt();
		int k = i/j;
		System.out.println(k);
	}
	
public static void main(String[] args) {
	try {
		Throws_exception t = new Throws_exception();
		t.division();
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Number cannot divided by zero");
	} catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("Number should be numeric");
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
  }
}