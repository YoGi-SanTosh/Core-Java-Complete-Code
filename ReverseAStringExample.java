package StringConcept14Feb2025;

public class ReverseAStringExample {

	public static void main(String[] args) {

		String inputstring="SantoshKumarJogi";
		String OutputString="";
//writing the loop and looping in the reverse order a get the reverse string as a output  Mostly asked in interview 
		
		for(int i=inputstring.length()-1;i>=0;i--)
		{
		OutputString= OutputString + inputstring.charAt(i);

		}
		
		System.out.println(OutputString);

	}
}
