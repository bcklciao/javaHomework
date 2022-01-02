package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of objects: ");
		int num = input.nextInt();
		ArrayList<Integer> weights = new ArrayList<>();
		System.out.println("Enter the weights of the objects: ");
		for(int i=0;i<num;i++) {
			weights.add(input.nextInt());
		}
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		 while(weights.size()>0){       
		        //每次的装箱存储 
		        ArrayList<Integer> listComponent = new ArrayList<>(); 

		       int sum=0; 
		       for(int i=0;i<weights.size();i++){ 
		         sum+=weights.get(i); 
		         if(sum<=10){ 
		         listComponent.add(weights.get(i));  
		         weights.remove(weights.get(i));
		         i-=1;
		         }else{ 
		         sum-=weights.get(i); 
		         } 
		       }         
		       lists.add(listComponent); 
		 }
		for(int j=0;j<lists.size();j++) {
			System.out.print("Container "+(j+1)+" contains objects with weight ");
			for(int m=0;m<lists.get(j).size();m++) {
				System.out.print(lists.get(j).get(m)+" ");
			}
			System.out.println();
		}
	}

}
