package CommandPattern.Task3;

public class SellStock implements Order {
	private Stock myStock;

	public SellStock(Stock someStock) {
		this.myStock = someStock;
	}

	@Override
	public void execute() {
		this.myStock.sell();
	}

}
