public class ArithmeticOperations {
	
    public static void main(String[] args) {

        int x = 5;
        System.out.print("x = ");
        System.out.println(x);

        int y = 2;
        System.out.print("y = ");
        System.out.println(y);

        int c = x + y;
        System.out.print("x + y = ");
        System.out.println(c);

        c = x - y;
        System.out.print("x - y = ");
        System.out.println(c);

        c = x * y;
        System.out.print("x * y = ");
        System.out.println(c);

        c = x / y;
        System.out.print("integer x / y = "); 
        System.out.println(c);

        float d = (float) x / y;
        System.out.print("floating point x / y = ");
        System.out.println(d);

        c = x % y;
        System.out.print("x % y = ");
        System.out.println(c);

        x++;
        System.out.print("x++");
        System.out.println(x);

        y++;
        System.out.print("y++");
        System.out.println(y);
        
//        float sum = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
//        System.out.print("Sum of 10 times 0.1f = ");
//        System.out.println(sum);
    }
}
