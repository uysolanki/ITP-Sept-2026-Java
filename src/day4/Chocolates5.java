package day4;

import java.util.Scanner;

public class Chocolates5 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int strength=5;
	int sum=0;				//peon=0
	int i;
	for(i=1;i<=strength;i++)					
	{											
		System.out.println("Roll Number " + i + " how many chocolates have you bought?");
		int chocolate=sc.nextInt();				
		sum=sum+chocolate;												
		if(sum>=50)
			break;
	}											
	
	System.out.println("Deposited with the Peon is "+Math.min(50, sum));
	
	if(i!=6)	
		System.out.println("Extra " + (sum-50));
	
	else
		System.out.println("Short " + (50-sum));
}												
}
