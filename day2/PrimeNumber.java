package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 13;
		boolean flag = false;
		for(int i=2; i<=input/2;i++) {
			if(input%i==0) {
				flag = true;
				
			}
			
		}
		if(!flag) {
			System.out.println("The given number " + input + " is prime number");
		}else {
			System.out.println("The given number " + input + " is not a prime number");
		}
	}

}
