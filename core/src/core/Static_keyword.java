package core;

import java.util.Scanner;

class studentdata {
	static {
		System.out.println("static block in student class");
	}
	  int rollno;
	  String name;
	  static String cname = "Tops";
	  
	  studentdata(){
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter roll no : ");
		  rollno = sc.nextInt();
		  System.out.println("Enter name : ");
		  name = sc.next();
		}
	  public void showdata() {
		  System.out.println("rollno : " +rollno + " name : " +name + " cname : " +cname);
		}
	  public static void name() {
		  System.out.println("static method");
		}
 }

public class Static_keyword {
	static {
		System.out.println("static block in main method");
	  }
        public static void main(String args[]) {
        	studentdata s1 = new studentdata();
        	s1.showdata();
        	studentdata s2 = new studentdata();
        	s2.showdata();
        	studentdata.name();
        }
}
