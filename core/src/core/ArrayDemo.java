package core;

import java.util.Scanner;

public class ArrayDemo {
	    public static void main(String args[]) {
//	    	int rollno[]= {1,2,3,4,5,6,7,8,9,10};
//	    	  for(int index=0;index<rollno.length;index++)
//	    		  System.out.println(rollno[index]);
//	    	System.out.println("rollno:" +rollno[0]);
//	    	System.out.println("rollno:" +rollno[1]);
//	    	System.out.println("rollno:" +rollno[2]);
//	    	System.out.println("rollno:" +rollno[3]);
//	    	System.out.println("rollno:" +rollno[4]);
	    	
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter size of Array : "); 
	    	int size = sc.nextInt();
	    	int arr[] = new int[size];
	    	for(int index=0;index<arr.length;index++) {
	    	    System.out.println("enter value of arr ["+index+"] : ");
	    	    arr[index]=sc.nextInt();
	    	}
	    	
			int add=0;
			   for(int index=0;index<arr.length;index++) {
				   add = add + arr[index];
			   }
			System.out.println("Addition of element in array is : " +add);
			
			
			System.out.println("Enter num to search in array : ");
			int num = sc.nextInt();
			int Counter = 0;
			
			for(int index=0;index<arr.length;index++) {
				if(num == arr[index]) {
					Counter++;
				}
			}
			System.out.println(num+ "is repeated" +Counter+ "times");
			if(Counter !=0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
	  }
 }
