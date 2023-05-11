package Order_and_items;
import Users.Account;
import Users.User;
import payment.*;
import website.Catalogue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Order {
	Scanner in = new Scanner(System.in);

	private String ID;
	private User user = new User();
	//private Vector<Item> item;
	private Payment_method Pay_method;
	private shopping_cart cart;
	private String shipping_address;
	private Status status;
	private double price;

	public void setStatus(Status Status1) {
		this.status = Status1;
	}


	public Status getStatus() {
		return status;
	}

	public void Create_order(Status status) throws IOException {
		//TODO-need some changes as the buyer could choose more than one item
		//this tests that the function of creation order  in processing status like search for item by name ,brand adding to cart and select Quantity

		Catalogue y = new Catalogue();

		if (status == Status.processing) {
			shopping_cart cart1 = new shopping_cart();

			System.out.println("select option to select items");
			System.out.println("1-search item by name");
			System.out.println("2-add item to cart");
			System.out.println("3-search item by brand");
			System.out.println("4-Exist");


			int choice = in.nextInt();

			while (choice != 4) {
				Item x = new Item();

				if (choice == 3) {
					Vector<Item> itmssearched = new Vector<>();
					System.out.println("search by branch");
					String input = in.nextLine();
					itmssearched = y.search_itembyBrand(input);

					System.out.println("those are items searched by this brand");
					for (int i = 0; i < itmssearched.size(); i++) {
						System.out.println(itmssearched.get(i).getName());
					}
				}
				if (choice == 1) {
					System.out.println("Please enter name of item to select it");
					String name = in.next();
					x = y.search_itembyName(name);
				}
				if (choice == 2) {
					cart = cart1;
					cart.add_item(x);
					cart.select_Quantity();
					// System.out.println(cart.getCartitems().get(0).getQuantity());
				}
				choice = in.nextInt();
			}

		}
	}
	public void pay(){
		try {
			Create_order(Status.processing);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		System.out.println("do you want to use loyalty points ?");
		System.out.println("1 - yes");
		System.out.println("2 - NO");
		int user_choice = in.nextInt();
		if (user_choice==1){
			Payment_method p = new loyalty_points();
			p.Pay(price);
		}
		getPay_method();
		Pay_method.Pay(price);

	}
	public String getShipping_address(){
		System.out.println("do you want to use your original address");
		System.out.println("1 - yes");
		System.out.println("2 - NO i want to user another address");
		int user_choice = in.nextInt();
		in.nextLine();

		switch (user_choice) {
			case 1:
				shipping_address = // account.address
				break;
			case 2:
				System.out.println("please enter desired address");
				String address = in.nextLine();
				shipping_address = address;
				break;
			case 3:
				Pay_method = new Gift_voucher();
				break;
			default:
				System.out.println("Invalid choice, please try again.");
				break;
		}
		return shipping_address;


	}



	public Order() {
		pay();

	}



	public Payment_method getPay_method() {

		System.out.println("please enter the preferred payment method from the following ");
		System.out.println("1 - cash on delivery");
		System.out.println("2 - E-wallet");
		System.out.println("3 - Gift voucher");
		int user_choice = in.nextInt();
		in.nextLine();

		switch (user_choice) {
			case 1:
				Pay_method = new cash();
				break;
			case 2:
				Pay_method = new Ewallet();
				break;
			case 3:
				Pay_method = new Gift_voucher();
				break;
			default:
				System.out.println("Invalid choice, please try again.");
				break;
		}
		return Pay_method;
	}



	public void setPay_method(Payment_method pay_method) {
		Pay_method = pay_method;
	}
}
