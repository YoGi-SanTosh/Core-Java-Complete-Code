package MethodAndOperatorOrVariable17Jan2025;

public class MultiNonStaticMethodCallInsideMainMethod {
	
	void addition()
	{
	int a=15;
	int b=25;
	System.out.println(a+b);
	}
	
	void multi()
	{
	int a=15;
	int b=25;
	System.out.println(a*b);
	}
	
	void sub()
	{
	int a=15;
	int b=25;
	System.out.println(a-b);
	}
	
	static void santosh()
	{
		int a=14;
		int b=28;
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {

		
		//how to call non ststic method 
		
		MultiNonStaticMethodCallInsideMainMethod mul=new MultiNonStaticMethodCallInsideMainMethod();//crete an object
				mul.addition();//access the non static method
				mul.sub();
				mul.multi();
				santosh();
		
	
	}

}
