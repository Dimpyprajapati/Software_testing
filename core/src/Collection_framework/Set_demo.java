package Collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_demo {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add(1);
		set.add(45789);
		set.add("selenium");
		set.add(454);
		set.add(false);
		set.add(1);
		set.add("java");
		System.out.println(set);
		
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
