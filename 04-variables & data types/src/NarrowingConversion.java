public class NarrowingConversion{
	public static void main(String[] args){

	narrowing();
	}

	public static void narrowing(){
	
	double a = 123.435; //double value
	int b = (int) a;  //double to int.

	System.out.println("Double: " + a);
	System.out.println("Int: " + b);
	}
}