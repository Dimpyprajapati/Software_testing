package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_demo {
	public static void main(String[] args) {
	//	int i[] = {1,2,3,4,5,6};
	//	for (int index=0; index<i.length; index++) {
	//		System.out.println(i[index]);		
	//	}
		List list = new ArrayList();
		list.add(1);
		list.add("Java");
		list.add("a");
		list.add(false);
		list.add(1234);
		list.add(45.4);
		list.add(1);
		System.out.println(list);
		System.out.println("size of list : " +list.size());
		
		list.add(3);
		System.out.println(list);
		System.out.println("size of list : " +list.size());
		
		list.remove(3);
		System.out.println(list);
		System.out.println("size of list : " +list.size());
		
		list.add("Hello java");
		System.out.println(list);
		System.out.println("size of list : " +list.size());
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
