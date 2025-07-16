public class EncapsulatedStudent
	{
		private String name;
		private int marks ;
		private String marksStatus = "Valid";
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public void setMarks(int marks)
		{
			if(marks<0 || marks > 100){

				this.marks = -1	;
				this.marksStatus = "Marks Should be Between 0 to 100";
			}
			
			else{
				this.marks = marks;
				this.marksStatus = "Valid";
				}
		}
		
		public String getName()
		{
			return name;
		}
	
		public int getMarks()
		{
			return marks;
		}
		
		//show details method.
		public void printDetails(){

			System.out.println("==============================\n");

			System.out.println("Name: " + getName());
			System.out.println("Marks: " + getMarks());

			if(!marksStatus.equals("Valid")){
				System.out.println("Note: " + marksStatus);}
			}


		public static void main(String[] args){

			EncapsulatedStudent student1 = new EncapsulatedStudent();
			EncapsulatedStudent student2 = new EncapsulatedStudent();
		
			student1.setName("Abhilash");
			student1.setMarks(77);

			student2.setName("Rahul");
			student2.setMarks(506);	
	
		
			student1.printDetails();
			student2.printDetails();
			
	}	
}