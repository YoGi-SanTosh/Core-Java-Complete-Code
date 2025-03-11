package MethodAndOperatorOrVariable17Jan2025;

public class HowtoCallNonStaticMethodInsideMainMethod {
	
	void addition()
	{
	int a=15;
	int b=25;
	System.out.println(a+b);
	}

	public static void main(String[] args) {

		//how to call non ststic method 
		
		HowtoCallNonStaticMethodInsideMainMethod a=new HowtoCallNonStaticMethodInsideMainMethod();//crete an object
		a.addition();//access the non static method	
	}

}
