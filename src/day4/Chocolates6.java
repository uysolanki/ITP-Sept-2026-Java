package day4;

import java.util.Scanner;

public class Chocolates6 {
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
	
	System.out.println(i!=6?"Extra " + (sum-50):"Short " + (50-sum));
	
	System.out.println(i!=6?"Extra " + (sum-50):"Short " + (50-sum));
	
}												
}
