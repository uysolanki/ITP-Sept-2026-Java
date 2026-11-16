package day4;

import java.util.Scanner;

public class Chocolates2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int strength=5;
	int sum=0;				//peon=0
	int i;
	for(i=1;i<=strength;i++)					//i				sum							chocolate
	{											//1				0							30
		System.out.println("Roll Number " + i + " how many chocolates have you bought?");
		int chocolate=sc.nextInt();				//2  2<=5 T     15							25
		sum=sum+chocolate;						//3  3<=5 T   	25							5						
	}											//4	 4<=5 T		30							20
												//5	 4<=5 T		50							1
	System.out.println("The sum is "+sum);		//6	 6<=5 F		51
}												
}
