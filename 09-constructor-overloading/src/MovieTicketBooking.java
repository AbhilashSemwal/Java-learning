import java.util.Scanner;
public class MovieTicketBooking{
	private String movieName;
	private String viewerName;
	private double price;	

	
	MovieTicketBooking(){
		this.movieName = "Unknown";
		this.viewerName = "Guest";
		this.price = 0.0;}

	MovieTicketBooking(String movieName, String viewerName){
		this.movieName = movieName;
		this.viewerName = viewerName;
		this.price = 120.0;}

	MovieTicketBooking(String movieName, String viewerName, double price){
		this.movieName = movieName;
		this.viewerName = viewerName;
		this.price = price;}

		//get method
		public String getMovieName(){
			return movieName;}
		
		public String getViewerName(){
			return viewerName;}

		public double getPrice(){
			return price;}

		//seter
		public void setMovieName(String movieName){
			this.movieName = movieName;}
	
		public void setViewerName(String viewerName){
			this.viewerName = viewerName;}

		public void setPrice(double price){
			if(price < 100 || price > 1000){
    				System.out.println("Invalid price. Setting default ₹120.");
    				this.price = 120;}
			else{
			this.price = price;}
		}

	void showTicket(){
		System.out.println("\n<----- Ticket Details ----->\n");
		
		System.out.println("Movie: " + movieName);
		System.out.println("Viewer: " + viewerName);
		System.out.println("Price: " + price);}


	public static void main(String[] args){
			MovieTicketBooking movie = new MovieTicketBooking();
			Scanner scanner = new Scanner(System.in);
		
			while(true){
				
				System.out.println("\n<----- Options ----->\n");
	
				System.out.println("1. Enter Details. \n2. Show Details.\n3. Exit.");
				System.out.print("Enter Your Choice: ");
				int userInput = scanner.nextInt();
				scanner.nextLine();

			if(userInput >=1 && userInput <= 3){
				if(userInput == 3){
					System.out.println("Exiting..");
					break;}
				else if(userInput == 1){
					System.out.print("Movie Name: ");
					String newMovieName = scanner.nextLine();
	
					System.out.print("Viewer Name: ");
					String newViewerName = scanner.nextLine();

					System.out.print("Price: ");
					double newPrice = scanner.nextDouble();

					//seting all data 
					movie.setMovieName(newMovieName);
					movie.setViewerName(newViewerName);
					movie.setPrice(newPrice);}
					
					else{
						movie.showTicket();}
			}else{
				System.out.println("Innvalid Input.");}
		}
		
	}

}