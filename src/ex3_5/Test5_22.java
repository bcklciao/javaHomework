package ex5;

import java.util.Scanner;

public class Test5_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double balance = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Annual Interest Rate: ");
        double interestRate = input.nextDouble();

        double monthlyPayment = (balance * interestRate / 1200) / (1 - 1 / Math.pow(1 + interestRate / 1200, years * 12));
        double totalPayment = monthlyPayment * years * 12;
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");


        double interest = 0.0, principal = 0.0;
        for(int i = 1;i <= years * 12;i++){
            interest = interestRate / 1200 * balance;
            principal = monthlyPayment - interest;
            balance -= principal;
            if(i == years * 12)
                principal += balance;
            System.out.print(i + "\t\t ");
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", interest, principal, balance);
        }
	}

}
