package day7;

public class CBVDemo {

	public static void main(String[] args) {
		
		int a=10;
		System.out.println("A = "+a);   //A=10
		test(a);
		System.out.println("A = "+a);   //A=10
	}

	private static void test(int z) {
		System.out.println("Z = "+z);   //Z=10
		z=99;
		System.out.println("Z = "+z);   //Z=99
	}

}

//A=10
//Z=10
//Z=99
//A=10
