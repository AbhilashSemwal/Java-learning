
public class Rectangle{
	int len;
	int breadth;
	
	Rectangle(int len, int breadth){
		this.len = len;
		this.breadth = breadth;}

	int calculateArea(){
		return len*breadth;}	

	public static void main(String[] args){
		Rectangle a = new Rectangle(2,5);
		Rectangle b = new Rectangle(4,5);
		
		int areaA= a.calculateArea();
		int areaB = b.calculateArea();
			
		System.out.println("Area of Reactangle a : " + areaA + "\nArea of Rectangle b : " + areaB );
		if (areaA>areaB){
	
		System.out.println("Rectangle a is bigger");
		}else{
			System.out.println("Rectangle b is bigger.");}
			}
}