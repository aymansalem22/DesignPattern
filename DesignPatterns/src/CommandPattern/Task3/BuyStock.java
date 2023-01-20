package CommandPattern.Task3;

public class BuyStock implements Order {
	private Stock myStock;

	public BuyStock(Stock someStock) {
		myStock = someStock;
	}

	@Override
	public void execute() {
		this.myStock.buy();

	}

}
