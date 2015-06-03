import java.util.Random;


public class ReturnValue {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			
			float width = rand.nextFloat();
			float height = rand.nextFloat();
			
			float area = calculateRectangleArea(width, height);
			
			System.out.printf("Width %f Height %f = Area %f", width, height, area);
			System.out.println();
		}

	}
	
	public static float calculateRectangleArea(float width, float height){
		float area = width * height;
		return area;
	}

}
