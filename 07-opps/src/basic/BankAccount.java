import java.util.Scanner;

public class BankAccount{
	String accountHolder;
	double balance = 0.0;

	BankAccount(String accountHolder){
		this.accountHolder = accountHolder;
		 }

	void deposit(double amount){
		if(amount>0){
			balance += amount;
			System.out.println("Deposited: " + amount);}
	else{
		System.out.println("Invalid amount.");}
	}

	void withdraw(double amount){
		if (amount > balance){
			System.out.println("Insufficient Balance");}
		else{
			balance -= amount;}
		}

	void printBalance(){
		System.out.println("Hello " + accountHolder);
		System.out.println("Your Total Balance: " + balance);}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
	
		BankAccount account = new BankAccount("Abhilash");


		while (true){	
	
		System.out.println("\n======================");

		System.out.println("1. Deposit.\n2. Withdraw.\n3. Print Balance.\n4. Exit.");
		System.out.print("Enter your choice: ");
		int userInput = sc.nextInt();
			
			if(userInput == 4){
				System.out.println("Exiting..");
				break;}
	
			switch(userInput){
				
				case 1:
					System.out.println("\n======================");

					System.out.print("Enter the amount: ");
					double depositAmount = sc.nextDouble();
					account.deposit(depositAmount);
					System.out.println("\n======================");
					break;
				case 2: 
					System.out.print("Enter the amount: ");
					double withdrawAmount = sc.nextDouble();
					account.withdraw(withdrawAmount);
					break;
				case 3:
					System.out.println("\n======================");

					account.printBalance();	
					break;
				
				default:	
					System.out.println("Wrong input..");	
			}
		
		}

 	}		
}