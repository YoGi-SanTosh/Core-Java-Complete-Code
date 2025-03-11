package ExceptionHandlinginJava11Feb25;

import java.util.InputMismatchException;

public class NullPointerExceptiona14Feb25 {

	public static void main(String[] args) throws NullPointerException,InputMismatchException
	
	{
		if (1>3)
		{
			throw new NullPointerException();

		}
		else 
		{
			throw new InputMismatchException();
		}
		
	}

}
