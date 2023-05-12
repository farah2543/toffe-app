package Order_and_items;

import java.util.Vector;

public class category {
	private String name;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
	public  Vector<Item> C_items= new Vector<>();
	//	public void setName(String Name)
//	{
//		name=Name;
//	}
	public category(String Name){
		name = Name;
=======
>>>>>>> Stashed changes
	private Vector<Item> C_items = new Vector<>();
	public category(String Name)
	{
		name=Name;
>>>>>>> 933d029f1f908a13c4877144ae5ec8f4506f126d
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