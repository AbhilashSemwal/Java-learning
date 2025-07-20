public class  CourseRegistration{
	private String name;
	private String courseName;
	private double courseFees;
	private int durationInWeeks;

 	CourseRegistration(){
		this.name = "Guest";
		this.courseName = "Not Assigned";
		this.courseFees = 0.0;
		this.durationInWeeks = 0;}
	
	 CourseRegistration(String name, String courseName){
		this.name = name;
		this.courseName = courseName;
		this.courseFees = 0.0;
		this.durationInWeeks = 0;}

	 CourseRegistration(String name, String courseName, double courseFees, int durationInWeeks){
		this.name = name;
		this.courseName = courseName;
		setCourseFees(courseFees);
		setDurationInWeeks(durationInWeeks);}

	//getter
	public String getName(){return name;}
	public String getCourseName(){return courseName;}
	public double getCourseFees(){return courseFees;}
	public int getDurationInWeeks(){return durationInWeeks;}
	

	//setter with validation
	public void setName(String name){
		this.name = name;}

	public void setCourseName(String courseName){
		this.courseName = courseName;}

	public void setCourseFees(double courseFees){
		if(courseFees <= 1000){
			this.courseFees = 1000.0;
			System.out.println("Course Fee must be at least 1000.");}
		else{
			this.courseFees = courseFees;}
}

	public void setDurationInWeeks(int durationInWeeks){
		if(durationInWeeks < 0){
			System.out.println("Duration can not be in nagative (Setting Default Value)");
		this.durationInWeeks = 4;}
		else{
			this.durationInWeeks = durationInWeeks;}
		}
	//show details
	void showDetails(){
		System.out.println("\n-----> Course Details <-----\n");
	
		System.out.println("Name: " + getName());
		System.out.println("Course: " + getCourseName());
		System.out.println("Fees: " + getCourseFees());
		System.out.println("Duration (in weeks): " + getDurationInWeeks());}

	public static void main(String[] args){
		CourseRegistration course1 = new CourseRegistration();
		CourseRegistration course2 = new CourseRegistration("Abhilash", "Java");
		CourseRegistration course3 = new CourseRegistration("Amit" , "Data Analytic", 999.0, 2);
		CourseRegistration course4 = new CourseRegistration("Rakesh", "Data Science", 1200.0, -1);
		
		course1.showDetails();
		course2.showDetails();
		course3.showDetails();
		course4.showDetails();
	}
}