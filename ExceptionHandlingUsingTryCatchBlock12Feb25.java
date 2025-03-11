package ExceptionHandlinginJava11Feb25;

public class ExceptionHandlingUsingTryCatchBlock12Feb25 {

	public static void main(String[] args) {
		//1/1=1
		//i/0=infinity
		//0/1=0
		try
		{
			int a =1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("handeled it thanks god");
		}
	}

}
