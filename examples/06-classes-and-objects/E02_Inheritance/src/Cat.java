public class Cat extends Pet{
	
	private String breed;
	
	public Cat(){
		super();
		this.breed = "";
	}
	
	public Cat(String name, int age, String breed){
		super(name, age);
		
		setBreed(breed);
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void sayBreed(){
		System.out.println("My breed is n" + this.breed);
	}
}
