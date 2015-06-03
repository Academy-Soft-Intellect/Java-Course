package base.items;
import bases.Item;
import bases.Packing;
import bases.Wrapper;

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
