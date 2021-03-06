package splitting;

public class E07_StringSplit {
	
	
	public static void main(String[] args) {
		String sentance = "This is one very long sentance, but we will split it into separated words!";
		
		String[] parts = sentance.split(" ");
		
		for (String part : parts) {
			System.out.println(part);
		}
		
		System.out.println();
		
		String[] partsClean = sentance.split(".|!|?");
		
		for (String part : partsClean) {
			System.out.println(part);
		}

	}

}
