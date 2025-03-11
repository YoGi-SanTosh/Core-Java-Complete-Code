package StringConcept14Feb2025;

public class UseOfConcat {

	public static void main(String[] args) {

		String input ="Santosh";
		System.out.println(input.concat(" Kumar Yogi"));
		
		String i2 ="Are";
		String i1 ="students";
		String i3 ="good";
		System.out.println(i1.concat(i2).concat(i3));//without spaces
		
		System.out.println(i1.concat(" ").concat(i2).concat(" ").concat(i3));//with spaces	
		
		String a="manish kumar tiwari";
		
		boolean b1=a.contains("tiwari");
		System.out.println(b1);
		
		boolean b2=a.contains("shyam");
		System.out.println(b2);

	}
}
