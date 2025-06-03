package javaproject;
class animal {
	void sound() {
		System.out.println("Animals make sound");
	}
}
class Dog extends animal{
	void sound() {
		System.out.println("Dogs barks");
	}
}
class Cat extends animal{
	void sound() {
		System.out.println("Cat meows");

	}
}
public class overreding {
	

	public static void main(String[] args) {
		animal a1=new animal();
		animal a2=new Dog();
		animal a3=new Cat();
		
		a1.sound();
		a2.sound();
		a3.sound();
		
		// TODO Auto-generated method stub

	}

}
