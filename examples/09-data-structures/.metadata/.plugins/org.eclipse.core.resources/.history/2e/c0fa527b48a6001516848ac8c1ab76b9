package lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E02_3_ArrayToListAndViceVersa {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ivan");
		list.add("Konstantin");
		list.add("Atanas");
		list.add("Todor");
		
		//Object[] arrayFromList = list.toArray();
		String[] arrayFromList = list.toArray(new String[list.size()]);
		
		printPeople(arrayFromList);
		
		String[] array = new String[]{
				"Maria",
				"Ivana",
				"Georgia",
				"Ivelina"};
		
		List<String> listFromArray = Arrays.asList(array);
		
		printPeople(listFromArray);
			
	}

	private static void printPeople(List<String> listFromArray) {
		for (String item : listFromArray) {
			System.out.println(item);
		}
		System.out.println();
	}

	private static void printPeople(String[] arrayFromList) {
		for (String str : arrayFromList) {
			System.out.println(str);
		}
		System.out.println();
	}

}
