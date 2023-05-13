/*
The loyalty_points class implements the Payment_method interface and represents a payment method using loyalty points.
        */
package payment;
<<<<<<< Updated upstream


public class loyalty_points implements Payment_method {

=======
public class loyalty_points implements Payment_method {
    /**
     * The price of the order after applying the loyalty points discount.
     */
>>>>>>> Stashed changes
    public static double price;

    /**
     * The point rate used to calculate the discount.
     */
    double point = 0.1;

<<<<<<< Updated upstream
    public void Pay(double amount) {
=======
    /**
     * Calculates the price of the order after applying the loyalty points discount.
     * @param amount The total price of the order before the discount is applied.
     */
    @Override
    public void Pay (double amount) {
>>>>>>> Stashed changes
        price = amount - amount * point;
    }

}