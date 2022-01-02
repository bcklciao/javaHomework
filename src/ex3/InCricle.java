package ex3;

import java.text.Format;
import java.util.Scanner;

public class InCricle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if(Math.sqrt(x*x+y*y)<=10)
			System.out.println("Point ("+String.format("%.1f", x)+" , "+String.format("%.1f", y)+") is in the circle");
		else
			System.out.println("Point ("+String.format("%.1f", x)+" , "+String.format("%.1f", y)+") is not in the circle");
	}

}
