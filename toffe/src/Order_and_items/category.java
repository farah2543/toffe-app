/**

 The category class represents a category of items in an order.
 It contains a name and a vector of items belonging to the category.
 */
package Order_and_items;
import java.util.Vector;

public class category {
    /**
     * The name of the category.
     */
    private String name;

    /**
     * The vector of items belonging to the category.
     */
    public Vector < Item > C_items = new Vector <>();

    /**
     * Creates a new category with the given name.
     *
     * @param Name the name of the category
     */
    public category ( String Name ) {
        name = Name;
<<<<<<< Updated upstream
=======
    }

    /**
     * Creates a new empty category.
     */
    public category () {
>>>>>>> Stashed changes
    }
    public category ( ) {}

    /**
     * Adds an item to the vector of items belonging to the category.
     *
     * @param element the item to add to the category
     */
    public void addToVector ( Item element ) {
        C_items.add( element );
    }

    /**
     * Returns the vector of items belonging to the category.
     *
     * @return the vector of items belonging to the category
     */
    public Vector < Item > getItems () {
        return C_items;
    }

    /**
     * Returns the name of the category.
     *
     * @return the name of the category
     */
    public String getName () {
        return name;
    }
}
