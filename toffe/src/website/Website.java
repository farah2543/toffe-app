package website;

import Users.User;
import Users.Account;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Website {

	private Vector<User> users;
	private Database database;
	private Catalogue catalogue;

	public Boolean validate_info(User user)
	{

		Boolean check = true;
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
			System.out.println("The Phonenumber is invalid.");
			check = false;
		}
		if (!namematcher.matches()) {
			System.out.println("The username is invalid.");
			check = false;
		}
		if (check == false) {
			return false;
		} else {
			return true;
		}
	}
	public Account display_form()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter your Name");
		String Name= sc.nextLine();
		System.out.println("Please Enter your Password");
		String Password= sc.nextLine();
		System.out.println("Please Enter your Email");
		String Email= sc.nextLine();
		System.out.println("Please Enter your Address");
		String Address= sc.nextLine();
		System.out.println("Please Enter your PhoneNumber");
		String PhoneNumber= sc.nextLine();
		Account account=new Account(Name,Email,Password,Address,PhoneNumber);
		return account;
	}
	public void create_user() throws IOException {
		//validate info
		User s = new User();
		s.register();
		while (!validate_info(s)) {
			System.out.println("unSuccessfully registered");
			s.register();
		}
		if (validate_info(s) == true) {
			System.out.println("Successfully registered");
			String fileName = "example.txt";
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.newLine();
			bufferedWriter.write(s.getAccount().get_username());
			bufferedWriter.newLine();
			bufferedWriter.write(s.getAccount().getPassword());
			bufferedWriter.newLine();
			bufferedWriter.write(s.getAccount().get_email());
			bufferedWriter.newLine();
			bufferedWriter.write(s.getAccount().getAddress());
			bufferedWriter.newLine();
			bufferedWriter.write(s.getAccount().getPhone_number());
			bufferedWriter.newLine();

			bufferedWriter.close();


		}


	}

	public Website(){ }
}