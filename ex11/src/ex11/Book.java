package ex11;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
	public class Book{
        private String index;//编号
        private String name;//名称
        private int price;//单价
        private String press;//出版社
        
        public Book(String index,String name,int price,String press){
			this.index = index;
			this.name = name;
			this.price = price;
			this.press = press;
        }
		public String getIndex(){
		    return this.index;
		}
		public String getName(){
		    return this.name;
		}
		public int getPrice(){
		    return this.price;
		}
		public String getPress(){
		    return this.press;
		}
		public void setIndex(String index){
		    this.index = index;
		}
		public void setName(String name){
		    this.name = name;
		}
		public void setPrice(int price){
		    this.price = price;
		}
		public void setPress(String press){
		    this.press = press;
		}
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    List<Book> books = new ArrayList<Book>();
    Map<String,Book> books1 = new HashMap<String,Book>();
    System.out.println("请输入书本数量：");
    int n = input.nextInt();
    for(int i = 0;i < n;++ i){
        String name,index,press,str;
        int price;
        System.out.println("请输入编号：");
        index = input.next();
        System.out.println("请输入名称：");
        name = input.next();
        System.out.println("请输入单价：");
        price = input.nextInt();
        System.out.println("请输入出版社：");
        press = input.next();
        Book x = new Book(index,name,price,press);
        books.add(x);
        books1.put(index,x);
        }

    System.out.println("Index\tName\tPrice\tPress\t");
    Iterator it1 = books1.entrySet().iterator();
    while(it1.hasNext()){
        Map.Entry entry = (Map.Entry)it1.next();
        System.out.println(entry.getKey() + "\t" + ((Book)entry.getValue()).getName()+"\t"+
        		((Book)entry.getValue()).getPrice()+"\t"+((Book)entry.getValue()).getPress());
    }
}
}
