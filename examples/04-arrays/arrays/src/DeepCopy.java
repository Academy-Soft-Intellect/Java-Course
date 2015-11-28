
public class DeepCopy {
	public static void main(String[] args) {
		
		int[] test = { 1, 2, 3, 4, 5 };
		
		for (int i : test) {
			System.out.print(i + " ");
		}
		
		int[] deepCopyTest = new int[test.length];
		
		for (int i = 0; i < test.length; i++) {
			deepCopyTest[i] = test[i];
		}
		
		System.out.println();

		for (int i : deepCopyTest) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		deepCopyTest[2] = 55;
		
		for (int i : test) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		for (int i : deepCopyTest) {
			System.out.print(i + " ");
		}
	}
}
