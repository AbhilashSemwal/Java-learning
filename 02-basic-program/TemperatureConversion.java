import java.util.Scanner;

public class TemperatureConversion{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Temerature In Celsius: ");
		
		float temperature = scanner.nextFloat(); 
		
		float f = (temperature*9/5) + 32 ;
	
		System.out.println("-----Celsius To Fehrenheit-----");

		System.out.println("Temperature in Fehrenheit: " + f);
	}	
}