package Assignment;

//*  Check given number is Armstrong or not? *//

import java.util.Scanner;

public class Armstrong_number {
	public static void main(String[] args) {
		int n, arm=0,rem;
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in); 
	    n = sc.nextInt();
	   
	    int c = n;
	    while(n>0)
	    {
	    	rem = n%10;
	    	arm = (rem*rem*rem)+arm;
	    	n = n/10;
	    }
	    if(c==arm)
	    	System.out.println("Armstrong number");
	    else
	    	System.out.println("Not Armstrong number");   
	}
}
