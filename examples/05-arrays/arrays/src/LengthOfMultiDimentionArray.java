public class LengthOfMultiDimentionArray {

	public static void main(String[] args) {
		int[][] ourArray = { 
			{ 1, 2, 3 }, 
			{ 55, 56, 57, 58, 59 }, 
			{ 111, 112 } 
		};
		
		System.out.println(ourArray.length);
		System.out.println(ourArray[0].length);
		System.out.println(ourArray[1].length);
		System.out.println(ourArray[2].length);

	}
}
