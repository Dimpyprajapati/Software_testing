package core;

//1.simple if
//2.if else
//3.nested if
//4.else if ladder
//5.switch case

import java.util.Scanner;

	public class Conditional_statement {
			public static void main(String_Demo[] args) {
			int a,b;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter value of a = ");
			a = sc.nextInt();
			System.out.println("enter value of b = ");
			b = sc.nextInt();
			
			if(a == b) {
				System.out.println("a is  eqaul to b");
			}
			
//1.simple if
			if(a>b) {
				System.out.println("yes a is greater than b");
			}
			
			//if else
			if(a>b) {
				System.out.println("a is greater than b");
			}
			else {
				System.out.println("b is greater than a");
			}
			
//3.nested if
			int age;
			System.out.println("enter age : ");
			age = sc.nextInt();
			if(age >= 18) {
				if(age <= 60) {
					System.out.println("You are eligible");
				}
				else {
					System.out.println("age is greataer than 18 but not less than 60");
				}
			}
			else {
				System.out.println("age is less than 18");
			}
			
//4.else if ladder
			int marks;
			System.out.println("enter marks : ");
			marks = sc.nextInt();
			if(marks<35) {
				System.out.println("fail");
			}
			else if(marks>=35 && marks<=50) {
				System.out.println("D grade");
			}
			else if(marks>=51 && marks<=70) {
				System.out.println("C grade");
			}
			else if(marks>=71 && marks<=80) {
				System.out.println("B grade");
			}
			else if(marks>=81 && marks<=90) {
				System.out.println("A grade");
			}
			else if(marks>=91 && marks<=100) {
				System.out.println("A+ grade");
			}
			else {
				System.out.println("Invalid Marks");
			}
			
//5.switch case
			int lang;
			System.out.println("Press 1. for English");
			System.out.println("Press 2. for Hindi");
			System.out.println("Press 3. for Gujarati");
			System.out.println("Enter your choice : ");
			lang = sc.nextInt();
			switch(lang){
			case 1:
				System.out.println("you selected English");
				break;
			case 2:
				System.out.println("you selected Hindi");
				break;
			case 3:
				System.out.println("you selected Gujarati");
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}

