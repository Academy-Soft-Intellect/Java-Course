import java.util.Scanner;

public class ConsoleReadAndWrite {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Please enter a word: ");
        String word = input.nextLine();

        System.out.println("Please enter an integer:");
        int numInt = input.nextInt();

        System.out.println("Please enter a double:");
        double numDouble = input.nextDouble();

        System.out.println("Entered word: " + word);
        System.out.println("Entered integer: " + numInt);
        System.out.println("Entered double 	: " + numDouble);
        
    }
}