package Order_and_items;
public class Item {


	public String name;
	private category category;
	private type type;
	private String description;
	public double price;
	private double discount_per;
	private String brand;

	private double quantity;

	public Item(String Name,category category1,String Description,double Price,String Brand) {

		name=Name;
		category=category1;
		description=Description;
		brand=Brand;
		price=Price;

	}
	public Item(){}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getQuantity() {
		return quantity;
	}

	String getName()
	{
		return name;
	}
	String getDescription()
	{
		return description;
	}

	public String getBrand()
	{
		return brand;
	}

	public void setDiscount_per(double discount_per)
	{
		this.discount_per = discount_per;
	}

	public double getDiscount_per()
	{
		return discount_per;
	}


	public double getPrice()
	{
		return price;
	}

	public Order_and_items.category getCategory()
	{
		return category;
	}

	public void setType(type type) {
		this.type = type;
	}

	public type getType() {
		return type;
	}

}