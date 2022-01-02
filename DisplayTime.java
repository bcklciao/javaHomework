package exe1;

import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter a integer for seconds: ");
		 int second = input.nextInt();
		 int minutes = second / 60;
		 int remainingSeconds = second % 60;
		 System.out.println(second+" seconds is "+minutes+" minutes and "+remainingSeconds+" seconds");
	}

}
