package StringAndArrayConcept20Feb2025;

public class StringMethods25feb25 {

	public static void main(String[] args) {
//string is immutable in nature that's why we can't change string value
		String s1 =new String("santosh");
		s1.concat("Kumar Tiwari");
		System.out.println(s1);
		
//string is mutable in nature that's why we have to change string value		
			StringBuilder s2=new StringBuilder("manish");
			s2.append(" kumar tiwari");
			System.out.println(s2);
					
	}

}
