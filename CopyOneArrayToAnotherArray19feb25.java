package StringConcept14Feb2025;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray19feb25 {

	public static void main(String[] args) {

		int Array1[] =new int[4];
		Array1[0]=56;
		Array1[1]=41;
		Array1[2]=85;
		Array1[3]=96;
		int Array2[] =new int[Array1.length];
		for(int i=0;i<Array1.length;i++)
		{
			Array2[i]=Array1[i];	
		}
		System.out.println("Input Array : " + Arrays.toString(Array1));
		System.out.println("Copied Array : " + Arrays.toString(Array2));

	}

}
