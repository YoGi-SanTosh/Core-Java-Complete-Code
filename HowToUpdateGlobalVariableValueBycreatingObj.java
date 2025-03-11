package VariableLocalGlobalFinalinillizationAndDeclaration;

public class HowToUpdateGlobalVariableValueBycreatingObj {
	
	int a=10;
	static double c=9.1;
	
	
	public static void main(String[] args) {
		
		HowToUpdateGlobalVariableValueBycreatingObj h1=new HowToUpdateGlobalVariableValueBycreatingObj();
		h1.a=100;
		System.out.println(h1.a);
		
		double c=10.2;
		System.out.println(c);

	}

}
