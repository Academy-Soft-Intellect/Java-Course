
public class MergeSortTest {
	 public static void main(String a[]){
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        
        MergeSort mms = new MergeSort();
        
        mms.sort(inputArr);
        
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
        
    }
}
