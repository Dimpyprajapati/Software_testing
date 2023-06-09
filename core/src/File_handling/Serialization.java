package File_handling;

//serialization --> To store any object level data.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" salary : "+salary;
	}
}
public class Serialization {
	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException 
	{
		Employee e1 = new Employee(1, "java", 45000.36);
		
		//To write data into file	
		FileOutputStream fos = new FileOutputStream("employee.txt");	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		System.out.println("Object written");
		
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee)ois.readObject();
		System.out.println(e);
	}
}
