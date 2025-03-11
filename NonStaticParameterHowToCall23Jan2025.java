package MethodAndOperatorOrVariable17Jan2025;

public class NonStaticParameterHowToCall23Jan2025 {
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}

	void mul(int a,int b)
	{
		System.out.println(a*b);
	}

	void div(int a,int b)
	{
		System.out.println(a/b);
	}


	public static void main(String[] args) {
		
		NonStaticParameterHowToCall23Jan2025 Noncall=new NonStaticParameterHowToCall23Jan2025();
		Noncall.add(100, 200);
		Noncall.sub(300, 100);
		Noncall.mul(50, 30);
		Noncall.div(100, 20);	

	}

}
