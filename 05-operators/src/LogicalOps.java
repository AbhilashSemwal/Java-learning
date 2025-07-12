public class LogicalOps{

	public static void main(String[] args){
		int age = 17;
		int marks = 65;
		operation(age,marks);	
	}

	public static void operation(int age ,int marks){
		
		if(age>18 && marks > 60){
			System.out.println("Age: " + age);
			System.out.println("Marks: " + marks);}
		else{
			if(age<18){
				System.out.println("You'r not an adult.");}
			else{
				System.out.println("Marks is less than 60");}
	}
	}
}
