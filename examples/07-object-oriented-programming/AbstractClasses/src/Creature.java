public abstract class Creature {
	
	protected int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void greet()
	{
		System.out.print("Creature");
	}
}
