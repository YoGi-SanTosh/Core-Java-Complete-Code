package ExceptionHandlinginJava11Feb25;

public class ExceptionHandlingTryCatchFinallyBlock13Feb25 {

	public static void main(String[] args) {

		try
		{
			int a=1/1;
		}
		
		catch(ArithmeticException a1)//if exception is handled then this will execute

		{
			System.out.println("Catch block exceuted");
		}
		finally //this block will executed always
		{
			System.out.println("Finally block executed");
		}
	
}
	

}
