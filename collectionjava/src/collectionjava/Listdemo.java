package collectionjava;

import java.util.ArrayList;

public class Listdemo {
    public static void main(String args[])
    {
    	ArrayList<String> Name=new ArrayList<String>();
    	Name.add("dimple");
    	Name.add("Priya");
    	Name.add("Honey");
    	
    	System.out.println(Name);
    	Name.add("Nirali");//new name add last 
    	System.out.println(Name);
    	Name.add(1, "Kajal");//Dimple + new name kaJal add
    	System.out.println(Name);
    	Name.add(0, "Divya");//
    	System.out.println(Name);
    	Name.remove(1);//remove name dimple
    	System.out.println(Name);
    	Name.set(0, "Kinjal");//divYa name Change KinJal
    	System.out.println(Name);
    	Name.remove(1);//print one name
    	System.out.println(Name.get(2));
    	Name.clear();//all remove
    	System.out.println(Name);
    }
}
