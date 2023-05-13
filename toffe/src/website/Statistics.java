/**

 The Statistics class provides methods to calculate and view statistical information about the items in the system.
 */
package website;

import Order_and_items.Item;

import java.util.Vector;

<<<<<<< Updated upstream
public class Statistics {

    private Vector<Item> items;
    private double monthly_sales;
    private double daily_sales;

    public double calc_sales() {
=======
public class Statistics
{private Vector < Item > items;
    private double monthly_sales;
    private double daily_sales;

    /**
     * Calculates the total sales of the items in the system.
     *
     * @return the total sales of the items in the system
     */
    public double calc_sales ( )
    {
>>>>>>> Stashed changes
        // TODO - implement Statistics.calc_sales
        throw new UnsupportedOperationException();
    }

<<<<<<< Updated upstream
    public Item get_pop_item() {
=======
    /**
     * Returns the most popular item in the system.
     *
     * @return the most popular item in the system
     */
    public Item get_pop_item ( )
    {
>>>>>>> Stashed changes
        // TODO - implement Statistics.get_pop_item
        throw new UnsupportedOperationException();
    }

<<<<<<< Updated upstream
    public double get_monthly_sales() {
=======
    /**
     * Returns the total monthly sales of the items in the system.
     *
     * @return the total monthly sales of the items in the system
     */
    public double get_monthly_sales ( )
    {
>>>>>>> Stashed changes
        // TODO - implement Statistics.get_monthly_sales
        throw new UnsupportedOperationException();
    }

<<<<<<< Updated upstream
    public double get_daily_sales() {
=======
    /**
     * Returns the total daily sales of the items in the system.
     *
     * @return the total daily sales of the items in the system
     */
    public double get_daily_sales ( )
    {
>>>>>>> Stashed changes
        // TODO - implement Statistics.get_daily_sales
        throw new UnsupportedOperationException();
    }

<<<<<<< Updated upstream
    public void view_statistics() {
=======
    /**
     * Displays statistical information about the items in the system.
     */
    public void view_statistics ( )
    {
>>>>>>> Stashed changes
        // TODO - implement Statistics.view_statistics
        throw new UnsupportedOperationException();
    }
}