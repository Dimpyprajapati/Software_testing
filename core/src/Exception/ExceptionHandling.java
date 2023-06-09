package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//*Exception --> abnormal situation occurs at runtime.
// Try, Catch, Finally

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter i : ");
			int i = sc.nextInt();
			System.out.println("Enter j : ");
			int j = sc.nextInt();
			int k = i/j;
			System.out.println(k);
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Number cannot devided by zero");
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("denominator should be numeric value");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("Done");
		}
	 }
  }