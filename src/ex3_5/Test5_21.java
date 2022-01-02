package ex5;

import java.util.Scanner;

public class Test5_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount:");
		double amount = input.nextDouble();
		System.out.println("Number of Years:");
		int year = input.nextInt();
		
		double  monthlyPayment =0, totalPayment=0, interestRate=0;
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment\t");
		for (double i = 5.0; i <= 8.0; i += 1.0 / 8){
            
            interestRate = i / 100;
            monthlyPayment = amount * (interestRate / 12) /
                    ( 1 - 1 / Math.pow((1 + (interestRate / 12)), year * 12));
            totalPayment = monthlyPayment * year * 12;

            System.out.printf("%.3f", i);
            System.out.print("%\t\t");
            System.out.printf("%.2f\t\t%.2f\n", monthlyPayment, totalPayment);
        }
	}

}
