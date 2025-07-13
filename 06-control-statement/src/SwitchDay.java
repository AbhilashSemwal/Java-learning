import java.util.Scanner;

public class SwitchDay{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter number (between 1 to 7) : ");
		int input  = sc.nextInt();

		System.out.println("Day is : " + days(input));
	}

	public static String days(int input){
		switch(input){
			case 1: return "Sunday";
			case 2: return "Monday";
			case 3: return "Tuesday";
			case 4: return "Wednesday";
			case 5: return "Thursday";
			case 6: return "Friday";
			case 7: return "Saturday";
			default: return "Weekday";
		}
	}	
}