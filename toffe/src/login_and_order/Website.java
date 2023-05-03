package login_and_order;
import java.util.Vector;
public class Website {

	private Vector<User> users;
	private Statistics statistics;
	private Database database;
	private Catalogue catalogue;

	public void view_Catalogue() {
		// TODO - implement Website.view_Catalogue

	}

	public boolean validate_info(User user) {
		// TODO - implement Website.validate_info

		return false;
	}

	public void display_form() {
		// TODO - implement Website.display_form

	}

	public void create_user() {
		// TODO - implement Website.create_user

	}

	public void send_OTP() {
		// TODO - implement Website.send_OTP

	}

}

class Database {

	private Vector<User> users;
	private Vector<Item> items;

	public User get_user() {
		User user = new User();
		// TODO - implement Database.get_user

		return user;
	}

	public void store_user() {
		// TODO - implement Database.store_user

	}

	public void store_item(Item item) {
		// TODO - implement Database.store_item

	}

	public Item get_item() {
		Item itm = new Item();
		// TODO - implement Database.get_item

		return itm;
	}

}
class Statistics {

	private Vector<Item> items;
	private double monthly_sales;
	private double daily_sales;

	public double calc_sales() {

		// TODO - implement Statistics.calc_sales

		return daily_sales;
	}

	public Item get_pop_item() {
		// TODO - implement Statistics.get_pop_item
		Item itm = new Item();
		return itm;

	}

	public double get_monthly_sales() {
		// TODO - implement Statistics.get_monthly_sales
		return monthly_sales;

	}

	public double get_daily_sales() {
		// TODO - implement Statistics.get_daily_sales

		return daily_sales;
	}

	public void view_statistics() {
		// TODO - implement Statistics.view_statistics

	}

}

class Catalogue {

	private Vector<category> categories;

	public Item search_item(String name) {
		Item itm = new Item();
		return itm;

		// TODO - implement Catalogue.search_item

	}

	public void view_category(category category) {
		// TODO - implement Catalogue.view_category

	}

}