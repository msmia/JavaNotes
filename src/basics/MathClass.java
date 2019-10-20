package basics;

public class MathClass {

	public static void main(String[] args) {

		int val1;
		int val2;

		// max
		val1 = 10;
		val2 = 11;
		// System.out.println(Math.max(val1, val2));

		// min
		val1 = 10;
		val2 = 11;
		// System.out.println(Math.min(val1, val2));

		// sqrt
		val1 = 64;
		// System.out.println(Math.sqrt(val1));

		// absolute
		val1 = -100;
		// System.out.println(Math.abs(val1));

		// random a number between min and max
		int min = 1;
		int max = 100;
		int range = max - min + 1;
		int rand = (int) (Math.random() * range) + min;
		// System.out.println(rand);

		// ceil = round up
		double dblVal = 100.01;
		// System.out.println("ceil: " + Math.ceil(dblVal));

		// floor round down
		dblVal = 100.01;
		// System.out.println("floor: " + Math.floor(dblVal));
	}

}
