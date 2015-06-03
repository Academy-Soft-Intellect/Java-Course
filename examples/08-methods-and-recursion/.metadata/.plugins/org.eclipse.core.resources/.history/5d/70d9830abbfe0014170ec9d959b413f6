import java.util.Random;


public class VariableScope {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		System.out.printf("Max Number %d ", max);
		System.out.println();

	}

}
