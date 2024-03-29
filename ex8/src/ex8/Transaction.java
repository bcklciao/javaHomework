package ex8;

import java.util.Date;

public class Transaction {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char type,double amount,double balance,String description) {
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	public Date getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
}
