import java.util.Scanner;

public class AddTwoNumbers{

	//enter point, main method.
	public static void main(String[] args){  
		
		Scanner scanner = new Scanner(System.in);		
	
		System.out.print("Enter Num1: ");
		int num1 = scanner.nextInt(); //taking user input

		System.out.print("Enter Num2: ");		
		int num2 = scanner.nextInt();
		
		int result = num1 + num2; // adding numbers.
			
		System.out.println("Sum = " + result);
	}
}