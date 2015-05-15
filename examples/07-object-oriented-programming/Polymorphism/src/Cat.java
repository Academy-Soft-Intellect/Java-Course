
public class Cat extends Animal implements Moveable, Sleepable {
	
	public void wakeup() {
		System.out.println("Cat is awake");
	}

	public void sleep() {
		System.out.println("Cat is sleeping");
	}

	public void walk() {
		System.out.println("Cat is walking");
	}

	public void run() {
		System.out.println("Cat is running");
	}

}
