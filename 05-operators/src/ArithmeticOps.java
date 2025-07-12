public class ArithmeticOps{

	public static void main(String[] args){
	
	int a = 5;
	int b = 0;	

	System.out.println("ADD: " + add(a,b));
	System.out.println("Subtract : " + subtract(a,b));
	System.out.println("Multiply: " + multiply(a,b));
	System.out.println("Modulus: " + modulus(a,b));
	System.out.println("Divide: "+ divide(a,b));	
	
	}
	
	//Methods for operation

	public static int add(int a, int b){
		return a+b;
	}

	public static int subtract(int a, int b){
		return a-b;
	}
	
	public static int multiply(int a, int b){
		return a*b;
	}

	public static int modulus(int a, int b){
		if (b<1){
			return -1;
		}
		return a%b;
	}

	public static int divide(int a, int b){
		if (b<1){
			return -1;
		}
		return a/b;
	}	

}