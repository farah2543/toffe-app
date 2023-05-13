/**

 The Item class represents an item that can be added to an order.
 It contains information such as the name, category, type, description, price, discount, brand and quantity of the item.
 */
package Order_and_items;
<<<<<<< Updated upstream

public class Item {

=======
public class Item {
    /**
     * The name of the item.
     */
>>>>>>> Stashed changes
    private String name;

    /**
     * The category of the item.
     */
    private category category;

    /**
     * The type of the item.
     */
    private type type;

    /**
     * The description of the item.
     */
    private String description;

    /**
     * The price of the item.
     */
    private double price;

    /**
     * The discount percentage of the item.
     */
    private double discount_per;

    /**
     * The brand of the item.
     */
    private String brand;

    /**
     * The quantity of the item.
     */
    private double quantity;
<<<<<<< Updated upstream

    public Item() {
    }
=======
>>>>>>> Stashed changes

    /**
     * Creates a new empty item.
     */
    public Item () {
    }

<<<<<<< Updated upstream
    public Item(String Name, category category1, String Description, double Price, String Brand) {
=======
    /**
     * Creates a new item with the given name, category, description, price and brand.
     *
     * @param Name        the name of the item
     * @param category1   the category of the item
     * @param Description the description of the item
     * @param Price       the price of the item
     * @param Brand       the brand of the item
     */
    public Item ( String Name , category category1 , String Description , double Price , String Brand ) {
>>>>>>> Stashed changes
        name = Name;
        category = category1;
        description = Description;
        price = Price;
        brand = Brand;
    }

<<<<<<< Updated upstream

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public void setDiscount_per(double discount_per) {
        this.discount_per = discount_per;
    }

    public double getDiscount_per() {
        return discount_per;
    }


    public double getPrice() {
        return price;
    }

    public Order_and_items.category getCategory() {
        return category;
    }

    public void setType(type type) {
        this.type = type;
    }

    public type getType() {
=======
    /**
     * Sets the quantity of the item.
     *
     * @param quantity the quantity of the item
     */
    public void setQuantity ( double quantity ) {
        this.quantity = quantity;
    }

    /**
     * Returns the quantity of the item.
     *
     * @return the quantity of the item
     */
    public double getQuantity () {
        return quantity;
    }

    /**
     * Returns the name of the item.
     *
     * @return the name of the item
     */
    public String getName () {
        return name;
    }

    /**
     * Returns the description of the item.
     *
     * @return the description of the item
     */
    String getDescription () {
        return description;
    }

    /**
     * Returns the brand of the item.
     *
     * @return the brand of the item
     */
    public String getBrand () {
        return brand;
    }

    /**
     * Sets the discount percentage of the item.
     *
     * @param discount_per the discount percentage of the item
     */
    public void setDiscount_per ( double discount_per ) {
        this.discount_per = discount_per;
    }

    /**
     * Returns the discount percentage of the item.
     *
     * @return the discount percentage of the item
     */
    public double getDiscount_per () {
        return discount_per;
    }

    /**
     * Returns the price of the item.
     *
     * @return the price of the item
     */
    public double getPrice () {
        return price;
    }

    /**
     * Returns the category of the item.
     *
     * @return the category of the item
     */
    public Order_and_items.category getCategory () {
        return category;
    }

    /**
     * Sets the type of the item.
     *
     * @param type the type of the item
     */
    public void setType ( type type ) {
        this.type = type;
    }

    /**
     * Returns the type of the item.
     *
     * @return the type of the item
     */
    public type getType () {
>>>>>>> Stashed changes
        return type;
    }
    /**
     * Returns the description  of the item.
     *
     * @return the description of the item
     */

<<<<<<< Updated upstream
    public String get_description() {
=======
    public String get_description () {
>>>>>>> Stashed changes
        return description;
    }
}