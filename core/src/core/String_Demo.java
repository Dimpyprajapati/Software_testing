package core;

public class String_Demo {
            public static void main(String args[]) {
				 int i=5;
				 System.out.println(i);
				 char c[] = {'j','a','v','a'};
				 System.out.println(c[1]);
				 System.out.println(c);
				 String name="124java #$%";
				 System.out.println(name);
				 
				 String s1 = "ram";
				 String s2 = "SAYAM";
				 
				 System.out.println(s1+s2);
				 System.out.println(s1.length());
				 System.out.println(s2.charAt(3));
				 System.out.println(s2.indexOf('M'));
				 System.out.println(s1.concat(s2));//addition
				 System.out.println(s2);
				 
				 System.out.println(s1.contains("how"));
				 System.out.println(s2.endsWith("M"));
				 
				 System.out.println(s1.compareTo(s2));
				 System.out.println(s2.compareToIgnoreCase(s1));
				 System.out.println(s1.equals(s2));
				 System.out.println(s2.equalsIgnoreCase(s1));
				 
				 String s3 = "    SITA    ";
				 String s4 = "";
				 System.out.println(s3.isBlank());
				 System.out.println(s4.isEmpty());
				 
				 System.out.println(s3.replace('T', 't'));
				 System.out.println(s3.toLowerCase());
				 System.out.println(s1.toUpperCase());
				 System.out.println(s3.trim());
			}
}