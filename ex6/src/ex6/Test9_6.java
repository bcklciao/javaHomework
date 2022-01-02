package ex6;

import java.util.Arrays;
import java.util.Random;

public class Test9_6 {
	public static void main(String[] args) {
		int[] arr = new int[100000];
		Random n = new Random();
		for (int i=0;i<100000;i++) {
			arr[i]=n.nextInt(100000);
		}
		Test9_6_StopWatch time = new Test9_6_StopWatch();
		Arrays.sort(arr);
		time.stop();
		System.out.println(time.getElaspsedTime()+"s");
	}

}

