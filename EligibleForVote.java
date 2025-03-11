package MethodAndOperatorOrVariable17Jan2025;

public class EligibleForVote {

	public static void main(String[] args) {

		int age=18;
		
		if (age>=18 && age<100)
		{
			
			System.out.println("Eligible for Vote");
		}
		
		else if (age<18 && age>0)
		{
			System.out.println("Not Eligible for Vote");
		}
		
	}

}
