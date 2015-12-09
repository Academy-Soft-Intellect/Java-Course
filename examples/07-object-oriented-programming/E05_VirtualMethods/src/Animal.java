public class Animal {
	
	protected String name;
	public int age;
	
	public Animal(){
		
	}
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public final void sayHello(){
		System.out.println("Hello");
	}
	
	public void sayGoodbye(){
		System.out.println("Goodbye");
	}

}
