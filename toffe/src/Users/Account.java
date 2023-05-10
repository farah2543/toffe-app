package Users;
public class Account
{
	private String user_name;

	private String password;

	private String e_mail;
	private String address;
	private String phone_number;

	public Account(String Name, String Email, String Password, String address, String phoneNumber) {


		user_name=Name;
		e_mail=Email;
		password=Password;
		address =address;
		phone_number=phoneNumber;


	}

	public String get_email()
	{

		return e_mail;
	}
	public String get_username()
	{
		return user_name;
	}
	public String getPassword()
	{
		return  password;
	}

	public String getAddress() {

		return address;
	}
	public String getPhone_number()
	{

		return phone_number;
	}

}

