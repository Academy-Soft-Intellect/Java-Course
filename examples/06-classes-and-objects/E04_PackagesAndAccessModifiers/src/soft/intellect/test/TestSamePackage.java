package soft.intellect.test;

public class TestSamePackage {

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.testPublic);
		System.out.println(a.testDefault);
		System.out.println(a.testProtected);

	}

}
