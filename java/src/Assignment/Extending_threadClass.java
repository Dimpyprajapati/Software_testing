package Assignment;

//* create one thread by extending Thread class in another class.  *//

class Multi extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
}
public class Extending_threadClass {
	public static void main(String[] args) {
		Multi t1 = new Multi();
		t1.start();
	}	
}

