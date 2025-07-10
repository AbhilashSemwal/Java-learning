import java.util.Scanner;

public class IsEven{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Number: ");
	int number = scanner.nextInt();
	
	System.out.println("Is Even: " + isEven(number));
	
	
   }
	public static boolean isEven(int number){
			return number %2 ==0;

  }
}