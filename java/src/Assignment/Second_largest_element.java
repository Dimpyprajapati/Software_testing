package Assignment;

public class Second_largest_element {
   public static void main(String args[]) {
		int[] a = {20,45,90,75,63,40,78,98};
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("second largest elements is : " +a[1]);
	}
}

