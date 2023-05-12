package website;

import Order_and_items.Item;
import Users.Account;
import Users.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Database {

	private Vector<Account> accounts = new Vector<>();
	private Vector<User> users  = new Vector<>();
	private Catalogue catalogue;
	public Scanner file_scanner;

	public void load_file(){

		File file = new File("example.txt");
		{
			try {
				file_scanner = new Scanner(file);
			}
			catch (FileNotFoundException e) {
				System.out.println("the file is not opened");

				throw new RuntimeException(e);
			}
		}
		while (file_scanner.hasNextLine()) {
			String username = file_scanner.nextLine();
			String password = file_scanner.nextLine();
			String email = file_scanner.nextLine();
			String address = file_scanner.nextLine();
			String phoneNumber = file_scanner.nextLine();

			// create a new Account object and add it to the vector
			accounts.add(new Account(username, email, password, address, phoneNumber));

			// skip the empty line
			if (file_scanner.hasNextLine()) {
				file_scanner.nextLine();
			}
		}

		file_scanner.close();


	}

	public Vector<Account> getAccounts() {
		return accounts;
	}

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


}