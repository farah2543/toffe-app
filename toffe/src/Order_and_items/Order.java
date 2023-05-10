package Order_and_items;
import payment.*;
import Users.Buyer;
import website.Catalogue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Order {

	private String ID;
	private Vector<Item> item;
	//private Payment_method Pay_method;
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
		Scanner sc = new Scanner(System.in);
		if (status == Status.processing) {
			shopping_cart cart1 = new shopping_cart();

			System.out.println("select option  to select items");
			System.out.println("1-search by item");
			System.out.println("2-add item to cart");
			System.out.println("3-search item by brand");
			System.out.println("4-Exist");


			int choice = sc.nextInt();

			while (choice != 4)
			{
				Item x = new Item();

				if (choice == 3) {
					Vector<Item> itmssearched = new Vector<>();
					System.out.println("search by branch");
					String input = sc.nextLine();
					itmssearched = y.search_itembyBrand(input);

					System.out.println("those are items searched by this brand");
					for (int i = 0; i < itmssearched.size(); i++) {
						System.out.println(itmssearched.get(i).getName());
					}
				}
				if (choice==1) {
					System.out.println("Please enter name of item to select it");
					String name = sc.next();
					x = y.search_itembyName(name);
				}
				if (choice == 2) {
					cart = cart1;
					cart.add_item(x);
					cart.select_Quantity();
					// System.out.println(cart.getCartitems().get(0).getQuantity());
				}
				choice = sc.nextInt();
			}

		}
	}
	public Order(){};

}