public class Car{
	String model;
	int year;

	void start(){
	System.out.println("Car is Starting.");
	}

	// main method.
	public static void main(String[] args){
		Car c = new Car();
		c.start();
	}
}