import java.util.Scanner;

class CheckingAccount extends Account {

	int id;
	double balance;
	double takeing;
	double saving;

	CheckingAccount(){
		super();
	}

	CheckingAccount(int newId,double newBalance){
		super(newId,newBalance);
	}
	
	public void b(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your ID:");
		id = input.nextInt();
	
		System.out.println("Your ID is " + id);
		
		super.setBalance(20000);
	
	
		System.out.println("How many money do you want to withdraw: ");
		takeing = input.nextDouble();
		super.withDraw(takeing);
		
			
		System.out.println("How many money do you want to deposit: ");
		saving = input.nextDouble();
		super.deposit(saving);
		while(20000 - takeing+saving <= 0){
			System.out.println("You need to deposit more");
			System.out.println("How many money do you want to deposit: ");
			saving = input.nextDouble();
			super.deposit(saving);
		}
	}
	
	public String toString(){
		return super.toString();
	}
}	
		
