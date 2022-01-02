package ex8;

import java.util.ArrayList;
import java.util.Date;

public class Text11_8_Account {
	private String name ;
	private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;
    private ArrayList<Transaction> transaction = new ArrayList<>();

    // 无参构造方法
    public Text11_8_Account(){
    }
    public Text11_8_Account(String name,int id, double balance){
        this.name=name;
    	this.id = id;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest(){
        return annualInterestRate * balance / 1200;
    }
    
    public void withDraw(double num){
    	 balance += num;
    	 Transaction tran1 = new Transaction('W',num,balance,"取款");
    	 transaction.add(tran1);
    }

    public void deposit(double num){
        balance += num;
        Transaction tran2 = new Transaction('D',num,balance,"存款");
   	 	transaction.add(tran2);
    }
    public int getTransactionSize() {
    	return transaction.size();
    }
    public Transaction getTransactionIndex(int index){
    	return transaction.get(index);
    }
}
