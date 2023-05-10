package Order_and_items;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class shopping_cart {

	private Vector<Item> Cartitems=new Vector<>();
	public shopping_cart() {}

	public void add_item(Item element) {

		Cartitems.add(element);
	}


	public void select_Quantity()throws IOException {
		// I used  BufferedReader ,readline, parsedouble becaues nextDoubel() function that takes input doesnt work on this IDE

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Scanner sc= new Scanner(System.in);
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<Cartitems.size();i++)
		{
			if(Cartitems.get(i).getType()==type.Sealed)
			{
				System.out.println("Please enter Quantity up to 50 units");

				String input = reader.readLine();
				double sealedquantity = Double.parseDouble(input);
				while(sealedquantity>50.0)
				{
					System.out.println(" invalid sealed Quantity Please enter Quantity ");
					String input1 = reader.readLine();
					sealedquantity = Double.parseDouble(input);

				}

				Cartitems.get(i).setQuantity(sealedquantity);
				System.out.println(Cartitems.get(i).getQuantity());

			}
			else if(Cartitems.get(i).getType()== type.Loose)
			{
				System.out.println("Please enter Quantity up to 50 kilo");
				String input = reader.readLine();
				double loosequantity = Double.parseDouble(input);
				while(loosequantity>50.0)
				{
					System.out.println(" invalid Quantity Please enter Quantity ");
					loosequantity=sc.nextDouble();
				}
				Cartitems.get(i).setQuantity(loosequantity);

			}

		}
	}

	public Vector<Item> getCartitems() {
		return Cartitems;
	}
}