package VariableLocalGlobalFinalinillizationAndDeclaration;

public class HowToAccessGlobalNonStaticVariable {

	double pi=3.14;//instance variable
	static double r=10;
	
	
	public static void main(String[] args) {

		System.out.println("these area of circle");
		
		HowToAccessGlobalNonStaticVariable g1=new HowToAccessGlobalNonStaticVariable();
		double area =g1.pi*r*r;
		System.out.println(area);	
		
	}

}
