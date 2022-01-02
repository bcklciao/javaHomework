package ex4;

import java.util.Scanner;

public class Test7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int[] lst = new int[10];
		int n,count=0;
		for (int i=0;i<10;i++) {
			boolean bool = false;
			n=input.nextInt();
			for(int j=0;j<10;j++) {
				if(n==lst[j]) {
					bool=true;
				}
			}
			if(!bool) {
				count++;
				lst[count-1]=n;
			}
		}
		System.out.printf("The number of distinct numbers is %d\n",count);
		System.out.printf("The distinct numbers are: ");
		for(int i=0;i<count;i++) {
			System.out.printf("%d ",lst[i]);
		}
	}

}
