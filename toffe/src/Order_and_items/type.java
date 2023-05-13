package Order_and_items;

/**

 Enum representing the types of items that can be added to an order.
 The two possible values are:
 Loose: used for items that are measured by weight (in kilos).
 Sealed: used for items that are sold in pre-packaged quantities (up to 50 units).
 */
public enum type
{
    Loose,
    Sealed
}