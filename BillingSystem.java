import java.util.Scanner;
import java.util.ArrayList;
class Bill
{
	String itemname;
	int price,quantity,subtotal;

	Bill(String itemname,int price,int quantity,int subtotal)
	{
		this.itemname=itemname;
		this.price=price;
		this.quantity=quantity;
		this.subtotal=subtotal;
	}
	public String toString()
	{
		return itemname+"              "+price+"              "+quantity+"                 "+subtotal;
	}

}

 public class BillingSystem 
{
	public static void main(String[] args) 
	{
		ArrayList<Bill> newItem = new ArrayList<Bill>();
		char cont='Y';
		String itemname="";
		int price=0,subtotal=0,grandtotal=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our Hotel");
		System.out.println("Enter your Name");
		String name = scan.nextLine();
		System.out.println("_____________________________________________");
		System.out.println("Item ID         Item Name       Item Cost");
		System.out.println("______________________________________________");
		System.out.println("1                Coffee            10      ");
		System.out.println("2                Coke              40      ");
        System.out.println("3                Water             20      ");
        System.out.println("4                Pizza             80      ");
        System.out.println("5                Burger            90      ");
		System.out.println("______________________________________________");

		while(cont=='Y')
		{
		System.out.println("Enter the Item ID which you want to buy");
        int itemid = scan.nextInt();
		System.out.println("Enter the Quantity");
        int quantity = scan.nextInt();

		switch(itemid)
		{
			case 1:
				itemname="Coffee";
			    price=10;
                subtotal=price*quantity;
				break;
           case 2:
				itemname="Coke  ";
			    price=40;
                subtotal=price*quantity;
                break;
		   case 3:
				itemname="Water ";
			    price=20;
                subtotal=price*quantity;
				break;
           case 4:
				itemname="Pizza ";
			    price=80;
                subtotal=price*quantity;
				break;
           case 5:
				itemname="Burger";
			    price=90;
                subtotal=price*quantity;
                break;
            default:
				System.out.println("Invalid input");
            }
			newItem.add(new Bill(itemname,price,quantity,subtotal));
			grandtotal+=subtotal;
			System.out.println("Do you want to continue(Y/N)");
			String c = scan.next();
			c = c.toUpperCase();
            char a[] = c.toCharArray();
			cont=a[0];
		}
        System.out.println("HI " + name + " THIS IS YOUR BILL");
	
		System.out.println("Customer name:"+name);
		System.out.println("___________________________________________________________");
		System.out.println("ItemName          Price          Quantity        Subtotal");
		System.out.println("___________________________________________________________");
        for(Bill x:newItem)
		{
          System.out.println(x);
		}
        System.out.println("___________________________________________________________");
        System.out.println("GrandTotal to be paid                                 "+ grandtotal);
		System.out.println("___________________________________________________________");
		System.out.println("THANKS FOR COMMING");
		}
   }