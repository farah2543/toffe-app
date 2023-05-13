package Users;

import Order_and_items.Order;

import java.io.IOException;
import java.util.Vector;

public class Buyer extends User
{
    private Vector < Order > orders;
    private int loyalty_points;

    public Buyer (User user)
    {
        this.setAccounts(user.getAccount());
    }
}