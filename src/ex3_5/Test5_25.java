package ex5;

public class Test5_25 {

	public static void main(String[] args) {
		int n;
		for (int i=0;i<10;i++) {
			double pi=0;
			n=(i+1)*10000;
			for (int j=1;j<n+1;j++) {
				pi+=Math.pow(-1,j+1)/(2*j-1);
			}
			pi=4*pi;
			System.out.printf("n=%d ",n);
			System.out.printf("pi=%f\n",pi);
		}
		
	}

}
