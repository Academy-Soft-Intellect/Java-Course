public class StringComparison {
	
	 public static void main(String[] args) {
		 
		 String str = "Hello";
		 System.out.println(str);
		 
		 String newStr = str;
		 System.out.println(newStr);
		 
		 if (str == newStr) {
			 System.out.println("str == newStr");
		 }
		 
		 String he = "He";
		 String llo = "llo";
		 String finalStr = he + llo;
		 System.out.println(finalStr);
		 
		 if (str == finalStr) {
			 System.out.println("str == finalStr");
		 }
		 
		 if (str.equals(newStr)) {
			 System.out.println("str.equals(newStr)");
		 }
		 if (str.equals(finalStr)) {
			 System.out.println("str.equals(finalStr)");
		 }	
	}
}
