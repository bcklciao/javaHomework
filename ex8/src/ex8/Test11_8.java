package ex8;

import java.util.Date;

public class Test11_8 {

	public static void main(String[] args) {
		Text11_8_Account ta = new Text11_8_Account("George",1122, 1000);
        ta.setAnnualInterestRate(1.5);
        
        ta.deposit(30);
        ta.deposit(40);
        ta.deposit(50);
        
        ta.withDraw(5);
        ta.withDraw(4);
        ta.withDraw(2);
        

        System.out.println("名字：" + ta.getName());
        System.out.println("利率：" + ta.getAnnualInterestRate());
        System.out.println("余额：" + ta.getBalance());
        System.out.println("交易：");
        System.out.println("类型\t交易量\t余额\t描述");
        for(int i =0;i<ta.getTransactionSize();i++){
        System.out.println(ta.getTransactionIndex(i).getType()+"\t"+
        		ta.getTransactionIndex(i).getAmount()+"\t"+
        		ta.getTransactionIndex(i).getBalance()+"\t"+
        		ta.getTransactionIndex(i).getDescription());
        }
	}

}
