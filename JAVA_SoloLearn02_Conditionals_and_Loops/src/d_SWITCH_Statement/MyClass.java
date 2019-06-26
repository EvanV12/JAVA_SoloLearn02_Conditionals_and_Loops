package d_SWITCH_Statement;

public class MyClass {

	public static void main(String[] args) {
		
		/*
		switch (expression) {
		case value1:
			//Statements
			break;	//optional
		case value2:
			//Statements
			break;	//optional
		//	You can have any numver of case statements.
		default: //Optional
			//Statements
		}
		*/
		
		int day = 3;
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		}
		// Outputs "Wednesday"
		
		int day2 = 3;
		
		switch (day2) {
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Weekday");
		}
		// Outputs "Weekday"

	}

}
