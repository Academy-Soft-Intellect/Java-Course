public abstract class BubbleSort {
	
	private static boolean flag = true;
	private static Car temp;
	
	BubbleSort() {
		flag = true;
	}

	public static Car[] sort(Car[] cars) {
		while (flag) {
			
			flag = false;
			
			for (int i = 0; i < cars.length - 1; i++) {
				if (cars[i].getPrice() > cars[i + 1].getPrice()) {
					temp = cars[i];
					cars[i] = cars[i + 1];
					cars[i + 1] = temp;
					flag = true;
				}
			}
		}
		flag = true;
		return cars;
	}
}
