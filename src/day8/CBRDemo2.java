package day8;

public class CBRDemo2 {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30};
		System.out.println("Arr[0] = "+arr[0]);   //Arr[0] =10
		test(arr[0]);	//primitive  pass by value
		System.out.println("Arr[0] = "+arr[0]);   //Arr[0] =10
	}

	private static void test(int brr) {
		System.out.println("Brr = "+brr);  			//brr =10
		brr=99;
		System.out.println("Brr = "+brr);  		//brr =99
	}

}

//Arr[0] =10
//brr =10
//brr =99
//Arr[0] =10
