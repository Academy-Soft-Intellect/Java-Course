public class Break {
	
	public static void main(String[] args) {
		
		int number = 3;
		int divider = 5;
		int curent_number = 1;
		
		do {
			int result = number * curent_number++;
			
			if (result % divider == 0) {
				System.out.println("Least common multiple (LCM): " +
									 number + " and " + divider + " is " + result);
				break;
			}
		
		} while(true);

	}
}