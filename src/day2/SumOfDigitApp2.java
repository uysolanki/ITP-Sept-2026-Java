//sum of digits till it reduces to a single digit
package day2;

import java.util.Scanner;

public class SumOfDigitApp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);				//ctrl shift O (orange)
		
		System.out.println("Please enter a number");
		
		int n=sc.nextInt();		//n=7777,28	,10	,1
		while(n>9)		//is 1>9 true
		{
			int sum=0;		//sum=0,1
			while(n>0)
			{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			}						//sum=28
		
			n=sum;
		}
		
		System.out.println(n);

	}

}
