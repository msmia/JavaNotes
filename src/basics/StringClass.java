package basics;

public class StringClass {

	public static void main(String[] args) {
		
		String strName;
		String val;
		String val2;

		// Length
		strName = "John";
		System.out.println("Length: " + strName.length());

		// Upper case
		strName = "John";
		System.out.println("Upper case: " + strName.toUpperCase());

		// lower case
		strName = "JOHN";
		System.out.println("Lower case: " + strName.toLowerCase());

		// Find a character in a string using "indexOf()"
		// indexOf returns 0 base value
		val = "This is a string.";
		System.out.println("Character 'a' at index: " + val.indexOf("a"));
		
		// concat method
		val = "This is a ";
		val2 = "string";
		System.out.println(val.concat(val2));
		
		// escape double quotes
		val = "Find this \"this\"";
		System.out.println(val);

		// escape backward slash
		val = "I should see a backward slash: \\";
		System.out.println(val);
		
		// single quote escape
		val = "It's Friday";
		System.out.println(val);
		
		
		
	}

}
