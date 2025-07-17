import java.util.Scanner;
public class Laptop{
	private String brand;
	private int ramSize;
	private double price;

	//getter methods
	public String getBrand(){
		return brand;}
	
	public int getRamSize(){
		return ramSize;}

	public double getPrice(){
		return price;}

	//setter methods
	public void setBrand(String brand){
		this.brand = brand;}
	
	public void setRamSize(int ramSize){
		switch(ramSize){
			case 4:
				this.ramSize = ramSize;
				break;
			case 8:
				this.ramSize = ramSize;
				break;
			case 16:
				this.ramSize = ramSize;
				break;
			case 32:
				this.ramSize = ramSize;
				break;
			default:
				System.out.println("Invalid RAM size. Allowed: 4, 8, 16, 32 GB");
				this.ramSize = -1;
				break;}
			
	}

	public void setPrice(double price){
		if(price < 10_000){
			System.out.println("Invalid price. Must be greater than 10,000.");
			price = -1;
			this.price = price;}
		else{
			this.price = price;}
	}

	//show details
	void showDetails(){
		System.out.println("\n-----> Laptop Details <-----\n");
		System.out.println("Brand: " + getBrand());
		System.out.println("RAM: " + getRamSize());
		System.out.printf("Price: \u20B9%.2f\n", getPrice());
}
	
	//main method.
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Laptop laptop = new Laptop();
		
		while(true){
			
			System.out.println("\n<----- Menu ----->\n");
			System.out.print("1. Add laptop info.\n2. Show details. \n3. Exit.\n");
			System.out.print("Enter Your Choice: ");
			int userInput = scanner.nextInt();
			scanner.nextLine();
			
			if(userInput >= 1 && userInput <= 3){
				if(userInput == 3){
					System.out.println("\nExiting.");
					break;}		
		
				else if(userInput == 1){
					System.out.print("Enter Brand Name: ");
					String newBrand = scanner.nextLine();
			
					laptop.setBrand(newBrand);
	
					System.out.print("Enter RAM: ");
					int newSize = scanner.nextInt();
			
					laptop.setRamSize(newSize);	
		
					System.out.print("Enter Price: ");
					double newPrice = scanner.nextDouble();
				
					laptop.setPrice(newPrice);}
				
				else{
			
				laptop.showDetails();}
		   	}else{
				System.out.println("Invalid Input.");}
				
		}
	}
}