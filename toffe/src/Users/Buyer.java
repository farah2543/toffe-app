/**

 A class that represents a Buyer which is a type of User in the system.
 It has a vector of Orders and loyalty points.
 */
package Users;
import Order_and_items.Order;

import java.io.IOException;
import java.util.Vector;

public class Buyer extends User {
<<<<<<< Updated upstream
    private Vector<Order> orders;
    private int loyalty_points;

    public Buyer(User user) {
        this.setAccounts(user.getAccount());
=======
    private Vector < Order > orders;
    private int loyalty_points;

    /**
     * Constructs a Buyer object with the given User object.
     *
     * @param user The User object used to construct a Buyer object.
     */
    public Buyer ( User user ) {
        this.setAccounts( user.getAccount() );
>>>>>>> Stashed changes
    }
}