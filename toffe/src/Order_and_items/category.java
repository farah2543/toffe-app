package Order_and_items;

import java.util.Vector;

public class category {
	private String name;

	public  Vector<Item> C_items= new Vector<>();
	//	public void setName(String Name)
//	{
//		name=Name;
//	}

	public category(String Name)
	{
		name=Name;

	}
	public category(){}
	public void addToVector(Item element) {
		C_items.add(element);
	}
	public Vector<Item> getItems()
	{
		return C_items;
	}
	public String getName(){
		return name;
	}
}