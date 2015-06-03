package dictionary;
import java.util.HashMap;

public class HashMaps {

	public static void main(String[] arguments) {
		
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("George", 5);
		grades.put("Peter", 1);
		grades.put("Alex", 3);
		
		System.out.println(grades.containsKey("Alex"));
		System.out.println(grades.containsValue(5));	
		
		grades.put("Peter", 15);
		
		for (String key : grades.keySet()) {
			System.out.println("" + key + " -> " + grades.get(key));
		}

	}

}
