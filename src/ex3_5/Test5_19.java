package ex5;

public class Test5_19 {
	public static void main(String[] args) {
        // 输出
        for (int n = 1; n <= 8;n++){     
            if(n!=8){
                for (int a = 1; a <= (8 - n); a++)
                    System.out.print("\t");
            }


            for (int b = 0; b<n ; b++) {
                System.out.printf("%d\t", (int)Math.pow(2,b));
            }
  
            if(n >= 2) {
                for (int c = n; c >=2; c--)
                    System.out.printf("%d\t", (int)Math.pow(2,c-2));;
            }

            System.out.println();
        }
	}

}
