package Collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_demo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Java");
		map.put("c++", 2);
		map.put(3, "selenium");
		map.put(null, "Python");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : " +entry.getKey());
			System.out.println("value : " +entry.getValue());
		}
	}
}
