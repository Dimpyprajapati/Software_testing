package core;

import java.util.Scanner;

public class multidimentional {
	  public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter row size : ");
		  int rows = sc.nextInt();
		  System.out.println("Enter cols size : ");
		  int cols = sc.nextInt();
		  
		  int marks[][] = new int[rows][cols];
		  
		  System.out.print("Enter value in marks : ");
		  for(int i=0; i<marks.length; i++) {
			  for(int j=0; j<marks.length; j++) {
				  marks[i][j] =sc.nextInt();
				}
			}
		  for(int i=0; i<marks.length; i++) {
			  for(int j=0; j<marks.length; j++) {
				  System.out.print(marks[i][j] + " " );
			   }
			  System.out.println();
		  }
	}
		  
		  
		  
		  
		  
		  
		  
		  
	  }		  