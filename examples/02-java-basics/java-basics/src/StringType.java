public class StringType {
	
    public static void main(String[] args) {
        String firstName = "Lazar ";
        String lastName = "Sestrimski";
        System.out.println("Hello, " + firstName);

        String fullName = firstName + " " + lastName;
        System.out.println("My Name is : " + fullName);
        System.out.println("Total number of my name is : " + firstName.length());

        int number = 45;
        System.out.println("My number is " + number);
        
        String escaping = "C:\\Test.txt ";
        System.out.println(escaping);
    }
}