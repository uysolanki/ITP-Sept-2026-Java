package day5;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Legal Delivery ? 1-Yes, 0-No");
		int legalDelivery=sc.nextInt();
		
		if(legalDelivery==1)
		{
			System.out.println("Pitching ? 1-OFF Side, 2-In Line , 3-ON Side");
			int pitching=sc.nextInt();
				if(pitching==1 || pitching==2)
				{
					System.out.println("Impact ? 1-In Line of Stumps, 2-Not In-Line of Stumps");
					int impact=sc.nextInt();
					if(impact==1)
					{
						System.out.println("Wickets Hitting ? 1- Yes , 2-No");
						int wicketsHitting=sc.nextInt();
						if(wicketsHitting==1)
							System.out.println("Out");
						else
							System.out.println("Not Out");
					}
					if(impact==2)
					{
						System.out.println("Offering a Shot ? 1-Yes, 2-No");
						int offeringAShot=sc.nextInt();
						if(offeringAShot==2)
						{
							System.out.println("Wickets Hitting ? 1- Yes , 2-No");
							int wicketsHitting=sc.nextInt();
							if(wicketsHitting==1)
								System.out.println("Out");
							else
								System.out.println("Not Out");
						}
					}
					
					
				}
				else
				{
					System.out.println("Not Out");
				}
		}
		
		else
		{
			System.out.println("Not Out");
		}
	}

}
