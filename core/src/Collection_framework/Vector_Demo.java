package Collection_framework;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Demo {
	public static void main(String[] args) {
		Vector vr = new Vector();
		vr.add(1);
		vr.add(45789);
		vr.add("selenium");
		vr.add(454);
		vr.add(false);
		vr.add(1);
		vr.add("java");
		System.out.println(vr);
		System.out.println(vr.size());
		
		Enumeration em = vr.elements();
		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}

}
