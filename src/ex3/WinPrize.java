package ex3;

import java.util.Scanner;

public class WinPrize {
	public static void main(String[] args) {
	int ans = (int) (Math.random() * 900)+100;
	int a1 = ans/100;
	int a2 = (ans%100)/10;
	int a3 = ans%10;
	System.out.println("Enter a three-digit integer: ");
	Scanner input = new Scanner(System.in);
	int num =  input.nextInt();
	int b1 = num/100;
	int b2 = (num%100)/10;
	int b3 = num%10;
	
	int prize = 0;
	if(num == ans)
		prize = 10000;
	else if((a1==b1&&a2==b2&&a3==b3)
			||(a1==b2&&a2==b1&&a3==b3)
			||(a1==b3&&a2==b2&&a3==b1)
			||(a1==b1&&a2==b3&&a3==b2)
			||(a1==b2&&a2==b3&&a3==b1)
			||(a1==b3&&a2==b1&&a3==b2))
		prize = 3000;
	else if((a1==b1||a1==b2||a1==b3)
			||(a2==b1||a2==b2||a2==b3)
			||(a3==b1||a3==b2||a3==b3))
		prize = 1000;
	System.out.println("you win "+prize);
	}

}
