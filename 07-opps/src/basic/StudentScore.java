public class Student{
	String name;
	int marks1;
	int marks2;
	int marks3;

	 Student(String name,int marks1,int marks2,int marks3){
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;}

	 int calculateAverage(){
		int total = marks1 +marks2 +marks3;
		return (total/3);}

	public static void main(String[] args){
		
		Student student1 = new Student("Abhilash",55,65,87);
		Student student2 = new Student("Rahul",66,75,43);

		System.out.println(student1.name + " Average Score: " + student1.calculateAverage());
		System.out.println(student2.name + " Average Score: " + student2.calculateAverage());

	}
}
