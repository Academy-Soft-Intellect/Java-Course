public class StaticMembers {

	public static void main(String[] args) {
		
		Car audi = new Car("Audi", "A7");
		
		System.out.print("Cars count: " + Car.carsCount);
		System.out.print("First car: " + audi.getModel() + " " + audi.getBrand());
		System.out.println();
		
		Car bmw = new Car("BMW", "X6");
		
		System.out.print("Cars count: " + Car.carsCount);
		System.out.print("First car: " + bmw.getModel() + " " + bmw.getBrand());
		System.out.println();
		
		Car vw = new Car("Volkswagen", "touareg");
		
		System.out.print("Cars count: " + Car.carsCount);
		System.out.print("First car: " + vw.getModel() + " " + vw.getBrand());
		System.out.println();
	}

}
