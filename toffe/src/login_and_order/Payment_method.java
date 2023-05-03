package login_and_order;
import java.lang.String;
public interface Payment_method {

	void Pay(double amount);

}

class cash implements Payment_method {


	public boolean verify_phone(String phone_num) {
		// TODO - implement cash.verify_phone
		throw new UnsupportedOperationException();
	}

	@Override
	public void Pay(double amount) {
		// TODO - implement cash.pay

	}
}

class Ewallet implements Payment_method {


	@Override
	public void Pay(double amount) {
		// TODO - implement Ewallet.pay
		throw new UnsupportedOperationException();
	}
}

class Gift_voucher implements Payment_method {

	private String code;

	@Override
	public void Pay(double amount) {
		throw new UnsupportedOperationException();

	}

	public void buy_voucher() {
		// TODO - implement Gift_voucher.buy_voucher
		throw new UnsupportedOperationException();
	}


}
class loyalty_points implements Payment_method {

	@Override
	public void Pay(double amount) {
		// TODO - implement loyalty_points.pay
		throw new UnsupportedOperationException();
	}
}
