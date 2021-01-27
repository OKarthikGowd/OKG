package Datastructures;
class Product
{
	private int id;
	private String name;
	private String product;
	private String Expdate;
	private double price;
	public Product(int id, String name, String product, String Expdate, double price) {
	
		this.id = id;
		this.name = name;
		this.product = product;
		this.Expdate = Expdate;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getExpdate() {
		return Expdate;
	}
	public void setExpdate(String Expdate) {
		this.Expdate = Expdate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		String prodcutDetails= id+" "+name+" "+product+" "+Expdate+" "+price;
		return prodcutDetails;
	}
	
}
class Condtion
{
	
	public static void displayAllProducts(Product[] plist)
	{
		for(int i=0;i<plist.length;i++)
		{
			System.out.println(plist[i]);
		}
	
      }
	public static void displaydescprice(Product[] plist)
	{
		Product temp;
		for(int i=0;i<plist.length;i++)
		{
			for(int j=i+1;j<plist.length;j++)
			{
				if(plist[i].getPrice() > plist[j].getPrice())
				{
					temp=plist[i];
					plist[i]=plist[j];
					plist[j]=temp;
				}
			}
		}
		for(int i=plist.length-1;i>=0;i--)
			
		{
			System.out.println(plist[i].toString());
		}
	
      }
	// b) return any product with seller name as "galaxy".
	public static void displayProductbyname(Product[] plist,String name)
	{
		for(int i=0;i<plist.length;i++)
		{
			if(plist[i].getName()==name)
			{
			System.out.println(plist[i]);
			}
		}
	
      }
	// c) return the product with given ID.
	public static void displayProductbyid(Product[] plist,int id)
	{
		for(int i=0;i<plist.length;i++)
		{
			if(plist[i].getId()==id)
			{
			System.out.println(plist[i]);
			}
		}
	
	}
	// f) print details of product with same expiry date.
	public static void SameExpdate(Product[] plist,String Expdate)
	{
		for(int i=0;i<plist.length;i++)
		{
			for(int j=i+1;j<plist.length;j++) 
			{
			if(plist[i].getExpdate().equals(plist[j].getExpdate()))
			 {
			  System.out.println(plist[i].toString());
			  System.out.println(plist[j].toString());
			 }
		    }
		}
	
	}
	// e) return the count of how many are "electronics".
	public static int count(Product[] plist,String product)
	{
		int count=0;
		for(int i=0;i<plist.length;i++)
		{
			if(plist[i].getProduct().equals(product))
			 count++;
		}
		return count;
	}
	//g) display all the Food Products

	public static void foodProducts(Product[] plist,String product)
	{
		int count=0;
		for(int i=0;i<plist.length;i++)
		{
			if(plist[i].getProduct().equals(product))
			{
				System.out.println(plist[i]);
			}
		}
		
	}
	
	
	
}


public class Mainclass3
{
 public static void main(String[] args)
 {
	Product[] plist= new Product[6];
	plist[0]= new Product(1,"galaxy","electronics","oct/20",2000);
	plist[1]= new Product(2,"pizza","Food","oct/20",3000);
	plist[2]= new Product(3,"dumba","dinga","nov/21",1000);
	plist[3]= new Product(4,"cocoala","drink","sep/22",200);
	plist[4]= new Product(5,"poco","electronics","jun/23",4000);
	plist[5]= new Product(6,"burger","Food","may/24",399);
	
	Condtion.displayAllProducts(plist);
	Condtion.displayProductbyname(plist,"galaxy");
	Condtion.displayProductbyid(plist,2);
	Condtion.SameExpdate(plist,"oct/20");
	System.out.println(Condtion.count(plist,"electronics"));
	Condtion.foodProducts(plist,"Food");
	Condtion.displaydescprice(plist);
}
}
