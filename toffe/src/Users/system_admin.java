package Users;

import Order_and_items.Item;
import Order_and_items.Order;

import java.util.Vector;

/**
 * Represents a system admin user in the system.
 */
public class system_admin extends User {

    private String name;
    private String ID;
    private Vector < Order > orders;

    /**
     * Adds a new item to the system.
     */
    public void add_new_item () {
        // TODO - implement system_admin.add_new_item
        throw new UnsupportedOperationException ();
    }

    /**
     * Removes an item from the system.
     * @param item The item to be removed.
     */
    public void remove_item (Item item) {
        // TODO - implement system_admin.remove_item
        throw new UnsupportedOperationException ();
    }

    /**
     * Updates the information of an item in the system.
     * @param item The item to be updated.
     * @return The updated item.
     */
    public Item update_item_info (Item item) {
        // TODO - implement system_admin.update_item_info
        throw new UnsupportedOperationException ();
    }

    /**
     * Displays the statistics of the system.
     */
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
    }
}
