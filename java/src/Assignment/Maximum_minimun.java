           //*  Find maximum and minimum value of an array.  *//

package Assignment;

public class Maximum_minimun {
	public static void main(String args[]) {
        int arr[] = {12,45,80,-9,6,89,50,90};
	    int min = arr[0];
	    int max = arr[0];
	
	for (int i=0; i<arr.length; i++) {
		if (arr[i] < min) {
			min = arr[i];
		}
		if (arr[i] > max) {
			max = arr[i];
		}
	}
	  System.out.println("Maximum value in the array is : " +max);
      System.out.println("Minimum value in the array is : " +min);
   }
}

	