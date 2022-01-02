package ex5;

public class Test5_26 {

	public static void main(String[] args) {
		double e = 1.0, item = 1.0;
        for (int n = 10000; n <= 100000; n += 10000){
            item = 1;
            for ( int i = 1; i <= n ; i++){
                item /= i;
                e += item;
            }
            System.out.println("n=" + n +" e=" + e);
        }
	}

}
