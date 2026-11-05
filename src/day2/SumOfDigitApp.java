package day2;

public class SumOfDigitApp {

	public static void main(String[] args) {
		
		int n=123;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		
		System.out.println(sum);
		
		long mobile=8237307229L;

	}

}
