package InheritanceConceptInJava30Jan25;

class googleAuth
{

	void login()
	{
		
		System.out.println("Login gmail by using mobile no.");
	}
}


public class MethodOverride extends googleAuth {

	void login()
	{
		System.out.println("Login gmail by using email id");
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodOverride m1=new MethodOverride();
		m1.login();
		m1.login();

	}

}
