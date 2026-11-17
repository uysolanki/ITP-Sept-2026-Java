package day3;

import java.util.Scanner;

public class ArmstrongNumber5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int bu=n;									//153			153				0
													//				15				1
		int nod=0;									//				1				2
													//				0				3
		while(bu>0)				//is 0>0 true						153						0
		{											//												3
			nod++;
			bu=bu/10;								//										27
		}											//              15                      152     5
													//				1                       153     1
		bu=n;										//				0
		int sum=0;
		while(bu>0)
		{
			int rem=bu%10;
			sum=sum+(int)Math.pow(rem, nod);
			bu=bu/10;
		}
		
		if(sum==n)
		{
			System.out.println(n+ " is Armstrong");
		}
		else
		{
			System.out.println(n+ " is NOT Armstrong");
		}
		
		System.out.println("do you wish to continue 1-Yes, 0-No");
		choice=sc.nextInt();
		
		}while(choice==1);
		
		System.out.println("Shutdown...");
		
		
}
}

//accept a number from user and check whether it is armstrong number or not
//153   noofdigits=3

//1          5           3
//1   +      125   +     27


//1536  noofdigits=4
//1           5          3         6
//1     +     625     +  81   +   1296
