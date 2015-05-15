
public class Dog extends Animal implements Moveable {
	
	protected String breed;
	
	public Dog(String breed){
		
	}
	
	public void walk() {
		System.out.println("Dog is walking");
	}

	public void run() {
		System.out.println("Dog is running");
	}
	
}
