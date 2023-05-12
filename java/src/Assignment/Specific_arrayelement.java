package Assignment;

//*  Update specific array element by given elements.  *//

import java.util.ArrayList;
import java.util.List;

public class Specific_arrayelement {
	public static void main(String[] args) {
		List<String> list_col = new ArrayList<String>();
		list_col.add("Black");
		list_col.add("White");
		list_col.add("Pink");
		list_col.add("Red");
		list_col.add("Green");
		System.out.println(list_col);
		
		list_col.set(1, "Orange");
		list_col.set(4, "Blue");
		System.out.println("Update specific array element is : " +list_col);
		
	}
}
