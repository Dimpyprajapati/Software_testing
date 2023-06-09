package Oops;

//Method overriding --> same method name,same argument into same class & 
//                      parent child relation should be there. 

class pclass {
      public pclass() {
          System.out.println("cons");
      }
      public void call() {
          System.out.println("parent calling");
      }
 }

class cclass extends pclass {
      public cclass() {
           System.out.println("child cons");
        }
      public void call() {
           System.out.println("child calling");
           super.call();//in method overriding to call parent class method-->super.
        }
  }

public class Overriding {
	public static void main(String args[]) {
		cclass c = new cclass(); 
		c.call();
		}
	}
