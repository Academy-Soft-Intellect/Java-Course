import java.util.Scanner;


public class NestedIfConstruction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Please enter an integer:");
		int numInt = input.nextInt();
	        
		if (numInt % 2 == 0){
			if(numInt > 10){
				System.out.println("The number is even and larger then 10!");
			} else {
	            System.out.println("The number is even and smaller then 10!");
			}
		} else {
	            System.out.println("The number is odd!");
		}
		input.close();
	}

}
