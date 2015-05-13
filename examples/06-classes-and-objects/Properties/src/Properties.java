
public class Properties {

	public static void main(String[] args) {
		Cat josefine = new Cat("Josefine", "Persian", 2);
		
		josefine.sayMiau(true);
		
		printSeparator();
		
		josefine.sayMiau(false);	
		
		printSeparator();
		
		Cat harriet = new Cat("Harriet", "Siamese", 5);
		
		harriet.sayMiau(true);
		
		printSeparator();
		
		harriet.setAge(-2);
		
		
		harriet.sayMiau(true);
		
		printSeparator();
	}
	
	public static void printSeparator(){
		
		System.out.println("\n=============================================================\n");
	}

}
