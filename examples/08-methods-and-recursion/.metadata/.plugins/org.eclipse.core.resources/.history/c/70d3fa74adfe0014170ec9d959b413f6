import java.util.Random;


public class MultidimetionalArrays {

	public static void main(String[] args) {
		int[][] multiArray = new int[4][5];
		
		Random rand = new Random();
		
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = rand.nextInt(10);
			}
		}
		
		
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.printf("%d ", multiArray[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		int[][] otherMultiArray = new int[][] {
	        new int[] { 1, 2, 3 },
	        new int[] { 1, 2, 3, 4},
	        new int[] { 1, 2, 3, 4, 5, 6, 7, 9},
	        new int[] { 1, 3, 5, 6, 7, 9}
	    };
		
		for (int i = 0; i < otherMultiArray.length; i++) {
			for (int j = 0; j < otherMultiArray[i].length; j++) {
				System.out.printf("%d ", otherMultiArray[i][j]);
			}
			System.out.println();
		}
	}

}
