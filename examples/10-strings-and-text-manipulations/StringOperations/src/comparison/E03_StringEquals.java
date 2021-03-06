package comparison;

public class E03_StringEquals {

	public static void main(String[] args) {
		
		String first = "I am writing in Java!";
		
		String partOne = "I am";
		
		String partTwo = " writing in ";
		
		String partThree = "Java!";
		
		String second = partOne + partTwo + partThree;
		
		String third = second;
		
		boolean refComparisonFirstSecond = first == second;
		
		System.out.format("Reference comparison between firts and second with ==: %s \n", refComparisonFirstSecond);
		
		boolean refComparisonSecondThird = second == third;
		
		System.out.format("Reference comparison between second and third with ==: %s \n", refComparisonSecondThird);
		
		boolean valueComparisonFirstSecond = first.equals(second);
		
		System.out.format("Value comparison between first and second with equals: %s \n", valueComparisonFirstSecond);
		
		boolean valueComparisonSecondThird = second.equals(third);
		
		System.out.format("Value comparison between second and third with equals: %s \n", valueComparisonSecondThird);

	}
}
