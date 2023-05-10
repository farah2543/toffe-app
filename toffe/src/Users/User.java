package Users;

import website.Website;

public class User {


	private Account accounts;

	public void register()  {
		//String fileName = "example.txt";
		//Account Newaccount=new Account();
		Website x =new Website();
		accounts = x.display_form();
	}

	public void Login(String name, String password) {
		// TODO - implement User.Login
		System.out.println("Hello world!");

	}
	public User(){

	}
	public Account getAccount()
	{
		return accounts;
	}

}