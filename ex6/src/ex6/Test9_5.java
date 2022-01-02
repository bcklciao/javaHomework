package ex6;

import java.util.GregorianCalendar;

public class Test9_5 {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		System.out.print(now.get(GregorianCalendar.YEAR)+" ");
		System.out.print(now.get(GregorianCalendar.MONTH)+" ");
		System.out.print(now.get(GregorianCalendar.DAY_OF_MONTH)+" ");
		System.out.println();
		now.setTimeInMillis(1234567898765L);
		System.out.print(now.get(GregorianCalendar.YEAR)+" ");
		System.out.print(now.get(GregorianCalendar.MONTH)+" ");
		System.out.print(now.get(GregorianCalendar.DAY_OF_MONTH)+" ");
		
	}

}
