package more.methods;

import java.util.Scanner;

public class E08_MoreStringMethods {

	public static void main(String[] args) {
		String hobby = "My hobby is swimming";
		
		String modified = hobby.replace("swimming", "coding");
		
		System.out.println(modified);
		
		System.out.println(modified.toUpperCase());
		System.out.println(modified.toLowerCase());
		
		String something = "    Something    Test   ";
		
		System.out.println(something.trim());

	}

}
