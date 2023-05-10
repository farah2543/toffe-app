package Users;

import Order_and_items.Order;
import Order_and_items.Status;

import java.io.IOException;
import java.util.Vector;

public class Buyer extends User {
	private Vector<Order> orders;
	private int loyalty_points;

	public Order create_order()throws IOException {
		Order new_order = new Order();
		new_order.Create_order(Status.processing);
		// TODO - implement Buyer.create_order

		return new_order;
	}
	Buyer(){}
}