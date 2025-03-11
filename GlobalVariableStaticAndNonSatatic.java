package VariableLocalGlobalFinalinillizationAndDeclaration;

public class GlobalVariableStaticAndNonSatatic {
	static int a=100;
	static int b=200;
	
	static void add()
	{
		System.out.println(a+b);
	}
	
	static void sub()
	{
		System.out.println(a-b);
	}
	static void mul()
	{
		System.out.println(a*b);
	}

	void Addition()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
	//call static method
		add();
		sub();
		mul();
	//call non static method	
		GlobalVariableStaticAndNonSatatic a1=new GlobalVariableStaticAndNonSatatic();
		a1.Addition();

	}

}
