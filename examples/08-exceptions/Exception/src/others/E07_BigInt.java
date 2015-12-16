package others;

import java.math.BigInteger;

public class E07_BigInt {

	public static void main(String[] args) {
		
		BigInteger bigInt1 = BigInteger.valueOf(5);
		System.out.println(bigInt1);
		BigInteger bigInt2 = BigInteger.valueOf(20);
		System.out.println(bigInt1.add(bigInt2));
		
		System.out.println();
		
		BigInteger bigInt3 = BigInteger.valueOf(Long.MAX_VALUE);
		System.out.println(bigInt3);
		BigInteger bigInt4 = BigInteger.valueOf(Long.MAX_VALUE);
		System.out.println(bigInt3.add(bigInt4));
		
		System.out.println();
		System.out.println(bigInt3.multiply(bigInt4));

		

	}

}
