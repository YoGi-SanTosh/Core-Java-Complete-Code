package StringAndArrayConcept20Feb2025;
import java.util.Arrays;
public class FindGivenStringAreAnagramOrNot20Feb25 {
	public static void main(String[] args) {
		String s1="cat";
		String s2="act";
		if(s1.length()!=s2.length())
		{
			System.out.println("The Given String are not Anagram");
		}
		else
		{
			System.out.println("Let's find out if they are anagram");
		}
		char c1[]= s1.toCharArray();
		char c2[]= s2.toCharArray();
		Arrays.sort(c1);//a,c,t
		Arrays.sort(c2);//c,a,t
		
		System.out.println("After sorting->");
		System.out.println(c1);
		System.out.println("After sorting->");
		System.out.println(c2);
		boolean b1=Arrays.equals(c1, c2);
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("It is Anagram");
		}
		else
		{
			System.out.println("it is not Anagram");
		}
	}

}
