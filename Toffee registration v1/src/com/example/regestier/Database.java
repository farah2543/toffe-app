package com.example.regestier;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Vector;
import java.util.Scanner;



class Database {

    private Vector<users> users;
    private Catalogue catalogue;

    public Vector<users> getUsers() {
        return users;
    }

    public void addToVector(users element) {
       users.add(element);
    }
    public users get_user() {
        users user = new users();
        // TODO - implement Database.get_user

        return user;
    }

    public void store_user() {
        // TODO - implement Database.store_user

    }

    public void store_item(Item item) {
        // TODO - implement Database.store_item

    }
    /* public void read_file() throws IOException
     {
         String filePath = "example.txt";
         BufferedReader br = new BufferedReader(new FileReader(filePath));
         users user=new users();
         //read_file();


     }*/
    /*public Item get_item() {
        Item itm = new Item();
        // TODO - implement Database.get_item

        return itm;
    }*/

}
 class Order {

    private String ID;
    private Vector<Item> item;
    //private Payment_method Pay_method;
    private shopping_cart cart;
    private String shipping_address;
    private Status status;
    private double price;

     public void setStatus(Status Status1) {
         this.status = Status1;
     }

     public Status getStatus() {
         return status;
     }

     public void Create_order(Status status) throws IOException {
         //TODO-need some changes as the buyer could choose more than one item
         //this tests that the function of creation order  in processing status like search for item by name ,brand adding to cart and select Quantity

         Catalogue y = new Catalogue();
         Scanner sc = new Scanner(System.in);
         if (status == Status.processing) {
             shopping_cart cart1 = new shopping_cart();

             System.out.println("select option  to select items");
             System.out.println("1-search by item");
             System.out.println("2-add item to cart");
             System.out.println("3-search item by brand");
             System.out.println("4-Exist");


             int choice = sc.nextInt();

             while (choice != 4)
             {
                 Item x = new Item();

                 if (choice == 3) {
                     Vector<Item> itmssearched = new Vector<>();
                     System.out.println("search by branch");
                     String input = sc.nextLine();
                     itmssearched = y.search_itembyBrand(input);

                     System.out.println("those are items searched by this brand");
                     for (int i = 0; i < itmssearched.size(); i++) {
                         System.out.println(itmssearched.get(i).getName());
                     }
                 }
                 if (choice==1) {
                     System.out.println("Please enter name of item to select it");
                     String name = sc.next();
                     x = y.search_itembyName(name);
                 }
                 if (choice == 2) {
                     cart = cart1;
                     cart.add_item(x);
                     cart.select_Quantity();
                     // System.out.println(cart.getCartitems().get(0).getQuantity());
                 }
                 choice = sc.nextInt();
             }

         }
     }
     Order(){};

 }

enum Status {
    shipping,processing, delivered
}
class Item {

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
    Item(){}

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

    public com.example.regestier.category getCategory()
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
enum type {
    loose,Sealed
}

class category {

    private String name;
    private Vector<Item> C_items= new Vector<>();
    category(String Name)
    {
        name=Name;
    }
    public void addToVector(Item element) {
        C_items.add(element);
    }
    Vector<Item> getItems()
    {
        return C_items;
    }

}
class Catalogue {

    private Vector<category> categories= new Vector<>();
    Catalogue()
    {
       //TODO- we will change this (it's crooky) I put some categories to work on it
        category c=new category("chocolate");
        category x=new category("Toffee");

        categories.add(c);
        categories.add(x);

        c.addToVector(new Item("corona",c,"this is a chocolate",30,"galaxy"));
        c.addToVector(new Item("galaxychoco",c,"this is a chocolatechoco",45,"galaxylite"));
        x.addToVector(new Item("toffix",x,"this is a toffee_ships",23,"kadbury"));
        x.addToVector(new Item("machentoch",x,"this is a toffee",29,"kadbury"));
        c.getItems().get(0).setType(type.Sealed);
        x.getItems().get(0).setType(type.loose);
        x.getItems().get(1).setType(type.loose);
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
class shopping_cart {

    private Vector<Item> Cartitems=new Vector<>();
    shopping_cart()
    {}

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
            else if(Cartitems.get(i).getType()==type.loose)
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