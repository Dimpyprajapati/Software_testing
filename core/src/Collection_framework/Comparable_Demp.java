package Collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class phone implements Comparable<phone> {
	int price;
	String model;
	
	phone(int price, String model) {
		this.price = price;
		this.model = model;
	}
	
	public int getprice() {
		return price;
	}
	
	@Override
	public int compareTo(phone s) {
		if(this.getprice()>s.getprice()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "phone [price=" + price + ", model=" + model + "]";
	}
}
public class Comparable_Demp {
	public static void main(String[] args) {
		phone p1 = new phone(10000, "Samsung");
		phone p2 = new phone(90000, "Dell");
		phone p3 = new phone(40000, "Redmi");
		phone p4 = new phone(70000, "Oppo");
		phone p5 = new phone(60000, "Apple");
		List<phone>list = new ArrayList<phone>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		System.out.println(list);
	
		Collections.sort(list);
		for(phone p : list) {
			System.out.println(p);
		}
	}
  }

