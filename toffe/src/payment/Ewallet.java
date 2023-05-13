
<<<<<<< Updated upstream
public class Ewallet implements Payment_method {

=======
/**

 Ewallet class implements the Payment_method interface and provides functionality for making payments using E-wallets.
 */
package payment;
public class Ewallet implements Payment_method
{
>>>>>>> Stashed changes
    /**
     * Pay method for making payments using E-wallets.
     *
     * @param amount The amount to be paid.
     */
<<<<<<< Updated upstream
    public void Pay(double amount) {
=======
    @Override
    public void Pay (double amount)
    {
>>>>>>> Stashed changes
        // TODO - implement Ewallet.pay
        throw new UnsupportedOperationException();
    }

}