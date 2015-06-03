
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {102,34,2,56,7,67,88,42, 90, 81, 22, 34, 33, 44, 1231};
        int[] sorted = selectionSort(arr);
        
        
        
        System.out.println("Сортиран Масив:");
        for(int i:sorted){
            System.out.print(i);
            System.out.print(", ");
        }
	}
	
	public static int[] selectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++){
        	
            int index = i;
            
            for (int j = i + 1; j < arr.length; j++){
            	if (arr[j] < arr[index]){
                    index = j;
            	}
            }
            
            int smallestNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallestNumber;
        }
        return arr;
    }
}
