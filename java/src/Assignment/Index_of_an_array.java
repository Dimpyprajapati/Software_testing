              //*  Find the index of an array element.  *//

package Assignment;

public class Index_of_an_array {
	public static void main(String args[]) {
		int array[] = {10,11,12,13,14,15};
		int element = 12;
		int index = -1;
		for(int i=0; i<array.length; i++) {
			if (array[i] == element) {
				index = i;
				break;
			}
		}
		  System.out.println("index position of " +element+" is : " +index);
	}
}	
