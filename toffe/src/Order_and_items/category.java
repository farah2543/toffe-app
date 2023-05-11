package Order_and_items;

import java.util.Vector;

public class category {

	private String name;
	private Vector<Item> C_items = new Vector<>();
	public category(String Name)
	{
		name=Name;
	}
	public void addToVector(Item element) {
		C_items.add(element);
	}
	public Vector<Item> getItems()
	{
		return C_items;
	}

}