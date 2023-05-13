/**

 The Website class represents a website which provides a platform for users to purchase items.
 The class contains methods to login, register, view catalogue, make orders, check out, and validate user information.
 It also has properties such as Scanner, Database, Catalogue, User, Order, and Buyer.
 The Website constructor is the entry point of the program which asks the user to choose a preferred action and performs the corresponding action.
 If the user chooses to make an order, the constructor checks if the user is logged in, and if not, prompts the user to login.
 The class also contains methods to generate a One-Time Password (OTP), and to validate user information including email, username, phone number, address, and password.
 */

package website;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Random;

import Order_and_items.Item;
import Order_and_items.Order;
import Order_and_items.Status;
import Users.*;
import payment.*;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

<<<<<<< Updated upstream
public class Website {
    Scanner in = new Scanner(System.in);
    private final Database database = new Database();
    //private Vector<Account> accounts = new Vector<>();
    private final Vector<User> users = new Vector<>();
    private final User usr = new User();

    private Buyer buyer;
    private final Order order = new Order();
=======
public class Website
{
    Scanner in = new Scanner(System.in);
    /**
      The Database object for storing and retrieving user account information
     */
     private final Database database = new Database();
     /**
     * The Vector object for storing User objects
     */
     private final Vector<User> users = new Vector<>();
     /**
     * The User object for representing the current user
     */
    private final User usr = new User();
    /**
     * The Buyer object for representing the buyer of the order
     */
    private Buyer buyer;
    /**
     * The Order object for representing the order
     */
    private final Order order = new Order();
    /**
     * The name of the file to store the OTP
     */
>>>>>>> Stashed changes
    public String fileName = "example.txt";
    /**
     * The OTP for the current session
     */
    public int OTP;
<<<<<<< Updated upstream
    private final Catalogue catalogue = new Catalogue();
=======
    /**
     * The Catalogue object for storing and displaying items
     */
    private final Catalogue catalogue = new Catalogue();

    /**
     * The constructor for Website class which initializes the Database and Catalogue objects, and prompts the user to choose a preferred action.
     * If the user chooses to make an order, the constructor checks if the user is logged in, and if not, prompts the user to login.
     * @throws IOException If an I/O error occurs
     */


    /**

     Constructs a website with a database and a catalogue of products

     Allows user to choose action - login, register or view catalogue

     @throws IOException if there is an issue with file input/output
     */
>>>>>>> Stashed changes

