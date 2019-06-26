package c_Logical_Statements;

public class MyClass {

	public static void main(String[] args) {
		
		int age = 25;
		int money = 100;
		
		if (age > 18) {
			if (money > 500) {
				System.out.println("Welcome!");
			}
		}
		
		if (age > 18 && money > 500) {
			System.out.println("Welcome!");
		}
		
		
		if (age > 18 || money > 500) {
			System.out.println("Welcome!");
		}
		// Outputs "Welcome!"
		
		
		if (!(age > 18)) {
			System.out.println("Too Young");
		} else {
			System.out.println("Welcome");
		}
		// Outputs "Welcome"
	}
}

