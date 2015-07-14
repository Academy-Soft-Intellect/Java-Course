import java.util.Scanner;

public class IfConstruction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in,"UTF-8");

        System.out.println("Please enter an integer:");
        int numInt = input.nextInt();
        if (numInt == 100) {
            System.out.println("The number is 100");
        }      

    	input.close();
    }
}
