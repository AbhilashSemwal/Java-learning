import java.util.Scanner;

public class TableWhile{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int input = sc.nextInt();

		table(input);


	
	}
	//method for printing table.
	public static void table(int input){
		int  i =1;
		while(i<=10){
			System.out.println(input + " X " + i + " = " + input*i);
			i++;  }
	}
}