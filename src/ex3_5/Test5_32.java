package ex5;

public class Test5_32 {

	public static void main(String[] args) {
		int lottery1 = (int) (Math.random() * 9+1);

        int lottery2 = (int) (Math.random() * 10);
        while(lottery2 == lottery1){
              lottery2 = (int) (Math.random() * 10);
            }
        System.out.println(lottery1 * 10 + lottery2);
	}

}
