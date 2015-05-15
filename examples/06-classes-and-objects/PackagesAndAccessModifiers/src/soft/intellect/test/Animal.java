package soft.intellect.test;

public class Animal {
	
	public String testPublic;
	
	String testDefault;
	
	protected String testProtected;
	
	private String testPrivate;
	
	public Animal(){
		testPublic = "public";
		testDefault = "no modifier";
		testProtected = "protected";
		testPrivate = "private";
	}
	
	public void Print(){
		System.out.println(testPublic);
		System.out.println(testDefault);
		System.out.println(testProtected);
		System.out.println(testPrivate);
	}


}
