public class VariableScope {

	public static void main(String[] args) {

		if(true){
			String test = "Test";
		}
		//System.out.println(test);

	}
	public static void print(int[] args) {
		
		int d = 12;
		
		for(int item : args){
			int p = 5;
			System.out.println(item);
		}
		//System.out.println(p);
		
		System.out.println(d);
		
	}
}
