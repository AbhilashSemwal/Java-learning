public class Counter{
	static int count  = 0;
	
	public Counter(){
		count++;}

	public static int getCount(){
		return count;}


	public static void main(String[] args){

		System.out.println("Initial count : " + Counter.getCount());
			
		Counter c1 = new Counter();
		Counter c2 = new Counter();	
	 	Counter c3 = new Counter();

		System.out.println("Total object created: " + Counter.getCount());
    }
}