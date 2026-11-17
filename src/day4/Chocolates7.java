package day4;

import java.util.Scanner;

public class Chocolates7 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int strength=5;
	int sum=0;				//peon=0
	int i;
	for(i=1;i<=strength;i++)					
	{											
		System.out.println("Roll Number " + i + " how many chocolates have you bought?");
		int chocolate=sc.nextInt();	
		
		if ( (i%2==1 && chocolate%3==0) || (i%2==0 && chocolate%5==0))
		{
		sum=sum+chocolate;												
		if(sum>=50)
			break;
		}
		else
		continue;
	}											
	
	System.out.println("Deposited with the Peon is "+Math.min(50, sum));
	
	System.out.println(i!=6?"Extra " + (sum-50):"Short " + (50-sum));
	
	
	
}												
}
/*						sum
 1 : 10                 0
 2 : 15					15
 3 : 6					21
 4 : 20					41
 5 : 10					41
 
 Deposit: 41
 short 9
 */
