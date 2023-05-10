package Assignment;

//*  Compute the sum of the first 100 prime numbers. *//

public class Sum_primenumber {
	public static void main(String[] args) {
		int sum = 1;
		int ctr = 0;
		int num = 0;
		while (ctr <100) {
			num++;
			if(num%2 !=0) {
				if(is_prime(num)) {
					sum += num;
					ctr++;
				}
			}
		}
		System.out.println("Sum of the first 100 prime numbers is : " +sum);
	}
		public static boolean is_prime(int num) {
			for(int i=3; i*i<=num; i+=2) {
				if(num %i ==0) {
					return false;
				}
			}
			return true;
	}
}
