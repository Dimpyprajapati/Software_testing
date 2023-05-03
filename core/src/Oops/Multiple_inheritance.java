package Oops;

  class p1 {
	public void run() {
  }
    }

  class p2 {
	public void run() {
		
	  }
   }

  class child extends p1,p2 {
	
  }

public class Multiple_inheritance {
	public static void main(String args[]) {
		child c = new child();
		c.run();
	  }
  }
