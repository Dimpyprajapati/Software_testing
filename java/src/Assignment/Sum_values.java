                  //* Sum values of an array. *//

package Assignment;

public class Sum_values 
  {
	public static void main(String args[]) 
	  {
		int arr[] = {5,6,7,8,9,10};
		int sum = 0;
		for (int i=0; i<arr.length; i++) 
		  {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		  }
		System.out.println("sum of all the elements of an array : " + sum);
	  }
  }
