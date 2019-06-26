package f_FOR_Loops;

public class MyClass {

	public static void main(String[] args) {
		
		/*
		for (initialization; condition; increment/decrement) {
			statement(s)
		}
		*/
		
		for (int x=1; x<=5; x++) {
			System.out.println(x);
		}
		/*
		 Outputs
		 1
		 2
		 3
		 4
		 5
		 */
		
		for (int y=0; y<=10; y=y+2) {
			System.out.println(y);
		}
		/*
		 0
		 2
		 4
		 6
		 8
		 10
		 */

	}

}
