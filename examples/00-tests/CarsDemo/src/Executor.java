public class Executor {

	public static void main(String[] args) {
		Car[] cars = new Car[10];
		Car[] sortedCars;
		int n1 = 5;
		int n2 = 10;
		double price = 0;
		double fuelConsumption = 0;
		
		for (int i = 0; i < n1; i++) {
			price = 10000 * (n1 - i);
			fuelConsumption = 10 * i;
			cars[i] = new Automobile(price, fuelConsumption);
		}
		
		for (int i = n1; i < n2; i++) {
			price = 20000 * (n2 - i);
			cars[i] = new SUV(price, (i % 2 == 0) ? true : false);
		}
		
		System.out.println("Cars:");
		for (int i = 0; i < cars.length; i++) {
			System.out.println("car number " + (i + 1) + " has price = " + cars[i].getPrice());
		}
		
		System.out.println();
		
		sortedCars = BubbleSort.sort(cars);
		System.out.println("Cars sorted by price:");
		for (int i = 0; i < sortedCars.length; i++) {
			System.out.println("car number " + (i + 1) + " has price = " + sortedCars[i].getPrice());
		}
	}

}
