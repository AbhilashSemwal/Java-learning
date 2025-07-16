public class UserIdGenerator{
 String name;
 int id ;
 static int idCounter = 0;
   
    UserIdGenerator(String name){
    this.name = name; 
    idCounter++;
    this.id = idCounter;
    }

    void showUser(){ 
        System.out.println("User Created:" + name + "," + " ID: " + id);
    }
    public static void main(String[] args){
		UserIdGenerator user1 = new UserIdGenerator("Rahul");
		UserIdGenerator user2 = new UserIdGenerator("Abhilash");

		user1.showUser();
		user2.showUser();
	
    }
}