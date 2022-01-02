package ex5;

public class Test5_7 {

	public static void main(String[] args) {
		int f0 = 10000;
        double f10 = f0 * Math.pow((1 + 0.05), 10);
        System.out.println("第10年学费为：" + f10);

        double sum = 0;
        for(int i = 1;i < 5;i++){
            sum += f10 * Math.pow((1 + 0.05), i);
        }
        System.out.println("4年内总学费为："+sum);
	}

}
