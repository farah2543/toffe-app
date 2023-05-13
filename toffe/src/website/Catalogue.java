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

<<<<<<< Updated upstream
public class Catalogue {

    //private final Vector<category> categories= new Vector<>();
    private final Vector<Item> items = new Vector<>();

    public Catalogue() throws FileNotFoundException {
        //TODO- we will change this (it's crooky) I put some categories to work on it4
        read_catalog();
=======
/**
 * A class representing a catalog of items.
 * It contains a vector of items and allows searching for items by name or brand,
 * as well as printing the entire catalog.
 */
public class Catalogue
{
    private final Vector < Item > items = new Vector <>( );

    /**
     * Constructor for Catalogue class. Reads the catalog from a file and populates the vector of items.
     * @throws FileNotFoundException if the file "catalog_example.txt" is not found.
     */

    public Catalogue ( ) throws FileNotFoundException
    {
        read_catalog( );
>>>>>>> Stashed changes

    }
    /**
     * Searches for an item in the catalog by name.
     * @param Name the name of the item to search for.
     * @return the item if found, or null if not found.
     * @throws FileNotFoundException if the file "catalog_example.txt" is not found.
     */

    public Item search_itembyName(String Name) throws FileNotFoundException {

        for (Item i : items) {
            if (Objects.equals(i.getName(), Name)) {
                return i;

            }
        }
        return null;
    }
    /**
     * Searches for all items in the catalog with a given brand name.
     * @param brand the brand name to search for.
     * @return a vector of all items in the catalog with the given brand name.
     * @throws FileNotFoundException if the file "catalog_example.txt" is not found.
     */

    public Vector<Item> search_itembyBrand(String brand) throws FileNotFoundException {
        Vector<Item> myitms = new Vector<>();
        for (Item i : items) {
            if (i.getBrand().equals(brand)) {
                myitms.add(i);
            }
        }
        return myitms;
    }
    /**
     * Reads the catalog from a file and populates the vector of items.
     * @throws FileNotFoundException if the file "catalog_example.txt" is not found.
     */


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
    /**
     * Prints the entire catalog.
     */

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