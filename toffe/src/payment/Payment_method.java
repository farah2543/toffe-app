/**

 This interface defines the common methods for any payment method.
 */
package payment;
public interface Payment_method
{
    /**
     * This method is used to process payment for a given amount.
     * @param amount The amount to be paid.
     */
    void Pay (double amount);

}