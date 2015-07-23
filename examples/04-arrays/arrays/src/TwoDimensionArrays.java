public class TwoDimensionArrays {

	public static void main(String[] args) {
		
		int[][] ourArray = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		for(int row = 0; row < ourArray.length; row++){
			for(int col = 0; col < ourArray[row].length; col++){
				
				System.out.print(ourArray[row][col] + " ");
			}
			System.out.println();
		}

	}
}
