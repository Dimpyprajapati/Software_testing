package Exception;

//* throw and throws keyword 

public class Exceptiondemo {
	public void division(int a, int b)throws ArithmeticException 
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c = a/b;
			System.out.println(c);
		}
	}
    public static void main(String[] args) {
    	try {
    		Exceptiondemo p = new Exceptiondemo();
    		p.division(20,0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Number cannot divide by Zero");
		}
	}
 }	