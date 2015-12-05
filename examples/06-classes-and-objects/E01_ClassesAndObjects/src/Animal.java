public class Animal {
	
	String name;
	int age;
	
	public Animal(){
		this.name = "";
		this.age = 0;
	}
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void bark(){
		System.out.println("Bowwow, I am " + this.name + "!");
		System.out.println("Bowwow, I am " + this.age + " years old dog!");
	}

}
