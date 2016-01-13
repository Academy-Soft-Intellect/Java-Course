package base.items;
import bases.Bottle;
import bases.Packing;
import bases.Wrapper;

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}
