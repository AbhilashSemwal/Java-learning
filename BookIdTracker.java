public class BookIdTracker
	{
		String title;
		String author;
		int bookId;
		static int idCounter = 0;

	BookIdTracker(String title, String author)
	{
		this.title = title;
		this.author = author;
		idCounter++;
		this.bookId = idCounter;
	}
	//mthod to show details.
	void showBookDetails()
	{
		System.out.println("=============================\n");
		System.out.println("Title: " + title);
		System.out.println("Author name: " + author);
		System.out.println("Id: " + bookId);

	}
	//Main Method.
	public static void main(String[] args)
	{
		BookIdTracker book1 = new BookIdTracker("Java Black Book.","Robert C. Martin"); 
		BookIdTracker book2 = new BookIdTracker("Effective Java.", "Joshua Bloch");

		System.out.println("-----> Book Details <------");
		
		book1.showBookDetails();
		book2.showBookDetails();
	
	}
}