package Assignment;

//*  Iterate through all elements in an array list. *//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterate_arraylist {
	public static void main(String[] args) {
		List <String> aList= new ArrayList<String>();
		aList.add("Ved");
		aList.add("Ayan");
		aList.add("Taxshavi");
		aList.add("Krisha");
		aList.add("Nancy");
		Iterator i = aList.iterator();
		System.out.println("The arrayList elements are : ");
		for (String element : aList) {
			System.out.println(element);
		}
	}
}
