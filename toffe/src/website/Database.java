package website;

import Order_and_items.Item;
import Users.User;

import java.util.Vector;

public class Database {
//
//	private Vector<User> users;
//	private Vector<Item> items;
//
//	public User get_user() {
//		// TODO - implement Database.get_user
//		throw new UnsupportedOperationException();
//	}
//
//	public void store_user() {
//		// TODO - implement Database.store_user
//		throw new UnsupportedOperationException();
//	}
//
//	public void store_item() {
//		// TODO - implement Database.store_item
//		throw new UnsupportedOperationException();
//	}
//
//	public Item get_item() {
//		// TODO - implement Database.get_item
//		throw new UnsupportedOperationException();
//	}



	private Vector<User> users;
	private Catalogue catalogue;

	public Vector<User> getUsers() {
		return users;
	}

	public void addToVector(User element) {
		users.add(element);
	}
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
    /* public void read_file() throws IOException
     {
         String filePath = "example.txt";
         BufferedReader br = new BufferedReader(new FileReader(filePath));
         users user=new users();
         //read_file();


     }*/
    /*public Item get_item() {
        Item itm = new Item();
        // TODO - implement Database.get_item

        return itm;
    }*/

}