import java.util.Scanner;

public class IfElseCheck{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Number: ");
		int input = sc.nextInt();
	
		System.out.println("Number is " + check(input));
	}

	public static String check(int input){

		if(input < 0){
			return "negative";}
		else if(input == 0){
			return "Zero";}
		else{
			return "positive";}

	}
}