package concatenation;

public class SpeedTestConcatenation {

	public static void main(String[] args) {
		String concatenator = "Repeated Sentances ";
		String str = "";
		
		long start1 =  System.currentTimeMillis();
		for(int i = 0; i < 100; i++){
			str += concatenator;
		}
		long end1 = System.currentTimeMillis();
		long result1 = end1 - start1;
		System.out.println("The result in milisecunds: " + (result1) + " = " + (result1 / 1000) + " secoonds!");
		
		
		StringBuilder sb = new StringBuilder();
		
		long start2 =  System.currentTimeMillis();
		for(int i = 0; i < 100; i++){
			sb.append(concatenator);
		}
		long end2 = System.currentTimeMillis();
		
		long result2 = end2 - start2;
		System.out.println("The result in milisecunds: " + (result2) + " = " + (result2 / 1000) + " secoonds!");
		
		System.out.println("Comparing two string and the results is: " + sb.toString().equals(str));
		

	}

}
