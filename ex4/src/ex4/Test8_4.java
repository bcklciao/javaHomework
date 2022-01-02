package ex4;

import java.util.Arrays;

public class Test8_4 {

	public static void main(String[] args) {
        int[][] workhour = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},
        };
        int raw = workhour.length;
        int col = workhour[0].length;
        int[] workhours_sum = new int[raw];
        int sum = 0;
        for (int a = 0 ; a < raw ; a++){
            sum = 0;
            for (int b = 0 ; b < col ; b++){
                sum += workhour[a][b];
            }
            workhours_sum[a] = sum;
        }
        for (int i = 0; i < workhours_sum.length-1; i++){
        	int	maxhour=0;
	        for (int a = workhours_sum.length - 1 ; a >= 0 ; a--){
	        	if(workhours_sum[a]>maxhour) {
	        		maxhour=workhours_sum[a];
	        	}
	        }
	        for (int j = 0; j < workhours_sum.length; j++){
	        if(workhours_sum[j]==maxhour) {
	        	System.out.println("Employee " + j + "\t总工时：" + workhours_sum[j]);
	        	workhours_sum[j]=0;
	        	}
	        }
        }
	}

}
