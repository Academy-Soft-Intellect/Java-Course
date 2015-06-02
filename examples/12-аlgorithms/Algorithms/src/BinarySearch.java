public class BinarySearch {

	public static void main(String[] args) {

		int[] array = {1, 2, 4, 5, 6, 77, 111, 224, 432, 1233, 2231};

		int search = 111;

		int first = 0;
		int last = array.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			
			if (array[middle] < search){
				
				first = middle + 1;
				
			} else if (array[middle] == search) {
				
				System.out.format("The number %d is found. The index is %d", search, middle);

				break;
			} else {
				
				last = middle - 1;
				
			}

			middle = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("The number does not exits in the array.");
		}

	}

}
