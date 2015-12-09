public class Test {
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sleep();
		c.wakeup();
		c.walk();
		c.run();
		//System.out.println(c.breed);
		
		Dog d = new Dog();
		//d.sleep();
		//d.wakeup();
		d.walk();
		d.run();
		System.out.println(d.breed);
		
	}
}
