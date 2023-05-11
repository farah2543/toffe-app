package website;
import Users.User;
import Users.Account;
import payment.Ewallet;
import payment.Gift_voucher;
import payment.Payment_method;
import payment.cash;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Website {
	Scanner in = new Scanner(System.in);

	private Database database  = new Database();
	//private Vector<Account> accounts = new Vector<>();
	private Vector<User> users= new Vector<>() ;
	private User usr = new User();

	private Catalogue catalogue;

	public Boolean validate_info(User user)
	{

		boolean check = true;
		String emailRegex = "[A-Za-z]+[0-7]*@[A-Za-z]+.com";
		String usernameRegex = "[A-Za-z]+[0-7]*";
		String phoneRegex = "[0-9]*";
		String addressRegex = "[0-9]*[A-za-z]+";
		String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]$";

		Pattern emailpattern = Pattern.compile(emailRegex);
		Matcher emailmatcher = emailpattern.matcher(user.getAccount().get_email());

		Pattern namepattern = Pattern.compile(usernameRegex);
		Matcher namematcher = namepattern.matcher(user.getAccount().get_username());

		Pattern phonepattern = Pattern.compile(phoneRegex);
		Matcher phonematcher = phonepattern.matcher(user.getAccount().getPhone_number());

		Pattern addressPattern = Pattern.compile(addressRegex);
		Matcher addressMatcher = addressPattern.matcher(user.getAccount().getAddress());

		Pattern passwordPattern = Pattern.compile(passwordRegex);
		Matcher passwordMatcher = passwordPattern.matcher(user.getAccount().getPassword());

		if (!emailmatcher.matches()) {
			System.out.println("The email address is invalid.");
			check = false;

		}
		if (!passwordMatcher.matches()) {
			System.out.println("The password is invalid.");
			check = false;

		}
		if (!addressMatcher.matches()) {
			System.out.println("The  address is invalid.");
			check = false;
		}
		if (!phonematcher.matches()) {
			System.out.println("The Phone number is invalid.");
			check = false;
		}
		if (!namematcher.matches()) {
			System.out.println("The username is invalid.");
			check = false;
		}
		return check;
	}
	public Account display_register_form()
	{

		System.out.println("Please Enter your Name");
		String Name= in.nextLine();
		System.out.println("Please Enter your Password");
		String Password= in.nextLine();
		System.out.println("Please Enter your Email");
		String Email= in.nextLine();
		System.out.println("Please Enter your Address");
		String Address= in.nextLine();
		System.out.println("Please Enter your PhoneNumber");
		String PhoneNumber= in.nextLine();
		Account account =new Account(Name,Email,Password,Address,PhoneNumber);
		return account;
	}
	public void create_user() throws IOException {
		//validate info

		usr.register();
		while (!validate_info(usr)) {
			System.out.println("unSuccessfully registered");
			usr.register();
		}
		if (validate_info(usr)) {
			System.out.println("Successfully registered");
			String fileName = "example.txt";
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.newLine();
			bufferedWriter.write(usr.getAccount().get_username());
			bufferedWriter.newLine();
			bufferedWriter.write(usr.getAccount().getPassword());
			bufferedWriter.newLine();
			bufferedWriter.write(usr.getAccount().get_email());
			bufferedWriter.newLine();
			bufferedWriter.write(usr.getAccount().getAddress());
			bufferedWriter.newLine();
			bufferedWriter.write(usr.getAccount().getPhone_number());
			bufferedWriter.newLine();

			bufferedWriter.close();


		}
	}


	private void check_login() {
		boolean logged_in = false;

		while (!logged_in) {
			System.out.println("Please enter your username:");
			String name = in.nextLine();

			System.out.println("Please enter your password:");
			String password = in.nextLine();

			logged_in = usr.Login(name, password, database.getAccounts());

			if (logged_in) {
				System.out.println("Logged in successfully.");
			} else {
				System.out.println("Invalid username or password. Please try again.");
			}
		}
	}





	public Website() {
		database.load_file();

		System.out.println("Welcome user, please choose the preferred action:");
		System.out.println("1 - Login");
		System.out.println("2 - Register");
		System.out.println("3 - View catalogue");

		int user_choice = in.nextInt();
		in.nextLine();

		switch (user_choice) {
			case 1:
				check_login();
				break;
			case 2:
				display_register_form();
				break;
			case 3:
				// TODO: Call view catalogue method
				break;
			default:
				System.out.println("Invalid choice, please try again.");
				break;
		}
	}

}