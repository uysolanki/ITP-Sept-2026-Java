package day3;

public class ArmstrongNumber3 {
	
	public static void main(String[] args) {
		int n=1;									//n				bu				nod		sum		rem
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
		

		System.out.println(sum==n?n+ " is Armstrong":n+ " is NOT Armstrong");
		
}
}


//?:
//accept a number from user and check whether it is armstrong number or not
//153   noofdigits=3

//1          5           3
//1   +      125   +     27


//1536  noofdigits=4
//1           5          3         6
//1     +     625     +  81   +   1296
