/**

 The shopping_cart class represents a shopping cart that contains a collection of items.
 It allows users to add items to the cart and select the quantity for each item.
 */
package Order_and_items;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

<<<<<<< Updated upstream
public class shopping_cart {

    private Vector<Item> Cartitems = new Vector<>();

    public shopping_cart() {
    }

    public void add_item(Item element) {

        Cartitems.add(element);
    }


    public void select_Quantity(Item item) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        if (item.getType() == type.Sealed) {
            System.out.println("Please enter Quantity up to 50 units");

            String input = reader.readLine();
            double sealedquantity = Double.parseDouble(input);
            while (sealedquantity > 50.0) {
                System.out.println(" invalid sealed Quantity Please enter Quantity ");
                String input1 = reader.readLine();
                sealedquantity = Double.parseDouble(input1);

            }

            item.setQuantity(sealedquantity);
            System.out.println(item.getQuantity());

        } else if (item.getType() == type.Loose) {
            System.out.println("Please enter Quantity up to 50 kilo");
            String input = reader.readLine();
            double loosequantity = Double.parseDouble(input);
            while (loosequantity > 50.0) {
                System.out.println(" invalid Quantity Please enter Quantity ");

                String input1 = reader.readLine();
                loosequantity = Double.parseDouble(input1);
                ;
            }
            item.setQuantity(loosequantity);
=======
public class shopping_cart {// The collection of items in the cart
    private Vector < Item > Cartitems = new Vector <>();

    /**
     * Constructs a new shopping cart.
     */
    public shopping_cart () {
    }

    /**
     * Adds an item to the shopping cart.
     *
     * @param element the item to be added to the cart
     */
    public void add_item ( Item element ) {
        Cartitems.add( element );
    }

    /**
     * Prompts the user to select the quantity for the specified item.
     *
     * @param item the item for which the quantity should be selected
     *
     * @throws IOException if there is an error reading user input
     */
    public void select_Quantity ( Item item ) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        if ( item.getType() == type.Sealed ) {
            System.out.println( "Please enter Quantity up to 50 units" );
            String input = reader.readLine();
            double sealedquantity = Double.parseDouble( input );
            while ( sealedquantity > 50.0 ) {
                System.out.println( " invalid sealed Quantity Please enter Quantity " );
                String input1 = reader.readLine();
                sealedquantity = Double.parseDouble( input1 );
            }
            item.setQuantity( sealedquantity );
>>>>>>> Stashed changes

        }
        else if ( item.getType() == type.Loose ) {
            System.out.println( "Please enter Quantity up to 50 kilo" );
            String input = reader.readLine();
            double loosequantity = Double.parseDouble( input );
            while ( loosequantity > 50.0 ) {
                System.out.println( " invalid Quantity Please enter Quantity " );
                String input1 = reader.readLine();
                loosequantity = Double.parseDouble( input1 );
            }
            item.setQuantity( loosequantity );
        }
    }

<<<<<<< Updated upstream
    public Vector<Item> getCartitems() {
=======
    /**
     * prints all the items inside the shopping cart
     *
     */

    public void print_cart(){
        for ( Item i:Cartitems) {
            System.out.println("the item name :" +i.getName());
            System.out.println("the item type :" +i.getType());
            System.out.println("the item name :" +i.getPrice());
            System.out.println("the item Quantity :" +i.getQuantity());


        }
    }

    /**
     * Returns the collection of items in the shopping cart.
     *
     * @return the collection of items in the shopping cart
     */
    public Vector < Item > getCartitems () {
>>>>>>> Stashed changes
        return Cartitems;
    }
}