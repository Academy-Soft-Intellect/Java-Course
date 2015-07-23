public class MethodsParametersType {
	public static void main(String[] args) {
		
	    int number = 3;
	    System.out.println("the number before is: " + number);
	    printNumber(number);
	    System.out.println("the number after is: " + number);
	    
	    System.out.println();
	    
	    Integer numberArg = 11;
	    System.out.println("the number before is: " + numberArg);
	    printNumberArg(numberArg);
	    System.out.println("the number after is: " + numberArg);
	    
	    System.out.println();
	    
	    int[] arrayArg = {1,2,3};
	    System.out.println("the array before is: " + arrayArg[0] + " " + arrayArg[1] + " " + arrayArg[2]);
	    printArray(arrayArg);
	    System.out.println("the array after is: " + arrayArg[0] + " " + arrayArg[1] + " " + arrayArg[2]);
	    
	    System.out.println();
	    
	    String strArg = "Hello";
	    System.out.println("the string before is: " + strArg);
	    printString(strArg);
	    System.out.println("the string after is: " + strArg);
	    
	}
	
	

	public static void printNumber(int numberParam) {

	    numberParam = 5;
	       
	    System.out.println("the number inside is: " + numberParam);
	}
	
	public static void printNumberArg(Integer number) {

		number = 5;
	       
	    System.out.println("the number inside is: " + number);
	}
	
	public static void printString(String strParam) {
		
		strParam = "Test";
		
		System.out.println("the string inside is: " + strParam);
	}
	
	public static void printArray(int[] arrayParam) {
		
		arrayParam[0] = 9;
		
		System.out.print("the array inside is: ");
		for(int item : arrayParam)
		{
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	public static void printPerson(Person p) {
		p.age = 12;
		System.out.println("the person inside is: " + p.age);
		
	}

}

class Person {
	public int age;
	
	public Person(int age){
		this.age = age;
	}
	
}
