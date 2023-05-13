package Users;

import Order_and_items.Item;
import Order_and_items.Order;

import java.util.Vector;

<<<<<<< Updated upstream
=======
/**
 * Represents a system admin user in the system.
 */
>>>>>>> Stashed changes
public class system_admin extends User {

    private String name;
    private String ID;
    private Vector<Order> orders;

<<<<<<< Updated upstream
    public void add_new_item() {
        // TODO - implement system_admin.add_new_item
        throw new UnsupportedOperationException();
=======
    /**
     * Adds a new item to the system.
     */
    public void add_new_item () {
        // TODO - implement system_admin.add_new_item
        throw new UnsupportedOperationException ();
>>>>>>> Stashed changes
    }

    /**
     * Removes an item from the system.
     * @param item The item to be removed.
     */
<<<<<<< Updated upstream
    public void remove_item(Item item) {
        // TODO - implement system_admin.remove_item
        throw new UnsupportedOperationException();
=======
    public void remove_item (Item item) {
        // TODO - implement system_admin.remove_item
        throw new UnsupportedOperationException ();
>>>>>>> Stashed changes
    }

    /**
     * Updates the information of an item in the system.
     * @param item The item to be updated.
     * @return The updated item.
     */
<<<<<<< Updated upstream
    public Item update_item_info(Item item) {
        // TODO - implement system_admin.update_item_info
        throw new UnsupportedOperationException();
    }

    public void view_statistics() {
        // TODO - implement system_admin.view_statistics
        throw new UnsupportedOperationException();
=======
    public Item update_item_info (Item item) {
        // TODO - implement system_admin.update_item_info
        throw new UnsupportedOperationException ();
>>>>>>> Stashed changes
    }

    /**
     * Displays the statistics of the system.
     */
<<<<<<< Updated upstream
    public void suspend_user(Buyer user) {
        // TODO - implement system_admin.suspend_user
        throw new UnsupportedOperationException();
    }

    public void set_loyalty_shceme() {
        // TODO - implement system_admin.set_loyalty_shceme
        throw new UnsupportedOperationException();
    }

    public void view_orders() {
        // TODO - implement system_admin.view_orders
        throw new UnsupportedOperationException();
=======
    public void view_statistics () {
        // TODO - implement system_admin.view_statistics
        throw new UnsupportedOperationException ();
    }

    /**
     * Suspends a buyer user in the system.
     * @param user The user to be suspended.
     */
    public void suspend_user (Buyer user) {
        // TODO - implement system_admin.suspend_user
        throw new UnsupportedOperationException ();
    }

    /**
     * Sets the loyalty scheme of the system.
     */
    public void set_loyalty_shceme () {
        // TODO - implement system_admin.set_loyalty_shceme
        throw new UnsupportedOperationException ();
    }

    /**
     * Displays all orders in the system.
     */
    public void view_orders () {
        // TODO - implement system_admin.view_orders
        throw new UnsupportedOperationException ();
>>>>>>> Stashed changes
    }
}
