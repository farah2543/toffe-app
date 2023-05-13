
/**

 The Account class represents a user account with essential information such as name, email, password, address, and phone number.
 */
package Users;
<<<<<<< Updated upstream

public class Account {
=======
public class Account {
    /**
     * The user's username.
     */
>>>>>>> Stashed changes
    private final String user_name;
    /**
     * The user's password.
     */
    private final String password;

    /**
     * The user's email address.
     */
    private final String e_mail;

    /**
     * The user's address.
     */
    private final String address;

    /**
     * The user's phone number.
     */
    private final String phone_number;

<<<<<<< Updated upstream
    public Account(String Name, String Email, String Password, String address1, String phoneNumber) {

=======
    /**
     * Constructs an Account object with the specified user information.
     *
     * @param Name        the user's username.
     * @param Email       the user's email address.
     * @param Password    the user's password.
     * @param address1    the user's address.
     * @param phoneNumber the user's phone number.
     */
    public Account ( String Name , String Email , String Password , String address1 , String phoneNumber ) {
>>>>>>> Stashed changes

        this.user_name = Name;
        this.e_mail = Email;
        this.password = Password;
        this.address = address1;
        this.phone_number = phoneNumber;

    }

<<<<<<< Updated upstream
    public String get_email() {
=======
    /**
     * Returns the user's email address.
     *
     * @return the user's email address.
     */
    public String get_email () {
>>>>>>> Stashed changes

        return e_mail;
    }

<<<<<<< Updated upstream
    public String get_username() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
=======
    /**
     * Returns the user's username.
     *
     * @return the user's username.
     */
    public String get_username () {
        return user_name;
    }

    /**
     * Returns the user's password.
     *
     * @return the user's password.
     */
    public String getPassword () {
        return password;
    }

    /**
     * Returns the user's address.
     *
     * @return the user's address.
     */
    public String getAddress () {
>>>>>>> Stashed changes

        return address;
    }

<<<<<<< Updated upstream
    public String getPhone_number() {
=======
    /**
     * Returns the user's phone number.
     *
     * @return the user's phone number.
     */
    public String getPhone_number () {
>>>>>>> Stashed changes

        return phone_number;
    }
}