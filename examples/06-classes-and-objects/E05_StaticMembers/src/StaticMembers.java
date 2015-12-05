public class StaticMembers {

	public static void main(String[] args) {
		
		Car audi = new Car("Audi", "A7");
		System.out.print("Cars count: " + Car.carsCount);
		System.out.println();
		
		Car bmw = new Car("BMW", "X6");
		System.out.print("Cars count: " + Car.carsCount);
		System.out.println();
		
		Car vw = new Car("Volkswagen", "Touareg");
		System.out.print("Cars count: " + Car.carsCount);
		System.out.println();
	}

}
