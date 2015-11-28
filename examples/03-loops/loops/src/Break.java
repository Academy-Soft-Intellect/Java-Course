public class Break {
	
	public static void main(String[] args) {
		
		int number = 2;
		int divider = 7;
		int current_number = 1;
		
		do {
			int result = number * current_number;
			current_number++;
			
			if (result % divider == 0) {
				System.out.println("Least common multiple (LCM): " +
									 number + " and " + divider + " is " + result);
			//	break;
			}
		
		} while(true);

	}
}