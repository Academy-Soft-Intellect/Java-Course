public class Animal extends Creature {

	private float height;
	
	public Animal(){
		setAge(0);
		setHeight(0f);
	}
	
	public Animal(int age, float height){
		setAge(age);
		setHeight(height);
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

//	public void greet() {
//		System.out.println("I am na animal and I am " + super.age +	" years old.");
//		System.out.println("My Height is " + this.height);
//	}
}
