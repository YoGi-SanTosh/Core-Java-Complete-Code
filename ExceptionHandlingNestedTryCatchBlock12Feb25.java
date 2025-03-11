package ExceptionHandlinginJava11Feb25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingNestedTryCatchBlock12Feb25 {

	public static void main(String[] args) {

		try
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Please Enter Your Age");
			int age = s1.nextInt();
			System.out.println("Your Age Is->" + age);
		}
		catch(InputMismatchException m1)
		{
			try
			{
				Scanner s1=new Scanner(System.in);
				System.out.println("Please Enter Your Age it must number only");
				int age = s1.nextInt();
				System.out.println("Your Age Is->" + age);

			}
			catch(InputMismatchException a1)
			{
				
				
			}
		}
	}

}
