
public class MethodsWithParameter {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 7, 9, 11};
		
		System.out.print("Printing String: ");
		print("Hello Java");
		
		System.out.print("Printing Number: ");
		print(2015);
		
		System.out.println("Printing Array:");
		print(arr);


	}
	
	public static void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Item arr[%d]: %d", i, arr[i]);
			System.out.println();
		}
	}
	
	public static void print(int number){
		System.out.println(number);
	}
	
	public static void print(String word){
		System.out.println(word);
	}

}
