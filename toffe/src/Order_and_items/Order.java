package Order_and_items;

import Users.User;
import payment.*;
import website.Catalogue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Order {
    Scanner input_scanner = new Scanner(System.in);

    private String ID;
    private User user = new User();
    //private Vector<Item> item;
    private Payment_method pay_method;

    private final shopping_cart cart = new shopping_cart();
    private String shipping_address;
    private Status status;
    private double total_price;

    public void setStatus(Status Status1) {
        this.status = Status1;
    }


    public Status getStatus() {
        return status;
    }

    public void setPay_method(Payment_method pay_method) {
        this.pay_method = pay_method;
    }

    public Payment_method getPay_method() {
        return pay_method;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public double getPrice() {
        return total_price;
    }

    public void Create_order() throws IOException {

        //TODO-need some changes as the buyer could choose more than one item
        //this tests that the function of creation order  in processing status like search for item by name ,brand adding to cart and select Quantity


        Catalogue cat = new Catalogue();

        System.out.println("select option to select items");
        System.out.println("1-search item by name");
        System.out.println("2-add item to cart");
        System.out.println("3-search item by brand");
        System.out.println("4-Exist");

        int choice = input_scanner.nextInt();
        Item x = new Item();
        while (choice != 4) {

            input_scanner.nextLine();

            if (choice == 3) {
                Vector<Item> itmssearched = new Vector<>();
                System.out.println("search by branch");
                String input = input_scanner.nextLine();
                itmssearched = cat.search_itembyBrand(input);

                System.out.println("those are items searched by this brand");
                for (int i = 0; i < itmssearched.size(); i++) {
                    System.out.println(itmssearched.get(i).getName());
                }
            }
            if (choice == 1) {

                System.out.println("Please enter name of item to select it");
                String name = input_scanner.nextLine();
                x = cat.search_itembyName(name);
                System.out.println(x.getName());

            }
            if (choice == 2) {
                cart.add_item(x);
                cart.select_Quantity(x);
                // System.out.println(cart.getCartitems().get(0).getQuantity());
            }
            System.out.println("select option to select items");
            System.out.println("1-search item by name");
            System.out.println("2-add item to cart");
            System.out.println("3-search item by brand");
            System.out.println("4-Exist");

            choice = input_scanner.nextInt();


        }

        calc_price();


    }

    public void calc_price() {
        for (Item i : cart.getCartitems()) {
            total_price += i.getPrice() * i.getQuantity();
        }

    }

    public void pay() {

        System.out.println("do you want to use loyalty points ?");
        System.out.println("1 - yes");
        System.out.println("2 - NO");
        int user_choice = input_scanner.nextInt();
        if (user_choice == 1) {
            Payment_method p = new loyalty_points();
            p.Pay(total_price);
        }
        pay_method.Pay(total_price);

    }

    public Order() {


    }


}
