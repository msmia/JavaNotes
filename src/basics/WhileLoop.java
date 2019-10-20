package basics;

public class WhileLoop {

	// While loop looks for the condition first
	// Do while loop runs the code first and at the end of the run it checks the
	// condition.

	public static void main(String[] args) {

		
		// while loop
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			a ++;
		}
		
		
		// do loop
		int b = 0;
		do {
			System.out.println(b);
			b ++;
		} while (b < 10);
		
//		int a = 0;
//		boolean tf = true;
//		while (tf) {
//			System.out.println(a);
//			// array. first we check if the value already exists. if yes,
//			// get another value
//			// if no, we add the value
//			// we also keep checking array size. when it becomes 10, we use the aray value to complete the rest of the process.
//			a++;
//			if (a == 100) {
//				tf = false;
//			}
//		}

	}
}
