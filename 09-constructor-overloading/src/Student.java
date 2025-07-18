import java.util.Scanner;
public class Student{
	private String name;
	private String course;
	private int rollNumber;

	//default constructor
	Student(){
		this.name = "Unknown";
		this.course = "Unknown"; 
		this.rollNumber = 0;}
	
	Student(String name, String course){
		this.name = name;
		this.course = course;
		this.rollNumber = 0;}
	
	Student(String name, String course, int rollNumber){
		this.name = name;
		this.course = course;
		this.rollNumber = rollNumber;}

	//get method
	public String getName(){
		return name;}

	public String getCourse(){
		return course;}
	
	public int getRollNumber(){
		return rollNumber;}

	//setter
	public void setName(String name){
		this.name = name;}
	
	public void setCourse(String course){
		this.course = course;}

	public void setRollNumber(int rollNumber){
		this.rollNumber = rollNumber;}

	//show details method
	void showDetails(){
		System.out.println("\n<----- Student Details ----->\n");

		System.out.println("Name: " + getName());
		System.out.println("Course: " + getCourse());
		System.out.println("Roll Number: " + getRollNumber());}

	//main method
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); //creating object	
		Student student = new Student();

		while(true){
			System.out.println("<----- Options ----->");
			System.out.println("\n1. Enter Details.\n2. Show Details.\n3. Exit.\n");
			System.out.print("Enter Your Choice: ");
			int userInput = scanner.nextInt();
			scanner.nextLine(); 

			if(userInput >= 1 && userInput <= 3){
				
				if(userInput == 3){
					System.out.println("Exiting.");
					break;}
				
				else if(userInput == 1){
					System.out.print("\nEnter Name: ");
					String newName = scanner.nextLine();
					
					System.out.print("Enter Course: ");
					String newCourse = scanner.nextLine();
					
					System.out.print("Enter Roll Number: ");
					int newRollNumber = scanner.nextInt();

					student.setName(newName);
					student.setCourse(newCourse);
					student.setRollNumber(newRollNumber);}
		
				else{
					student.showDetails();}
		}else{
			System.out.println("Invalid Input.");}
		}
	}
}