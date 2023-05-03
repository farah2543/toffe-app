package login_and_order;
import java.util.Vector;
import java.lang.String;
public class Order {

	private String ID;
	private Vector<Item> item;
	private Payment_method Pay_method;
	private Buyer buyer;
	private String shipping_address;
	private Status status;
	private double price;

	public Payment_method get_method() {
		cash cash_on_delivery = new cash();
		// TODO - implement Order.get_method
		return cash_on_delivery;
	}

	public int get_loyalty_points(Buyer buyer) {
		return buyer.getLoyalty_points();
	}

	public Buyer get_buyer() {
		return buyer;

	}

}

enum Status {
	shipping,processing, delivered
}
