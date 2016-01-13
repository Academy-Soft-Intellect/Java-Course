import java.util.Random;


public class E05_StopWatchDemo {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int count = 200000;
		
		int numbers[] = new int[count];
		
		for (int i = 0; i < count; i++) {
			numbers[i] = rand.nextInt();
		}
		
		//MergeSort sorter = new MergeSort();
		SelectionSort sorter = new SelectionSort();
		
		System.out.println("Sorting Started: ");
		
		long startTime = System.currentTimeMillis();
		
		sorter.sort(numbers);
		
		long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		float seconds = (float) totalTime / 1000;
		
		System.out.println("Execution Time: " + seconds);
	}

}
