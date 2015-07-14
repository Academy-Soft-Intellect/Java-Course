public class AndOrFullOperation {
	
	 public static void main(String[] args) {
		 int d = 5;
		 
		 if (d== 7 && d++ ==6){
			 System.out.println("Without entering here!");
		 }
		 System.out.println(d);
		 
		 if (d== 7 & d++ ==6){
			 System.out.println("Without entering here!");
		 }
		 System.out.println(d);
		 
		 int p = 7;
		 
		 if (p == 7 || p++ == 8){
			 System.out.println("Entering here!");
		 }
		 System.out.println(p);
		 
		 if (p == 7 | p++ == 8){
			 System.out.println("Entering here!");
		 }
		 System.out.println(p);
	 }
	

}
