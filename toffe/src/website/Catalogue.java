package website;

import Order_and_items.Item;
import Order_and_items.category;
import Order_and_items.type;
import jdk.jfr.Category;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Catalogue {

    //private final Vector<category> categories= new Vector<>();
    private final Vector<Item> items = new Vector<>();

    public Catalogue() throws FileNotFoundException {
        //TODO- we will change this (it's crooky) I put some categories to work on it4
        read_catalog();

    }

    public Item search_itembyName(String Name) throws FileNotFoundException {

        for (Item i : items) {
            if (Objects.equals(i.getName(), Name)) {
                return i;

            }
        }
        return null;
    }

    public Vector<Item> search_itembyBrand(String brand) throws FileNotFoundException {
        Vector<Item> myitms = new Vector<>();
        for (Item i : items) {
            if (i.getBrand().equals(brand)) {
                myitms.add(i);
            }
        }
        return myitms;
    }


    public void read_catalog() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("catalog_example.txt"));
        Scanner input = new Scanner(reader);
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            input.nextLine();
            String itemNAme = input.nextLine();
            String categoryName = input.nextLine();
            String typeName = input.next();
            input.nextLine();
            String description = input.nextLine();
            double price = input.nextDouble();
            double disc = input.nextDouble();
            String brandName = input.next();
            double quant = input.nextDouble();
            category cat = new category(categoryName);
            Item newItem = new Item(itemNAme, cat, description, price, brandName);
            if (Objects.equals(typeName, "loose")) {
                newItem.setType(type.Loose);
            }
            if (Objects.equals(typeName, "sealed")) {
                newItem.setType(type.Sealed);
            }
            newItem.setQuantity(quant);
            newItem.setDiscount_per(disc);
            cat.addToVector(newItem);
            items.add(newItem);
        }
    }

    public void view_cataloge() {
        for (Item i : items) {
            System.out.println("The catalog contains: ");
            System.out.println("the item name: " + i.getName());
            System.out.println("the item category name: " + i.getCategory().getName());
            System.out.println("the item type: " + i.getType());
            System.out.println("the item description: " + i.get_description());
            System.out.println("the item price: " + i.getPrice());
            System.out.println("the item brand :" + i.getBrand());
            System.out.println('\n');

        }
    }
}