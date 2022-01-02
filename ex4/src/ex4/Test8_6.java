package ex4;

import java.util.Scanner;

public class Test8_6 {
	
	public static double[][] muliplyMatrix(double[][] a,double[][] b){
		double[][] c = new double[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		System.out.println("Enter matrix1: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=input.nextDouble(); 
			}
		}
		System.out.println("Enter matrix2: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=input.nextDouble(); 
			}
		}
		double[][] c = muliplyMatrix(a,b);
		System.out.println("The multiplication of the matrices is");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf("%.1f ",a[i][j]);
			}
			
			if(i==1) {
				System.out.printf(" ");
				System.out.printf("*");
				System.out.printf("  ");
			}
			else
			System.out.printf("\t");
			
			for(int j=0;j<3;j++) {
				System.out.printf("%.1f ",b[i][j]);
			}
			
			if(i==1) {
				System.out.printf(" ");
				System.out.printf("=");
				System.out.printf("  ");
			}
			else
			System.out.printf("\t");
			
			for(int j=0;j<3;j++) {
				System.out.printf("%.1f ",c[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
