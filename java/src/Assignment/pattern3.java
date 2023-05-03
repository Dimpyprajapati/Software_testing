package Assignment;

  // 1
  // 01
  // 101
  // 0101
  // 10101
       
public class pattern3 {
	public static void main (String args[]) {
		int num = 6;
		for (int i=1; i<=6; i++)
		{
			for (int j=1; j<i; j++)
			{
				System.out.print(((i+j)%2)+" ");
			}
			   System.out.println();
		}
	}
}
