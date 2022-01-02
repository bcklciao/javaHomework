package ex6;

import java.util.Scanner;

public class Test9_10 {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter a,b,c:");
		int a = input.nextInt(),b=input.nextInt(),c=input.nextInt();
		Test9_10_QuadraticEquation ge =new Test9_10_QuadraticEquation(a, b, c);
		double flag =ge.getDiscriminant();
		if(flag>0) {
			System.out.println(ge.getRoot1()+" "+ge.getRoot2());
		}
		else if(flag==0) {
			System.out.println(ge.getRoot1());
		}
		else {
			System.out.println("The equation has no roots.");
		}
	}

}
