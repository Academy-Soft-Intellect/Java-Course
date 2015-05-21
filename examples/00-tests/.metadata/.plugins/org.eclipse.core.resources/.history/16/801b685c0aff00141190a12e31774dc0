package homework6;

public class Teacher extends Person implements CheckHomework {

	private String subjectName;
	
	public Teacher() {
		super();
	}
	
	public Teacher(String name, String lastName, int yearsOfWork) {
		super(name, lastName, yearsOfWork);
	}
	
	public Teacher(String name, String lastName, int yearsOfWork, String subjectName) {
		super(name, lastName, yearsOfWork);
		this.subjectName = subjectName;
	}

	@Override
	public void checkHomework() {
		System.out.println("Teacher: checking homework.");
	}
	
	public void helloGreet() {
		System.out.println("Teacher: Hello!");
	}
	
	public void goodbyeGreet() {
		System.out.println("Teacher: Goodbye!");
	}
}
