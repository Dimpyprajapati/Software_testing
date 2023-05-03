                //# Conditional Statement

//1. simple if;
//2. if else;
//3. nested if;
//4. else if ladder;
//5. switch case;

import java.util.Scanner;

public class conditionalstatement {
	public static void main(String args[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a=");
		a = sc.nextInt();
		System.out.println("Enter value of b=");
		b = sc.nextInt();
		 
		if(a==b) {
			System.out.println("a is Equal to b");
		}
		
//simple if
		
		if (a>b) {
			System.out.println("Yes a is grater than b");
		}
		
//if else
		
		if (a>b) {
			   System.out.println("a is grater than b");
		     }
			else {
				System.out.println("b is grater than a");
			 }
		
//Nested if
		
		int age;
		System.out.println("Enter age : ");
		age = sc.nextInt();
		if (age>=18) {
			if (age<=60) {
				System.out.println("You are Eligible");
			}
			else {
				System.out.println("age is grater than 18 but not 60");
			}
		}
		else {
			System.out.println("age is less than 18");
		}
		
//else if ladder
		
		int marks;
		System.out.println("Enter marks : ");
		marks = sc.nextInt();
		if (marks<35) {
			System.out.println("fail");
		}
		else if (marks>=35 && marks <=50) {
			System.out.println("D Grade");
		}
		else if (marks>=51 && marks <=70) {
			System.out.println("C Grade");
		}
		else if (marks>=71 && marks <=80) {
			System.out.println("B Grade");
		}
		else if (marks>=81 && marks <=90) {
			System.out.println("A Grade");
		}
		else if (marks>=91 && marks <=100) {
			System.out.println("A+ Grade");
		}
		else {
			System.out.println("Invalid Input");
		}
			
//switch case
		
		int lang;
		System.out.println("Press 1. for English");
		System.out.println("Press 2. for Hindi");
		System.out.println("Press 3. for Gujarati");
		System.out.println("Enter your choice : ");
		lang = sc.nextInt();
		switch (lang) {
		case 1 :
			System.out.println("You selected English");
		    break;
		case 2 :
			System.out.println("You selected Hindi");
			break;
	    case 3 :
	    	System.out.println("You selected Gujarati");
		    break;
		default :
			System.out.println("Invalid Input");
		}
	}
}	

