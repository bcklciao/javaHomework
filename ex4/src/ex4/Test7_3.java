package ex4;

import java.util.Scanner;

public class Test7_3 {

	public static void main(String[] args) {
		int[] lst1 = new int[101];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        n = input.nextInt();
        while( n != 0){
            ++lst1[n];
            n = input.nextInt();
        }

        for (int i = 1; i < lst1.length;i++){
            if (lst1[i] == 0){
            	continue;
            	}
            else if (lst1[i] == 1){
                System.out.println(i + " occurs " + lst1[i] + " time");
            } else
                System.out.println(i + " occurs " + lst1[i] + " times");
        }
	}

}
