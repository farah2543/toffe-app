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
	private Payment_method pay_method;

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

	public void setPay_method(Payment_method pay_method) {
		pay_method = pay_method;
	}
	public Payment_method getPay_method(){
		return pay_method;
	}

	public String getShipping_address() {
		return shipping_address;
	}

	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	public double getPrice (){
		return price;
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
		pay_method.Pay(price);

	}

	public Order() {


	}







}
