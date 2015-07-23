public class ReturnValue {

	public static void main(String[] args) {
	
		float width = 5;
		float height = 4;
		
		float area = calculateRectangleArea(width, height);
		
		System.out.print("Width " + width + "  Height " + height + " = Area " + area);
		System.out.println();

	}
	
	public static float calculateRectangleArea(float width, float height){
		float area = width * height;
		return area;
	}

}
