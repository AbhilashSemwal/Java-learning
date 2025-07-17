import java.util.Scanner;

public class BankAccount{
	private String accountHolder;
	private double balance;

	public BankAccount(String accountHolder) {
    		this.accountHolder = accountHolder;
    		this.balance = 0.0;
}	
	//getter
	public String getAccountHolder()
	{
		return accountHolder;
	}	

	//Method for Deposit.
	
	public void deposit(double amount)
	{
		if(amount > 0){
			balance += amount; }

		else{
			System.out.println("Invalid Amount.");}
	}
	
	//Method for withdraw

	public void withdraw(double amount)
	{
		if(amount> balance){
			System.out.println("Low Balance.");}
		else{
			balance -= amount;
			System.out.println("Credited: " + amount);}
	}

	//Method to get balance

	public double getBalance()
	{
		return balance;
	}
	//show details.

	public void printAccountInfo()
	{
		System.out.println("\n=============================");

		System.out.println("Account Holder: " + getAccountHolder());
		System.out.println("Total Balance: " + getBalance());
	
	}
	//Main method.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Account Holder Name: ");
		String name = sc.nextLine();
		BankAccount customer1 = new BankAccount(name);

		while (true){
			
			System.out.println("<----- Check Account ---->");
			System.out.println("\n1. Withdraw\n2. Deposit\n3. Show Balance\n4. Exit");
			System.out.print("Enter your Choice: ");
			int userInput = sc.nextInt();
			
			if(userInput == 4){
				System.out.println( "Exiting..") ;
				break;}
		
			switch(userInput){

				case 1:
					System.out.print("Enter Withdraw Amount: ");
					double withdrawAmount = sc.nextDouble();
					customer1.withdraw(withdrawAmount);
					break;
				case 2:
					System.out.print("Enter Deposit Amount: ");
					double depositAmount = sc.nextDouble();

					customer1.deposit(depositAmount);
					break;
				case 3:
					customer1.printAccountInfo();
					break;
				default:
					System.out.println("Invalid Input.");
					break;
					}
			}
		sc.close(); //closing scanner .
	}
}