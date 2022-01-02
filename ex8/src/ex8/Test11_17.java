package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer m: ");
		int num = input.nextInt();
		ArrayList<Integer> smallest = new ArrayList<Integer>();
		int tmp = num;
		for (int i = 2; i <= tmp ; ){
            if (tmp % i == 0){
                smallest.add(i);
                tmp /=i;
            }
            else {
                i ++;
            }
		}
		
		int mul = 1;
		ArrayList<Integer> perfect = new ArrayList<Integer>();
		for(int i=0;i<smallest.size();i++) {
			int count=0;
			for(int s : smallest){
				if(smallest.get(i)==s)  count++;
				}
			if(count%2!=0 && !perfect.contains(smallest.get(i)))
				perfect.add(smallest.get(i));
			}
		for(int j=0;j<perfect.size();j++) {
			mul*=perfect.get(j);
		}
		
		System.out.println("The smallest number"
				+ " n for m * n to be a perfect square is "+mul);
		System.out.println("m * n is "+num*mul);
	}
}


