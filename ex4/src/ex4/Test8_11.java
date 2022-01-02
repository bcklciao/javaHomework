package ex4;

import java.util.Scanner;

public class Test8_11 {

	public static void main(String[] args) {
		int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        num = input.nextInt();
       int[][] bin = new int[3][3];
       for (int i = 2 ; i >= 0 ; i--){
           for (int j = 2 ; j >= 0 ; j--){
               bin[i][j] = (num % 2);
               num /= 2;
           }
       }
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if (bin[i][j] == 0){
                	System.out.print("H ");
                }else
                	System.out.print("L ");
            }
            System.out.println();
        }
    }
 
}
