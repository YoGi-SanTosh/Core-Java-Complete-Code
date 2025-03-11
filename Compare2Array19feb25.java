package StringConcept14Feb2025;

import java.util.Arrays;

public class Compare2Array19feb25 {

	public static void main(String[] args) {

		int[] rollno1=new int[4];
		rollno1[0]=10;
		rollno1[1]=20;
		rollno1[2]=30;
		rollno1[3]=40;

		int[] rollno2=new int[4];
		rollno2[0]=10;
		rollno2[1]=20;
		rollno2[2]=30;
		rollno2[3]=40;

		boolean b1 =Arrays.equals(rollno1, rollno2);
		System.out.println("Your Both Array are equals =" + b1);
	}

}
