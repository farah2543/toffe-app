/**

 The Order class represents an order made by a user from a catalog of items available for purchase.
 It includes methods for creating an order, calculating the total price of the order, and making a payment.
 */
package Order_and_items;

import Users.User;
import payment.*;
import website.Catalogue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
public class Order {

    Scanner input_scanner = new Scanner(System.in);

    private String ID;
    private User user = new User();
    private Payment_method pay_method;

    private final shopping_cart cart = new shopping_cart();
    private String shipping_address;
    private Status status;
    private double total_price;

    /**
     * Set the status of the order to the given status.
     *
     * @param Status1 the new status of the order.
     */
    public void setStatus(Status Status1) {
        this.status = Status1;
    }

    /**
     * Get the status of the order.
     *
     * @return the status of the order.
     */
    public Status getStatus() {
        return status;
    }

    public shopping_cart getCart () {
        return cart;
    }

    /**
     * Set the payment method of the order to the given payment method.
     *
     * @param pay_method the new payment method for the order.
     */
    public void setPay_method(Payment_method pay_method) {
        this.pay_method = pay_method;
    }

    /**
     * Get the payment method of the order.
     *
     * @return the payment method of the order.
     */
    public Payment_method getPay_method() {
        return pay_method;
    }

    /**
     * Get the shipping address for the order.
     *
     * @return the shipping address for the order.
     */
    public String getShipping_address() {
        return shipping_address;
    }

    /**
     * Set the shipping address for the order to the given address.
     *
     * @param shipping_address the new shipping address for the order.
     */
    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    /**
     * Get the total price of the order.
     *
     * @return the total price of the order.
     */
    public double getPrice() {
        return total_price;
    }

    /**
     * Create an order by searching for items by name or brand and adding them to the shopping cart.
     *
     * @throws IOException if there is an input/output error.
     */
    /**

     The Create_order method is used to create an order by searching for an item by name or brand, adding it to the shopping cart,

     and selecting a quantity for each item. This method also calculates the total price of the order by calling the calc_price method.

     @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    public void Create_order() throws IOException {
//TODO-need some changes as the buyer could choose more than one item
//this tests that the function of creation order in processing status like search for item by name ,brand adding to cart and select Quantity

        Catalogue cat = new Catalogue();

        System.out.println("select option to select items");
        System.out.println("1-search item by name");
        System.out.println("2-add item to cart");
        System.out.println("3-search item by brand");
        System.out.println("4-Exist");

        int choice = input_scanner.nextInt();
        Item x = new Item();
        while (choice != 4) {
            input_scanner.nextLine();

            if (choice == 3) {
                Vector<Item> itmssearched = new Vector<>();
                System.out.println("search by branch");
                String input = input_scanner.nextLine();
                itmssearched = cat.search_itembyBrand(input);

                System.out.println("those are items searched by this brand");
                for (int i = 0; i < itmssearched.size(); i++) {
                    System.out.println(itmssearched.get(i).getName());
                }
            }
            if (choice == 1) {

                System.out.println("Please enter name of item to select it");
                String name = input_scanner.nextLine();
                x = cat.search_itembyName(name);
                System.out.println(x.getName());

            }
            if (choice == 2) {
                cart.add_item(x);
                cart.select_Quantity(x);
                // System.out.println(cart.getCartitems().get(0).getQuantity());
            }
            System.out.println("select option to select items");
            System.out.println("1-search item by name");
            System.out.println("2-add item to cart");
            System.out.println("3-search item by brand");
            System.out.println("4-Exist");

            choice = input_scanner.nextInt();

        }


    calc_price();

}
    /**

     This method calculates the total price of the items in the shopping cart by multiplying each item's price by its quantity
     and adding it to the total price of the order.
     */
    public void calc_price ( )
    {
        for ( Item i : cart.getCartitems( ) )
        {
            total_price += i.getPrice( ) * i.getQuantity( );
        }
    }

    /**

     This method allows the user to pay for the order using the payment method they selected. If they choose to use loyalty points,

     it will use the loyalty_points payment method to deduct the appropriate amount of points from their account. Otherwise, it

     will use the payment method selected by the user to charge them the total price of the order.
     */
    public void pay ( )
    {

        System.out.println( "do you want to use loyalty points ?" );
        System.out.println( "1 - yes" );
        System.out.println( "2 - NO" );
        int user_choice = input_scanner.nextInt( );
        if ( user_choice == 1 )
        {
            Payment_method p = new loyalty_points( );
            p.Pay( total_price );
        }
        pay_method.Pay( total_price );

    }

    /**

     This is the constructor for the Order class. It does not take any arguments, but it initializes the shopping cart, which is
     used to store the items in the order, to an empty cart.
     */
    public Order ( )
    {
    }

}
