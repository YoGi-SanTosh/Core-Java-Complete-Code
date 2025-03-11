package InheritanceConceptInJava30Jan25;
class googleapp
{

	void login()
	{
		
		System.out.println("Login gmail by using mobile no.");
	}
}

public class MethodOverridingBySuperKeyword extends googleapp {
	
	void login()
	{
		System.out.println("Login gmail by using email id");
		super.login();
	}
	

	public static void main(String[] args) {

		MethodOverridingBySuperKeyword m1=new MethodOverridingBySuperKeyword();
		m1.login();

	}

}
