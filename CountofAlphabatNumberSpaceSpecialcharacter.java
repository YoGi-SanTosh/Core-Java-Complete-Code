package StringAndArrayConcept20Feb2025;

public class CountofAlphabatNumberSpaceSpecialcharacter {

	public static void main(String[] args) {
				int count_of_alphabet=0;
				int count_of_digit=0;
				int count_of_space=0;
			String s1="rocky 123 &";
		char c1[]=s1.toCharArray();
		for(int i=0;i<=c1.length-1;i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			boolean b2=Character.isDigit(c1[i]);
			boolean b3=Character.isWhitespace(c1[i]);
			if(b1==true)
			{
				count_of_alphabet++;
			}
			if(b2==true)
			{
				count_of_digit++;
			}
			if(b3==true)
			{
				count_of_space++;
			}
		}
		int countofspecialcharacter=s1.length()-(count_of_alphabet+count_of_digit+count_of_space);
		System.out.println("special charater are-> " + countofspecialcharacter);
		System.out.println("count of alphabet-> " + count_of_alphabet);
		System.out.println("count of digit->" + count_of_digit);
		System.out.println("count of space->" + count_of_space);
	}
}
