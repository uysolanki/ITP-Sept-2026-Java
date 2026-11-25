package day7;

public class FunctionCallSequence {

	public static void main(String[] args) {
		System.out.println("I am in Main");     
		brazil();  //main in wakeup mode
		System.out.println("I am finally back in Main");
	}

	private static void brazil() {
		System.out.println("I am in Brazil");
		france(); //brazil in wakeup
		System.out.println("I am back in Brazil");
	}

	private static void france() {
		System.out.println("I am in France");
	}
}
//I am in Main
//I am in Brazil
//I am in France
//I am back in Brazil
//I am finally back in Main