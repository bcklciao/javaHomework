package ex3;

import java.util.Scanner;

public class CalculatePerimeter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three number as the sides: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a+b>c&&a+c>b&&b+c>a) 
			System.out.println("The perimeter is "+(a+b+c));
		else
			System.out.println("Invalid value");
	}
}
