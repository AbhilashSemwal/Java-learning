import java.util.Scanner;

public class Max{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Number: ");
	int number1 = scanner.nextInt();
	
	System.out.print("Enter Number: ");
	int number2 = scanner.nextInt();
	
	System.out.print("Max : " + max(number1,number2));
   }

	public static int max(int number1, int number2){
   		if(number1 > number2){
			return number1;
      } 
	return number2;
   }
}