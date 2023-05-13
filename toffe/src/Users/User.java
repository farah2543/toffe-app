/**

        The User class represents a parent class for all user types and contains methods for logging in and managing user accounts.
        */
        package Users;
        import java.util.Objects;
        import java.util.Vector;

public class User {

    private Account accounts;

    /**
     * This method is used to login a user by checking the given username and password against a list of accounts.
     *
     * @param user_name The username of the account to login to.
     * @param password The password of the account to login to.
     * @param accounts A vector of Account objects containing all existing accounts.
     * @return A boolean value representing whether the login attempt was successful.
     */
    public Boolean Login (String user_name , String password , Vector < Account > accounts)
    {
        for ( Account acc : accounts )
        {
            if ( Objects.equals( acc.get_username( ) , user_name ) )
            {
                // If the username exists, check if the password matches
                this.accounts = acc;

                return acc.getPassword( ).equals( password );  // If the password matches, will return true
                // If the password does not match, will return false
            }
        }

        // If the username is not found, return false
        return false;
    }

    /**
     * Default constructor for the User class.
     */
    public User ( )
    {

    }

    /**
     * Getter method for the Account object associated with this User instance.
     *
     * @return An Account object representing the user's account.
     */
    public Account getAccount ( )
    {
        return accounts;
    }

    /**
     * Setter method for the Account object associated with this User instance.
     *
     * @param accounts An Account object representing the user's account.
     */
    public void setAccounts (Account accounts)
    {
        this.accounts = accounts;
    }
}