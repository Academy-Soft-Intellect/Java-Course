
public class AlgorithmComplexitySimple {

	public static void main(String[] args) {
		
//		Даден е масив подреден във възходящ ред 
//		намерете всички двойки еднакви числа

		
		int[] numbers = {1, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, 9, 11, 12, 13, 14, 14, 15, 15};
		
		int countCouples = 0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				
				int first = numbers[i];
				int second = numbers[j];
				
				if(first == second){
					countCouples++;
					break;
				}
			}
		}
		
		//Сложност на алгоритъма O(N^2)
		
		
		System.out.println("Брой двойки: " + countCouples);
//		
//		
//		countCouples = 0;
//		
//		for (int i = 1; i < numbers.length; i++) {
//			
//			int first = numbers[i - 1];
//			int second = numbers[i];
//			
//			if (first == second) {
//				countCouples++;
//			}
//		}
//		
//		System.out.println("Брой двойки: " + countCouples);
		
		//Сложност на алгоритъма O(N^2)
		
		
	}

}
