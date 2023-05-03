package core;

 import java.util.Scanner;//import the scanner class
 class scanner
 {
		public static void main(String_Demo args[]) 
		{
          Scanner sc = new Scanner (System.in);
          
          System.out.println ("enter Your Name, Age, Gender, Phone number, salary");
          
          String name = sc.next();//string input
          int age=sc.nextInt();//numeric input
          char gender=sc.next().charAt(0);
          long phonenumber=sc.nextLong();//numeric input
          Double salary=sc.nextDouble();
         
          System.out.print ("Name:" +name);
          System.out.print ("Age:" +age);
          System.out.print ("Gender:" +gender);
          System.out.print ("Phone number:" +phonenumber);
          System.out.print ("Salary:" +salary);
        }
 }
