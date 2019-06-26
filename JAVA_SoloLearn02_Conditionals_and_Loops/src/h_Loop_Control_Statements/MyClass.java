package h_Loop_Control_Statements;

public class MyClass {

	public static void main(String[] args) {
		
		int x = 1;
		
		while (x > 0) {
			System.out.println(x);
			if (x == 4) {
				break;
			}
			x++;
		}
		/*
		 Outputs
		 1
		 2
		 3
		 4
		 */
		
		
		for (int y=10; y<=40; y=y+10) {
			if (y == 30) {
				continue;
			}
			System.out.println(y);
		}
		/*
		 Outputs
		 10
		 20
		 40
		 */

	}

}
