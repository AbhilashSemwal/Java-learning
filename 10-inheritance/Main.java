public class Main{
	
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.name = "Bruno";
		dog.makeSound();
		dog.legs();}
}


class Animal{
	String name;
	
	void makeSound(){
		System.out.println("Makes Sound");
	}
}

class Mammal extends Animal{
	void legs(){
		System.out.println("All Mammal Has 4 Legs");}
}



class Dog extends Mammal{

	
	@Override
	void makeSound(){
		System.out.println(name + " Barks");}
}



