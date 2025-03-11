package InheritanceConceptInJava30Jan25;

class Santosh
{

	final void login()
	{
		
		System.out.println("Login gmail by using mobile no.");
	}
}

public class MethodOverridingByFinalMethod extends Santosh {

	void loginemail()
	{
		System.out.println("Login gmail by using email id");
	}

	public static void main(String[] args) {
		
		MethodOverridingByFinalMethod m1=new MethodOverridingByFinalMethod();
		m1.login();
		m1.login();

	}

}
