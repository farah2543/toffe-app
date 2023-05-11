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
	Scanner file_scanner;
	File file = new File("C:\\Users\\DELL\\Desktop\\software\\assignment 3\\CS251-2023-S31-A3-20210386-FinalToffeeSDSv1.0\\toffe-app\\toffe\\example.txt");
	{
		try {
			file_scanner = new Scanner(file);
		}
		catch (FileNotFoundException e) {
			System.out.println("the file is not opened");

			throw new RuntimeException(e);
		}
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

	public void load_file(){

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