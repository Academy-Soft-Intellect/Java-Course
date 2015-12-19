package array;

import java.util.Arrays;
import java.util.Scanner;

public class E01_ArraysSorting {

	public static void main(String[] args) {
		
		System.out.println("Array size:");
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();
		System.out.println();
		
		String[] words = new String[count];
		for (int i = 0; i < count; i++) {
			
			System.out.print("Word: " + (i + 1) + " ");
			
			words[i] = scan.nextLine();
		}
		
		Arrays.sort(words);
		System.out.println();
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		scan.close();

	}

}
