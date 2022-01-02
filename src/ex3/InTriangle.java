package ex3;

import java.util.Scanner;

public class InTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x- and y-coordinates: ");
		
		int x=input.nextInt();
		int y=input.nextInt();
		boolean bool = true;
	
		if( (x < 0 || x > 200) || (y < 0 || y > 100) ) {
            bool = false;
        }
        double k = 100.0 / (0 - 200);
        double b = y - k * x;
        if(b < 0 || b > 100)
            bool = false;

        if(bool)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }

}



