package website;

import Order_and_items.Item;
import Order_and_items.category;
import Order_and_items.type;

import java.util.Objects;
import java.util.Vector;

public class Catalogue {

	private Vector<category> categories= new Vector<>();
	 public Catalogue()
	{
		//TODO- we will change this (it's crooky) I put some categories to work on it
		category cat = new category("chocolate");
		category x = new category("Toffee");


		categories.add(cat);
		categories.add(x);

		cat.addToVector(new Item("corona",cat,"this is a chocolate",30,"galaxy"));
		cat.addToVector(new Item("galaxychoco",cat,"this is a chocolatechoco",45,"galaxylite"));
		x.addToVector(new Item("toffix",x,"this is a toffee_ships",23,"kadbury"));
		x.addToVector(new Item("machentoch",x,"this is a toffee",29,"kadbury"));
		cat.getItems().get(0).setType(type.Sealed);
		x.getItems().get(0).setType(type.Loose);
		x.getItems().get(1).setType(type.Loose);
		// System.out.println(categories.get(0).getItems().get(0).name);
		//System.out.println(categories.get(1).getItems().get(0).name);
		// System.out.println(categories.get(1).getItems().get(1).name);

	}

	public Item search_itembyName(String Name)
	{
		//Note:- this for searching item by name first we search on category and each category we search in its items
		Item itm=new Item();
		for(int i=0;i<categories.size();i++)
		{


			for(int j=0;j<categories.get(i).getItems().size();j++)
			{
				String n=categories.get(i).getItems().get(j).name;
				if(Objects.equals(Name, n))
				{

					itm=categories.get(i).getItems().get(j) ;
					break;

				}

			}
		}


		return itm;
	}

	public Vector<Item>search_itembyBrand(String brand)
	{
		//Note:- this for searching item by name first we search on category and then put all the items of same brand together
		//to display it for user later
		Vector<Item>myitms=new Vector<>();
		Vector<Item>temp=new Vector<>();
		for(int i=0;i<categories.size();i++)
		{
			temp=categories.get(i).getItems();
			for (int j = 0; j<temp.size() ; j++)
			{
				String brandtemp =categories.get(i).getItems().get(j).getBrand();
				if (Objects.equals(brand,brandtemp))
				{
					myitms.add(categories.get(i).getItems().get(j));
				}

			}
		}

		return myitms;
	}

	public void view_category(category category) {
		// TODO - implement Catalogue.view_category

	}

}