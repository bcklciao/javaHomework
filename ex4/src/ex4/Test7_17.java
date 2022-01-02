package ex4;

import java.util.Scanner;

public class Test7_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students:");
        int numbers = input.nextInt();//用户输入学生人数
        String[] name = new String[numbers];//姓名
        int[] fraction = new int[numbers];//分数
        System.out.print("Enter name and corresponding score:");
        for (int i = 0; i < numbers; i++) {//用户输入姓名和对应分数
            name[i] = input.next();
                fraction[i] = input.nextInt();
        }
        
        for (int i = 0; i < numbers - 1; i++) {
            //暂定fraction数组位置i为最大成绩
            int currentMax = fraction[i];
            int currentMaxIndex = i;
            //循环寻找数组最大元素
            for (int j = i + 1; j < numbers; j++) {//每次外层循环后位置i前的数都比i大，因此从位置i+1开始与i比较
                if (currentMax < fraction[j]) {
                    currentMax = fraction[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                //互换成绩排位
                fraction[currentMaxIndex] = fraction[i];
                fraction[i] = currentMax;
                //互换姓名，成绩高的姓名排在数组前位
                String temp = name[currentMaxIndex];
                name[currentMaxIndex] = name[i];
                name[i] = temp;
            }
        }
            for (int i = 0; i < numbers; i++)
            System.out.print(name[i] + " ");
	}

}
