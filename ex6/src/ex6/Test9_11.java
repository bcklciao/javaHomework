package ex6;

import java.util.Scanner;

public class Test9_11 {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f:");
		int a = input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		int e=input.nextInt();
		int f=input.nextInt();
		Text9_11_LinearEquation le =new Text9_11_LinearEquation(a,b,c,d,e,f);
		boolean flag =le.isSolvable();
		if(flag) {
			System.out.println(le.getX()+" "+le.getY());
		}
		else {
			System.out.println("The equation has no solution.");
		}
	}

}
