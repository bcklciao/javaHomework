package ex5;

import java.util.Scanner;

public class Test5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = input.nextInt();

        // 输出
        for (int n = 1; n <= lines;n++){     
            if(lines != n){
                for (int a = 1; a <= (lines - n); a++)
                    System.out.print("\t");
            }


            for (int b = n; b > 0 ; b--)
                System.out.printf("%d\t",b);;

  
            if(n >= 2) {
                for (int c = 2; c <= n; c++)
                    System.out.printf("%d\t", c);;
            }

            System.out.println();
        }
      	}

}
