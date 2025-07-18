public class Book{
	private String title;
	private	String author;
	private double price;

	Book(){
	this.title = "Unknown";
	this.author = "Anonymous";
	this.price = 0.0;}

	Book(String title,String author){
		this.title = title;
		this.author = author;
		this.price = 0.0;}

	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;}


	void showDetails(){
		System.out.println("\n<----- Book Details ----->\n");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);}

	public static void main(String[] args){
		Book book1 = new Book();
		Book book2 = new Book("Black Book Java", "Abhilash");
		Book book3 = new Book("Three Man In A Boat", "Marcos James",2000.89);

		//printing details
		book1.showDetails();
		book2.showDetails();
		book3.showDetails();
	}
}