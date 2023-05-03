package core;

//1. for;
//2. while;
//3. do while;
//4. for each;

//for (initialization;condition;increment,decrement) {
	// printing statement
	// }

//while (condition){
      // printing statement
      // }

import java.util.Scanner;

public class loop {
	public static void main(String_Demo args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i=0; i<=n; i++) {
			sum = sum+i;
			}
		System.out.println(sum);
	
		//for (int i=0; i<11; i++) {
		//	System.out.print(i);
		//}
		
		
		//int i = 0;
		//while (i<11) {
		//	System.out.print(i);
		//	i++;
		// }
		
		
		 //int i = 10;
		 //do {
		 // System.out.println(i);
		 //	 i--;
		 //   }
		 //while (i>=0);
	}
}
