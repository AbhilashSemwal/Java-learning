public class Student{

	String name;
	int rollNumber;

	Student(String name, int rollNumber){
		this.rollNumber = rollNumber;
		this.name = name;}

	//print detail method
	void printDetails(){
		System.out.println("Name : " + this.name);
		System.out.println("Roll Number : " + this.rollNumber);}

	//main  method
	public static void main(String[] args){
	Student student = new Student("Abhilash",1234);
	
	student.printDetails();
	}
}