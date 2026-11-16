package day4;

public class Chocolates {
public static void main(String[] args) {
	
	
	int strength=5;
	int sum=0;				//peon=0
	int i;
	for(i=1;i<=strength;i++)				//i				sum
	{											//1				0
		sum=sum+i;								//2	 is 2<=5 T	1								
	}											//3	 is 3<=5 T	3
												//4	 is 4<=5 T	6
	System.out.println("The sum is "+sum);		//5	 is 5<=5 T	10
}												//6	 is 6<=5 F	15
}
