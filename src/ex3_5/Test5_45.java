package ex5;

import java.util.Scanner;

public class Test5_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        double user_input = 0, n = 0;
        
        double sum0 = 0, sum1 = 0;
        for (int i = 1; i <= 10; i++){
            user_input = input.nextDouble();
            n++;
            sum0 += user_input;
            sum1 += Math.pow(user_input, 2);
        }

        double average = sum0 / n;
        double deviation = Math.sqrt((sum1 - Math.pow(sum0, 2) / n) / (n-1));

        System.out.println("The means is " + average);
        System.out.printf("The standard deviation is %.5f" , deviation);
	}

}
