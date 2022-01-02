package ex11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Studentinfo implements Comparable<Studentinfo> {
	private String index;
	private String name;
	private int age;
	
	public Studentinfo(String index,String name,int age){
		this.index=index;
		this.name=name;
		this.age=age;
	}
	public String getIndex(){
	    return this.index;
	}
	public String getName(){
	    return this.name;
	}
	public int getAge(){
	    return this.age;
	}
	public int compareTo(Studentinfo student) {
		return this.getAge()-student.getAge();
	}
	public String toString() {
		return index+"\t"+name+"\t"+age;
	}
	
	
public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
    Set<Studentinfo> studentinfo = new TreeSet<Studentinfo>();
    
//    System.out.println("请输入学生数量：");
//    int n = input.nextInt();
//    for(int i = 0;i < n;++ i){
//        String name,index;
//        int age;
//        System.out.println("请输入学号：");
//        index = input.next();
//        System.out.println("请输入姓名：");
//        name = input.next();
//        System.out.println("请输入年龄：");
//        age = input.nextInt();
//        
//        Studentinfo x = new Studentinfo(index,name,age);
//        studentinfo.add(x);
//        }
    
    while(true) {
    	System.out.println("请输入学生信息:(学号 姓名 年龄)");
    	String Input = input.nextLine();
    	if("exit".equals(Input)) {
    		break;
    	}
    	String[] stu = Input.split(" ");
    	Studentinfo x = new Studentinfo(stu[0],stu[1],Integer.parseInt(stu[2]));
    	studentinfo.add(x);
    }
    
    Iterator<Studentinfo> it = studentinfo.iterator();
    try(PrintWriter output = new PrintWriter("src/ex11/Studentinfo.txt")){
    	output.println("ID\tName\tAge");
        while(it.hasNext()) {
        	String info = it.next().toString();
        	output.println(info);
        }
    }
    
	}

}
