import java.util.Scanner;

public class GreetUser{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
	
		greet(name);  // calling greet method
	
   }
	public static void greet(String name){

		System.out.println("Welcome To The Coding World " + name);
   }
}
