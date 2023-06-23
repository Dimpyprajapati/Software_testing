package Collection_framework;

import java.util.ArrayList;
import java.util.List;

class users {
	private int id;
	private String name;
	private double value;
	private String city;
	users(int id,String name,double value,String city) {
		this.id=id;
		this.name = name;
		this.value = value;
		this.city = city;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + ", value=" + value + ", city=" + city + "]";
	}
}
public class ListPractical_demo {
	public static void main(String[] args) {
		users u1 = new users(1, "Krisha",   45.89,  "botad");
		users u2 = new users(2, "Ved",      789.36, "Ahmedabad");
		users u3 = new users(3, "Taxshavi", 586.2,  "Surat");
		users u4 = new users(4, "Ayan",     78.36,  "Baroda");
		users u5 = new users(5, "Dev",      963.25, "surat");
		List<users> list = new ArrayList<users>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
        System.out.println(list);
		for(users u :list) {
			System.out.println(u);
		}
	}
}
