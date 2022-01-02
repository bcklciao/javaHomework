package ex6;

import java.util.Random;

public class Test9_4 {

	public static void main(String[] args) {
		Random n = new Random(1000);
		for (int i=0;i<50;i++){
			System.out.println(n.nextInt(100));
		}
	}

}
