package day8;

import java.util.Scanner;

public class PrimeUsingFunction8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Number");
		int num=sc.nextInt();								
															
		System.out.println(checkPrime(num)==0?num +" is Prime":num+ " is Not Prime");		
		
	}

	private static int checkPrime(int num) {
		for(int i=2;i<num;i++)
			if(num%i==0) return 1;
			
															
		return 0;											//cook
	}
}


//6
//1 2 3  = 6

//28
//1 + 2 + 4 + 7 +  14 = 28