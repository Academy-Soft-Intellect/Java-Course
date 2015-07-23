
public class ParamsArray {

	public static void main(String[] args) {
		
		printWords("Lovely");
		
		printWords("Apple", "Orrange", "Bannana");
		
		printWords("Lada", "Opel", "BMV", "WV");

	}
	
	public static void printWords(String... words) {
	    for (String word : words) {
	        System.out.print(word + " ");
	    }
	    
	    System.out.println();
	}

}
