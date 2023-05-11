package payment;


public class loyalty_points implements Payment_method {

	public static double price;
	double point = 0.1;
	public void Pay(double amount) {
		price = amount - amount*point;
	}

}