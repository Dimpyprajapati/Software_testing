package Assignment;

//* Remove the third element from a array list.  *//

import java.util.ArrayList;
import java.util.List;

public class Remove_thirdElement {
	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("audi");
		listStrings.add("BMW");
		listStrings.add("Bugatti");
		listStrings.add("ford");
		listStrings.add("Honda");
		listStrings.add("Hyundai");
		System.out.println(listStrings);
		
		listStrings.remove(2);
		System.out.println("After removing third element from the list : " +listStrings);
	}
}
