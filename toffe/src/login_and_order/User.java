package login_and_order;
import java.lang.String;
import java.util.Vector;

public class User {

	private Account accounts;

	public Account register() {
		// TODO - implement User.register


		return accounts;
	}

	public void Login(String name, String password) {
		// TODO - implement User.Login
		System.out.println("Hello world!");

	}
	public User(){

	}

}

class Buyer extends User {

	private Vector<Order> orders;
	private int loyalty_points;

	public Order create_order(Account account) {
		Order new_order = new Order();
		// TODO - implement Buyer.create_order

		return new_order;
	}


	public void cancle_order(Order order) {
		// TODO - implement Buyer.cancle_order

	}


	public void reorder(Order order) {
		// TODO - implement Buyer.reorder

	}

	public void view_hisory() {
		// TODO - implement Buyer.view_hisory

	}


	public int getLoyalty_points() {
		return loyalty_points;
	}

	public void setLoyalty_points(int loyalty_points) {
		this.loyalty_points = loyalty_points;
	}
}
class system_admin extends User {

	private String name;
	private String ID;
	private Vector<Order> orders;

	public void add_new_item() {
		// TODO - implement system_admin.add_new_item

	}


	public void remove_item(Item item) {
		// TODO - implement system_admin.remove_item

	}


	public Item update_item_info(Item item) {
		// TODO - implement system_admin.update_item_info

		return item;
	}

	public void view_statistics() {
		// TODO - implement system_admin.view_statistics

	}

	public void suspend_user(Buyer user) {
		// TODO - implement system_admin.suspend_user

	}

	public void set_loyalty_shceme() {
		// TODO - implement system_admin.set_loyalty_shceme

	}

	public void view_orders() {
		// TODO - implement system_admin.view_orders

	}

}

class shopping_cart {

	private Vector<Item> items;

	public void add_item() {
		// TODO - implement shopping_cart.add_item

	}

	public void remove_item(Item item) {
		// TODO - implement shopping_cart.remove_item

	}

	public int select_Quantity(int quantity) {
		// TODO - implement shopping_cart.select_Quantity

		return quantity;
	}

}


class Account {

	private String user_name;
	private String password;
	private String e_mail;
	private String address;
	private String phone_number;

	public Account() {
		// TODO - implement Account.Account

	}

}