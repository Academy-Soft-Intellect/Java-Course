public class Permutation {
	
	public static void main(String[] args) {
	
		int num = 3;
		
		StringBuilder firstPermutation = new StringBuilder();
				
		for (int i = 1; i <= num; i++) {
			
			firstPermutation.append(i);
		}
		
		permutation("", firstPermutation.toString());
	}

	private static void permutation(String prefix, String str) {
		
		int n = str.length();
		
		
		if (n == 0){
			
			print(prefix);
		}
		else {
			for (int i = 0; i < n; i++){
			
				permutation(prefix + str.charAt(i),	str.substring(0, i) + str.substring(i + 1));
			}
		}
	}
	public static void print(String prefix){
		
		System.out.print("{ ");
		
		for (int i = 0; i < prefix.length(); i++) {
			System.out.print(prefix.charAt(i) + " ");
		}
		
		System.out.print("}");
		System.out.println();
	}

}
