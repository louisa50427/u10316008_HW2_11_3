import java.util.Scanner;
class SavingsAccount extends Account{
	
	int id;
	double balance;
	double takeing;
	double saving;
	
	SavingsAccount(){
		super();
	}

	SavingsAccount(int newId,double newBalance){
		super(newId,newBalance);
	}
	
	public void a(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your ID:");
		id = input.nextInt();
	
		System.out.println("Your ID is " + id);
		super.setBalance(20000);
	
		do{
			if(takeing >20000){
				System.out.println("You don't have that much ");
			}
		
	
			System.out.println("How many money do you want to withdraw: ");
			takeing = input.nextDouble();
			super.withDraw(takeing);
			
			System.out.println("How many money do you want to deposit: ");
			saving = input.nextDouble();
			super.deposit(saving);
	
		}while(takeing > 20000);
	}
	
	public String toString(){
		return super.toString();
	}
	
	
}
