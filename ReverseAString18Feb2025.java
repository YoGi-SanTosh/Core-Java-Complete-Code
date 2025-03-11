package StringConcept14Feb2025;

public class ReverseAString18Feb2025 {

	public static void main(String[] args) {

		String input ="yash";
		String Reverse ="";//for storing the value
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			Reverse=Reverse+c1;
		}
			System.out.println(Reverse);
			if (input.equals(Reverse))
			{
				System.out.println("The given word are palindrome");
			}
			else
			{
				System.out.println("The given word are not palindrome");
		}
	}

}
