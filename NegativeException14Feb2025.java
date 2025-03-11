package ExceptionHandlinginJava11Feb25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NegativeException14Feb2025 {

	public static void main(String[] args) {

	try
	{
	Scanner sa1=new Scanner(System.in);
	System.out.println("please enter the size of array");
		int rollno[]=new int [sa1.nextInt()];
	}
	//catch(Exception a1)
	catch(NegativeArraySizeException a1)
	{
		Scanner sa1=new Scanner(System.in);
		System.out.println("please make sure that the size of array is positive");
			int rollno[]=new int [sa1.nextInt()];

	}
	catch(InputMismatchException a1)
	{
	
	}
	}

}
