package InheritanceConceptInJava30Jan25;


class Amazon
{
	Amazon()
	{
		System.out.println("This is Parent constructor");
	}
}


public class NonParameterizedConstructorSuperCallingStatement extends Amazon

{
	NonParameterizedConstructorSuperCallingStatement()
	{
        super();

		System.out.println("This is child constructor");
	}

	public static void main(String[] args) {
		
		new NonParameterizedConstructorSuperCallingStatement();

	}

}
