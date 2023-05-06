package com.example.regestier;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Vector;
import java.util.Scanner;

class Account {

    private String user_name;
    private String password;
    private String e_mail;
    private String address;
    private String phone_number;

    public Account() {

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
       user_name=Name;
       e_mail=Email;
       password=Password;
       address=Address;
       phone_number=PhoneNumber;


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
public class users {

    private Account accounts;

    public void register()  {
        //String fileName = "example.txt";
        Account Newaccount=new Account();
        accounts=Newaccount;
    }

    public void Login(String name, String password) {
        // TODO - implement User.Login
        System.out.println("Hello world!");

    }
    public users(){

    }
    Account getAccount()
    {
        return accounts;
    }

}

class Buyer extends users {

    private Vector<Order> orders;
    private int loyalty_points;

    public Order create_order(Account account)throws IOException {
        Order new_order = new Order();
        new_order.Create_order(Status.processing);
        // TODO - implement Buyer.create_order

        return new_order;
    }



}
 class Website {

     private Vector<users> users;
     private Database database;
     private Catalogue catalogue;

     public Boolean validate_info(users user)
     {

         Boolean check = true;
         String emailRegex = "[A-Za-z]+[0-7]*@[A-Za-z]+.com";
         String usernameRegex = "[A-Za-z]+[0-7]*";
         String phoneRegex = "[0-9]* {6,14}";
         String addressRegex = "[0-9]*[A-za-z]+";
         String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";

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

     public void create_user() throws IOException {
         //validate info
         users s = new users();
         s.register();
         while (validate_info(s) != true) {
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

     Website(){ }
}
