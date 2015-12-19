package lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IntLists {

	public static void main(String[] args) {
		
//		CANNOT USE PRIMITIVE TYPES DIRECTLY
//		ArrayList<int> intArr = new ArrayList<int>();
		
		List<String> list = new ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
		
		System.out.println(list instanceof List);
		System.out.println(arrayList instanceof List);
		
		System.out.println(list.isEmpty());
		System.out.println(arrayList.isEmpty());
		
		//System.out.println(list.clone());
		System.out.println(arrayList.clone());
		
		List<Integer> numbers = Arrays.asList(5, -3, 10, 25);
		
		ArrayList<Integer> nums = new ArrayList<Integer>(numbers);

		System.out.println(nums.get(0));
		
		System.out.println(nums);
		
		nums.remove(2);
		
		nums.set(0, 101);
		System.out.println(nums);
		
		nums.add(5);
		nums.add(15);
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i)+ " ");
		}

	}

}
