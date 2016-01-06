
public class Recursion {

	public static void main(String[] args) {
		int result = print(1);
		System.out.println(result);
		
		

	}
	
	public static int print(int n){
		if (n == 6 + 1){
			return 0;
		}
		System.out.println(n);
		n++;
		int sum = print(n);
		return  sum+ n-1;
	}

}
