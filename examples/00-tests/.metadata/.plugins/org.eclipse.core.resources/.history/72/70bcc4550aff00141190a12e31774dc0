package homework6;

public class Lecturer extends Person implements CheckHomework {

	public static final int maxLectures = 10;
	private String university;

	public Lecturer() {
		super();
	}
	
	public Lecturer(String name, String lastName, int yearsOfWork) {
		super(name, lastName, yearsOfWork);
	}
	
	public Lecturer(String name, String lastName, int yearsOfWork, String university) {
		super(name, lastName, yearsOfWork);
		this.university = university;
	}
	
	@Override
	public void checkHomework() {
		System.out.println("Lecturer: checking homework.");
	}
	
	public void exercise() {
		System.out.println("Lecturer: default exercise.");
	}
	
	public void exercise(String exercise1) {
		System.out.println("Lecturer: exercise 1 - " + exercise1 + ".");
	}
	
	public void exercise(String exercise1, String exercise2) {
		System.out.println("Lecturer: exercise 1 - " + exercise1 + ".");
		System.out.println("Lecturer: exercise 2 - " + exercise2 + ".");
	}
	
	public void helloGreet() {
		System.out.println("Lecturer: Hello!");
	}
}
