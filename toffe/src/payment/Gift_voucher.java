/**

<<<<<<< Updated upstream
public class Gift_voucher implements Payment_method {

=======
 The Gift_voucher class represents a gift voucher that implements the Payment_method interface.
 It can be used to pay for an order by calling the Pay method.
 A gift voucher has a code that can be used to redeem the value of the voucher.
 */
package payment;
public class Gift_voucher implements Payment_method
{

    private String code;

    /**
     * This method pays for the order using the gift voucher.
     *
     * @param amount the amount to be paid
     * @throws UnsupportedOperationException if the method is not implemented
     */
    public void Pay(double amount) {
        // TODO - implement Gift_voucher.pay
        throw new UnsupportedOperationException();
    }


    public void buy_voucher() {
    }


    /**
     * This method buys a new gift voucher with a unique code.
     *
     * @throws UnsupportedOperationException if the method is not implemented
     * */


}