package StringConcept14Feb2025;

public class GetCharAtIndexAndTrim {

	public static void main(String[] args) {

		String a="school is good";
		String b="MANISH";
		System.out.println(a.toUpperCase());//convert the string value in Upper case
		System.out.println(b.toLowerCase());//convert the string value in lower case
		
		int a1 = a.length();//use of length to calculate the length of string
		System.out.println(a1);
		
		int b1 = b.length();
		System.out.println(b1);

		String c="ManishKumar";
		System.out.println(c.charAt(0));//use of "CharAt" to find the value of the given index
		System.out.println(c.charAt(4));
		String d="   students     are good    ";
		System.out.println(d);
		System.out.println(d.trim());//use of "trim" remove the space from before and after the String 
	}

}
