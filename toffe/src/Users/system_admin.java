package Users;

import Order_and_items.Item;
import Order_and_items.Order;

import java.util.Vector;

public class system_admin extends User
{

    private String name;
    private String ID;
    private Vector < Order > orders;

    public void add_new_item ( )
    {
        // TODO - implement system_admin.add_new_item
        throw new UnsupportedOperationException( );
    }

    /**
     * @param item
     */
    public void remove_item (Item item)
    {
        // TODO - implement system_admin.remove_item
        throw new UnsupportedOperationException( );
    }

    /**
     * @param item
     */
    public Item update_item_info (Item item)
    {
        // TODO - implement system_admin.update_item_info
        throw new UnsupportedOperationException( );
    }

    public void view_statistics ( )
    {
        // TODO - implement system_admin.view_statistics
        throw new UnsupportedOperationException( );
    }

    /**
     * @param user
     */
    public void suspend_user (Buyer user)
    {
        // TODO - implement system_admin.suspend_user
        throw new UnsupportedOperationException( );
    }

    public void set_loyalty_shceme ( )
    {
        // TODO - implement system_admin.set_loyalty_shceme
        throw new UnsupportedOperationException( );
    }

    public void view_orders ( )
    {
        // TODO - implement system_admin.view_orders
        throw new UnsupportedOperationException( );
    }

}