package Oops;

//Abstraction --> hiding internal details and showing only essential information 
//                to user.

abstract class RBI {
	 abstract public void interst();
	 abstract public void homeloan();
     public static void reporate() {
    	 System.out.println("repo rate 4+- %");
     }
  }
class SBI extends RBI {
	public void interst() {
		System.out.println("sbi interest : 5%");
	}
    @Override
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("sbi homeloan : 8%");
	}
}

class JAVA extends RBI {
	@Override
	public void interst() {
		// TODO Auto-generated method stub
		System.out.println("java interest : 7%");
	}
    @Override
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("java homeloan : 7%");
	}
}

public class Abstraction {
	public static void main(String args[]) {
		SBI s = new SBI();
		s.interst();
		s.homeloan();
		SBI.reporate();
		JAVA j = new JAVA();
		j.interst();
		j.homeloan();
		JAVA.reporate();
	}
}

