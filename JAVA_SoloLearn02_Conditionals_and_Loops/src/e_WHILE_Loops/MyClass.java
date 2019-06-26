package e_WHILE_Loops;

public class MyClass {

	public static void main(String[] args) {
		
		int x = 3;
		
		while ( x > 0) {
			System.out.println(x);
			x--;
		}
		/*
		Outputs
		3
		2
		1
		*/
		
		int y = 6;
		
		while (y < 10) {
			System.out.println(y);
			y++;
		}
		System.out.println("Loop ended");
		/* 
		 6
		 7
		 8
		 9
		 Loop ended
		  */
	}

}
