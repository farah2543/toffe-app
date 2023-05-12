package Users;

import website.Website;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Vector;

public class User {

	private Account accounts;

//	public void register() throws IOException {
//		// String fileName = "example.txt";
//		//Account New_account=new Account();
//		Website x = new Website();
//		accounts = x.display_register_form();
//	}

	public Boolean Login(String user_name, String password,Vector<Account>accounts) {

		for (Account acc : accounts) {
			if (Objects.equals(acc.get_username(), user_name)) {
				// If the username exists, check if the password matches

				return acc.getPassword().equals(password);  // If the password matches, will return true
															// If the password does not match, will return false
			}
		}
		// If the username is not found, return false
		return false;
	}


		//String file_name = "example.txt";


		// TODO - implement User.Login


	public User(){

	}
	public Account getAccount()
	{
		return accounts;
	}

	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}
}