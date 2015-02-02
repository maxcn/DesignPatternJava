package Command;

import Builder.Item;
import Builder.Packing;

public class SellStock implements Order {
	private Stock abcStock;
	
	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}
	@Override
	public void execute() {
		abcStock.sell();
	}


}
