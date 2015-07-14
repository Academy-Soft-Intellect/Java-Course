import java.util.Scanner;

public class IfElseConstruction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in,"UTF-8");

        System.out.println("Please enter an integer:");
        int numInt = input.nextInt();
        
        if (numInt % 2 == 0){
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }

        if(numInt > 0 && numInt <=10){
            System.out.println("The number is in the interval (0;10]");
        } else if (numInt > 10 && numInt < 50){
            System.out.println("The number is in the interval (10;50)");
        } else if (numInt >= 50 && numInt < 1000 ){
            System.out.println("The number is in the interval [50;1000)");
        } else {
            System.out.println("The number is out of the interval");
        }

       

    	input.close();
    }
}
