public class Ex09_RecursiveFibonacciMemoization {

	public static long[] numbers;
	  
	public static void main(String[] args) {
		
	        int n = 45;
	 
	        numbers = new long[n + 2];
	        numbers[1] = 1;
	        numbers[2] = 1;
	 
	        long result = fibonacci(n);
	        System.out.println("Fib " + n + " = " + result);
	    }
	 
	    public static long fibonacci(int n) {
	        if (numbers[n] == 0) {
	            numbers[n] = fibonacci(n - 1) + fibonacci(n - 2);
	        }
	 
	        return numbers[n];

	}

}
