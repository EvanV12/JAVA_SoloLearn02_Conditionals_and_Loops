package b_Nested_IF_and_ELSE_IF_Statements;

public class MyClass {

	public static void main(String[] args) {

		int age = 25;
		if (age > 0) {
			if (age > 16) {
				System.out.println("Welcome!");
			} else {
				System.out.println("Too Young");
			}
		} else {
			System.out.println("Error");
		}
		// Outputs "Welcome!"



		int age2 = 25;

		if (age2 <= 0) {
			System.out.println("Error");
		} else if (age2 <= 16) {
			System.out.println("Too Young");
		} else if (age2 <= 100) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Really?");
		}
		// Outputs "Welcome!"
	}
}

