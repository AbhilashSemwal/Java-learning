import java.util.Scanner;

public class Sum{

	//Main method(Entry point).
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);    //(making obj of scanner class)
	
	System.out.print("Enter Number: ");
	int num1 = scanner.nextInt();

	System.out.print("Enter Number: ");
	int num2 = scanner.nextInt();
	
	System.out.println("Total: "+ add(num1,num2));
	
   }

	public static int add(int num1, int num2){
		int total = num1 + num2;
		return total;
	}
}