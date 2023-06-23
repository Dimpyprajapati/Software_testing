package Collection_framework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_demo {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(-23);
		set.add(79512);
		set.add(0);
		set.add(-678);
		set.add(465);
		set.add(1);
		System.out.println(set);
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
