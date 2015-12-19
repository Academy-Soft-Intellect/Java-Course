package set;
import java.util.HashSet;

public class E03_Sets {
	
	public static void main(String[] arguments) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Peter");
		set.add("Tosho");
		set.add("Peter");
		set.add("George");
		set.add("Maria");
		set.add("Alice");
		
		System.out.println(set);
		System.out.println();
		
		set.add("George");
		
		
		System.out.println(set);
		System.out.println();
		
		set.remove("George");
		
		System.out.println(set);
		System.out.println();

		System.out.println(set.contains("Maria"));
		System.out.println();
		
		System.out.println(set);
		System.out.println();


	}
}
