package Users;

import java.util.Objects;
import java.util.Vector;

public class User
{

    private Account accounts;


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



    // TODO - implement User.Login


    public User ( )
    {

    }

    public Account getAccount ( )
    {
        return accounts;
    }

    public void setAccounts (Account accounts)
    {
        this.accounts = accounts;
    }
}