    public Website() throws IOException {
        database.load_file();

        System.out.println("Welcome user, please choose the preferred action:");
        System.out.println("1 - Login");
        System.out.println("2 - Register");
        System.out.println("3 - View catalogue");

        int user_choice = in.nextInt();
        in.nextLine();

        switch (user_choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;

            default:
                catalogue.print();
                break;
        }
        catalogue.print();
        System.out.println("do you want to make an order");
        System.out.println("1 - yes");
        System.out.println("2 - NO ");

        int choice = in.nextInt();
        in.nextLine();

<<<<<<< Updated upstream
        if (choice == 1) {
            if (check_login()) {
                catalogue.print();
                order.Create_order();
                check_out();
                order.setStatus(Status.shipping);
                System.out.println("did you deliver the order");
                System.out.println("1 - yes");
                System.out.println("2 - NO ");
=======
        if ( choice == 1 )
        {
            if ( check_login( ) )
            {
                order.Create_order( );
                check_out( );
                order.setStatus( Status.shipping );
                System.out.println( "did you deliver the order" );
                System.out.println( "1 - yes" );
                System.out.println( "2 - NO " );
>>>>>>> Stashed changes
            }

            int shipping_choice = in.nextInt();
            in.nextLine();
            while (shipping_choice == 2) {
                System.out.println("did you deliver the order");
                System.out.println("1 - yes");
                System.out.println("2 - NO ");

                shipping_choice = in.nextInt();
                in.nextLine();
                if (shipping_choice == 1) {
                    order.setStatus(Status.delivered);
                    System.out.println("order has been delivered");
                }

            }

        } else {
            catalogue.print();
        }


    }
    /**

     Logs user into the website
     */

    private void login() {
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
    /**

     Checks if user is logged in, if not, prompts user to login

     @return true if user is logged in, false otherwise
     */

    private boolean check_login() {
        while (usr.getAccount() == null) {
            System.out.println("cannot make order without logging in ");
            login();
        }
        if (usr.getAccount() != null) {
            buyer = new Buyer(usr);
            return true;
        }
        return false;
    }
/**

 Validates user information against regex patterns for email, username, phone number, address and password
 @param user the user to validate information for
 @return true if all information is valid, false otherwise
 . *
  * @param user The user account to validate.
 * @return A boolean indicating whether the user information is valid.
 */

    public Boolean validate_info(User user) {
        boolean check = true;
        String emailRegex = "^(.+)@(.+)$";
        String usernameRegex = "[a-zA-Z0-9_-]{3,16}$";
        String phoneRegex = "^01[0-2,5]{1}[0-9]{8}$";
        String addressRegex = "^[A-Za-z0-9\\\\s]{1,100}$";
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,15}$";

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

        } else {
            String host = "smtp.gmail.com";
            String username = "";//enter your email
            String password = "";//enter your app password generated
            String recipientEmail = "";//enter your email
            String subject = "One-Time Password (OTP)";

            // Generate a random OTP
            int otp = generateOTP();

            // Create the email body with the OTP
            String body = "Your One-Time Password (OTP) is: " + otp;

            // Set TLS properties
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");

            // Create a session with TLS support
            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try {
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(username));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
                message.setSubject(subject);
                message.setText(body);

                // Send the email
                Transport.send(message);

                System.out.println("OTP email sent successfully.");
            } catch (MessagingException e) {
                e.printStackTrace();
            }
            System.out.print("Please enter the OTP sent to your Email");
            Scanner myObj = new Scanner(System.in);
            int x = myObj.nextInt();
            if (x == otp) {
                System.out.println("TRUE OTP ENTERED");
            } else {
                System.out.println("Sorry wrong otp entered ! regestration is cancelled");
                return false;
            }


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
    /**

     Generates a random 6-digit OTP.
     @return an integer value representing the generated OTP
     */

    private static int generateOTP() {
        // Generate a random 6-digit OTP
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }
    /**

     Displays the user registration form and creates a new account for the user.
     @throws IOException if there is an error writing to the file
     */

    public void display_register_form() {
        System.out.println("Please Enter your Name");
        String Name = in.nextLine();
        System.out.println("Please Enter your Password");
        String Password = in.nextLine();
        System.out.println("Please Enter your Email");
        String Email = in.nextLine();
        System.out.println("Please Enter your Address");
        String Address = in.nextLine();
        System.out.println("Please Enter your PhoneNumber");
        String PhoneNumber = in.nextLine();
        Account account = new Account(Name, Email, Password, Address, PhoneNumber);
        usr.setAccounts(account);

<<<<<<< Updated upstream
        while (!validate_info(usr)) {
            System.out.println("unSuccessfully registered");
            display_register_form();
=======
    public void display_register_form ( )
    {
        /**

         Prompts the user to fill in their registration details and creates a new account.
         */
        System.out.println( "Please Enter your Name" );
        String Name = in.nextLine( );
        System.out.println( "Please Enter your Password" );
        String Password = in.nextLine( );
        System.out.println( "Please Enter your Email" );
        String Email = in.nextLine( );
        System.out.println( "Please Enter your Address" );
        String Address = in.nextLine( );
        System.out.println( "Please Enter your PhoneNumber" );
        String PhoneNumber = in.nextLine( );
        Account account = new Account( Name , Email , Password , Address , PhoneNumber );
        usr.setAccounts( account );

        while ( !validate_info( usr ) )
        {
            System.out.println( "unSuccessfully registered" );
            display_register_form( );
>>>>>>> Stashed changes
        }


    }
    /**

     Writes the user's account information to a file.

     @throws IOException if there is an error writing to the file
     */

    public void create_user() {
        display_register_form();

        System.out.println("Successfully registered");

        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
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
        } catch (IOException e) {
            System.out.println("file not opened");
            e.printStackTrace();
        }
    }

    public void register() throws IOException {
        create_user();

    }
    /**

     Prompts the user to choose between their original address or a new address for shipping.
     */


    public void choose_shipping_address() {

        System.out.println("do you want to use your original address");
        System.out.println("1 - yes");
        System.out.println("2 - NO i want to user another address");
        int user_choice = in.nextInt();
        in.nextLine();

        switch (user_choice) {
            case 1:
                order.setShipping_address(buyer.getAccount().getAddress());
                break;
            case 2:
                System.out.println("please enter desired address");
                String address = in.nextLine();
                order.setShipping_address(address);
                break;

            default:
                System.out.println("Invalid choice, please try again.");
                break;
        }
    }
    /**

     Prompts the user to select a payment method and sets it for the order.

     @return the payment method chosen by the user
     */


    public Payment_method set_method() {

        System.out.println("please enter the preferred payment method from the following ");
        System.out.println("1 - cash on delivery");
        System.out.println("2 - E-wallet");
        System.out.println("3 - Gift voucher");
        int user_choice = in.nextInt();
        in.nextLine();

        switch (user_choice) {
            case 1:
                order.setPay_method(new cash());
                break;
            case 2:
                order.setPay_method(new Ewallet());
                break;
            case 3:
                order.setPay_method(new Gift_voucher());
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                break;
        }
        return order.getPay_method();
    }
    /**

     This method allows the user to check out their items and place an order.

     @return the order object.
     */

    public Order check_out() {
        try {
            order.Create_order();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
<<<<<<< Updated upstream
        set_method();
        order.pay();
        choose_shipping_address();
        ;
        order.setStatus(Status.processing);
        System.out.println("order has been successfully placed ");
=======
        order.getCart().print_cart();
        System.out.println("your total is " +order.getPrice());
        set_method( );
        order.pay( );
        choose_shipping_address( );

        order.setStatus( Status.processing );
        System.out.println( "order has been successfully placed " );
>>>>>>> Stashed changes


        return order;


    }


}