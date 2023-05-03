package login_and_order;
import java.lang.String;
import java.util.Vector;

public class Item {

	private String name;
	private category category;
	private type type;
	private String description;
	private double price;
	private int discount_per;
	private String brand;

	private int quantity;

	public Item() {
		// TODO - implement Item.Item
	}

}
enum type {
	loose,Sealed
}

class category {

	private String name;
	private Vector<Item> items;

}