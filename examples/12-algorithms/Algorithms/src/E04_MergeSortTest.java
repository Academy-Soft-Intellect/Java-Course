public class E04_MergeSortTest {

	public static void main(String a[]) {

		int[] arr = { 102, 34, 2, 56, 7, 67, 88, 42, 90, 81, 22, 34, 33, 44, 1231 };
		MergeSort sorter = new MergeSort();
		sorter.sort(arr);

		System.out.println("Sorted Array:");
		for (int i : arr) {
			System.out.print(i);
			System.out.print(", ");
		}
	}
}
