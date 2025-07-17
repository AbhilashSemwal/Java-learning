import java.util.Scanner;
public class AgeValidator{
	
	private String name;
	private int age;

	//read access
	public String getName(){
		return name;}

	public int getAge(){
		return age;}

	//write access
	public void setName(String name){
		this.name = name;}
	
	public void setAge(int age){
		if(age < 18){
			System.out.println("You Are Not An Adult..");
			this.age = age;}
		else{
			System.out.println("Adult.");
			this.age = age;}
	}
	
	//show details
	void showDetails(){
		System.out.println("<--- Student Details --->\n");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		
		if(getAge() >= 18){
			System.out.println("Status: Adult.");}
		else{
			System.out.println("Status: Minor (Underage).");}
	}

	//main method
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		AgeValidator validator = new AgeValidator(); 
	
		while (true){
			System.out.println("\n<----- Options ----->:\n1. Continue.\n2. Show Detail.\n3. Exit.");			System.out.print("Enter Choice: ");
			int userInput = scanner.nextInt();
			scanner.nextLine();
			
			if(userInput == 3){
				System.out.println("Exiting.");
				break;}
			else if(userInput == 1){
				System.out.print("Enter your name: ");
				String newName = scanner.nextLine();
							
				System.out.print("Enter your age: ");
				int newAge = scanner.nextInt();
				scanner.nextLine();

				validator.setName(newName);
				validator.setAge(newAge);
			}
			else{
				validator.showDetails();}	
		}
	scanner.close();
	}
}