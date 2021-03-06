package searching;

public class E05_SearchingInStrings {

	public static void main(String[] args) {
		
		//demonstration - index of
		String javaLang = "Where is Java? Does Java present in the sentance?";
		
		int javaIndex = javaLang.indexOf("Java");
		
		System.out.format("The word: Java is located with index %d \n", javaIndex);
		
		int secondJavaIndex = javaLang.indexOf("Java", javaIndex + 1);
		
		System.out.format("The word: Java is located with index %d \n", secondJavaIndex);
		
		int lastjavaIndex = javaLang.lastIndexOf("Java");
		
		System.out.format("The last word: Java is located with index %d \n", lastjavaIndex);
		
		
		
		//demonstration - starts with	
		String example = "This Java Programming";
		
		boolean startsWith = example.startsWith("Java");
		System.out.format("The sentance begins with thew word \"Java\": %s \n", startsWith);
	
		
		//ends with	
		String coding = "I love coding";
		
		boolean endsWith = coding.endsWith("coding");
		
		System.out.format("The sentance ends with the word \"coding\": %s \n", endsWith);
		
		
		//contains
		String oop = "Java is object oriented language";
		
		boolean contains = oop.contains("object");
		
		System.out.format("The sentance contains the word \"object\": %s \n", contains);
		
		String java  = "Hello world. I love Java!";
		
		contains = java.contains("object");
		
		System.out.format("The sentance contains the word \"object\": %s \n", contains);
		
		
		

	}

}
