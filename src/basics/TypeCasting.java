package basics;

public class TypeCasting {

	public static void main(String[] args) {

		/**
		 * Type casting is when you assign a value of one primitive data type to another type.
		 * 
		 * There're two types of "type casting":
		 * 
		 * 1. widening Casting: converting from smaller number to larger number size
		 * byte -> short -> char -> int -> long -> float -> double
		 * 
		 * 2. Narrowing Casting: converting from larger number to a shorter number size
		 * double -> float -> long -> int -> char -> short -> byte
		 * 
		 * 
		 */

		// Ex: widening casting:
		int myInt = 10;
		double myInt2 = myInt;
		System.out.println(myInt);
		System.out.println(myInt2);
		
		
		
		System.out.println("=========");

		
		
		// Ex: Narrowing casting
		double myDbl = 10.0;
		int myDblToInt = (int) myDbl;
		System.out.println(myDbl);
		System.out.println(myDblToInt);

	}

}
