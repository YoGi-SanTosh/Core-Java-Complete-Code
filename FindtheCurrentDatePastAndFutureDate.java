package StringAndArrayConcept20Feb2025;

import java.util.Date;

public class FindtheCurrentDatePastAndFutureDate {

	public static void main(String[] args) {

		Date d1 =new Date();
		System.out.println("current date is ->" + d1);
		Date d2=new Date(d1.getTime()+(1000*60*60*24*-5));
		System.out.println("Past date is ->" + d2);
		Date d3=new Date(d1.getTime()+(1000*60*60*24*5));
		System.out.println("Future date is ->" + d3);
		String format1 =d1.toString();
		//DD/MM/YYY
		//DD-MM-YYYY
	String month =format1.substring(4, 7);
	 System.out.println(month);
	String date =format1.substring(8, 10);
	 System.out.println(date);
	String year=format1.substring(format1.length() -4);
		System.out.println(year);
	String format2 =date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format2);
	String format3 =date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format3);
	}

}
