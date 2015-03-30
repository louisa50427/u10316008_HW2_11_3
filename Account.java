import java.util.Scanner;

public class Account{
		
		// Declare four data fields 
		private int id = 0;
		private double  = 0;
		private double  annualInterestRate = 0;
		private java.util.Date dateCreated;
		
		
	
	
	//A no-arg constructor to create a default Account
	Account(){
		dateCreated = new java.util.Date();
	}
	//A constructor that create specified id and initial balance
	Account(int newId,double newBalance){
		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	// The setter and getter methods for all  data fields
	public void setId(int newId){
		id = newId;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return 4.5;
	}
	public void deposit(double putMoney){
		balance += putMoney;
	}
	public void withDraw(double takeMoney){
		balance -= takeMoney; 
	}
	public double getMonthlyInterestRate(){
		return getBalance()*getAnnualInterestRate()/12.0/100;
	}
	public String toString(){
		return "\nThe balance is " + (int)getBalance() + "\nMonthly interest is " + getMonthlyInterestRate()  + "\nThe date you create this account is  " + dateCreated;
	}
	public static void main(String[] args){ 
		SavingsAccount object1 = new SavingsAccount();
		CheckingAccount object2 = new CheckingAccount();
		
		object1.a();
		System.out.println(object1.toString());
		object2.b();
		System.out.println(object2.toString());
		
		
		
	}
}
