package base.items;
import bases.Bottle;
import bases.Packing;
import bases.Wrapper;

public abstract class Burger implements Item {
	
	@Override
	public Packing packing() {
		return new Wrapper();
		
	}
	
	@Override
	public abstract float price();
}
