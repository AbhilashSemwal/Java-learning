import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);  //(Creating an Object of Scanner Class.)
	
	System.out.print("Enter Number: ");
	int num = scanner.nextInt();      // taking user input.

	System.out.println("Factorial of " + num + " : " + fact(num));


   }
	//method to find factorial.
	public static int fact(int num){
		int total = 1;

	//checking if num is positive number.		
	if(num < 0){
		return -1;	
	   }else{
		for(int i = 2; i<=num;i++){
			total *= i;
		}
	}
	return total;
	}
}