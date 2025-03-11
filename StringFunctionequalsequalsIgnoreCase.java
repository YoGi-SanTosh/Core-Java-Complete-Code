package StringConcept14Feb2025;

public class StringFunctionequalsequalsIgnoreCase {

	public static void main(String[] args) {
	
		String input ="school";
		boolean b1=input.equals("school");
		System.out.println(b1);
		
		boolean b2=input.equalsIgnoreCase("SCHOOL");
		System.out.println(b2);
	}
}
