/**

<<<<<<< Updated upstream
public class cash implements Payment_method {

=======
 This class represents a cash payment method that implements the Payment_method interface.
 */
package payment;
public class cash implements Payment_method
{
>>>>>>> Stashed changes
    /**
     * Verifies the phone number entered by the user.
     * @param phone_num the phone number entered by the user
     * @return true if the phone number is valid, false otherwise
     */
    public boolean verify_phone(String phone_num) {
        // TODO - implement cash.verify_phone
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the Pay method from the Payment_method interface.
     * @param amount the amount to be paid by the user
     */
    @Override
<<<<<<< Updated upstream
    public void Pay(double amount) {

=======
    public void Pay (double amount)
    {
        // TODO - implement cash.Pay
>>>>>>> Stashed changes
    }

}