package day8;

public class CBRDemo {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30};
		System.out.println("Arr[0] = "+arr[0]);   //Arr[0] =10
		test(arr);	//non primitive  pass by reference
		System.out.println("Arr[0] = "+arr[0]);   //Arr[0] =99
	}

	private static void test(int brr[]) {
		System.out.println("Brr[0] = "+brr[0]);  //Brr[0] =10
		brr[0]=99;
		System.out.println("Brr[0] = "+brr[0]);  //Brr[0] =99
	}

}

//Arr[0] =10
//Brr[0] =10
//Brr[0] =99
//Arr[0] =99
