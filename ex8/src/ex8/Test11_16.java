package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> answerArr = new ArrayList<Integer>();
		System.out.println("What is 5 + 9? ");
		int answer = input.nextInt();
		while(answer!=14){
			if(answerArr.contains(answer)) {
				System.out.println("You alread entered "+answer);
			}
			else answerArr.add(answer);
				System.out.println("Wrong answer. Try again. What is 5 + 9? ");
				answer = input.nextInt();
			}
		if(answer==14) {
			System.out.println("You got it!");
		}
	}

}
