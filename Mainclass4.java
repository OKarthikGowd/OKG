package Datastructures;

import java.util.Arrays;

class Room
{
	private int roomno;
	private String name;
	private String status;
	private double price;
	public Room(int roomno, String name, String status,double price) {
		
		this.roomno = roomno;
		this.name = name;
		this.status = status;
		this.price= price;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		
		String roomDetails=roomno+" "+name+" "+status+" "+price;
		return roomDetails;
	}
	
	
}
class Condition
{
	public static void displaydesc(Room[] r)
	{		Room temp;
		for(int i=0;i<r.length;i++)
		{
			for(int j=i+1;j<r.length;j++)
			{
				if(r[i].getPrice() > r[j].getPrice())
				{
				    temp =  r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
		}
		for(int i=r.length-1;i>=0;i--)
		{
			System.out.println(r[i].toString());
		}
		
			
		
	}
	public static void displaydeluxe(Room[] r,String name)
	{
		for(int i=0;i<r.length;i++)
		{
			if(r[i].getName().equals(name))
			{
				System.out.println(r[i]);
			}
		}
	}
	public static void displaybyroomno(Room[] r,int roomno)
	{
		for(int i=0;i<r.length;i++)
		{
			if(r[i].getRoomno()== roomno)
			{
				System.out.println(r[i]);
			}
		}
	}
	public static int count(Room[] r,String status)
	{
		int count=0;
		for(int i=0;i<r.length;i++)
		{
			if(r[i].getStatus().equals(status))
			{
			count++;
			}
		}
		return count;
	}
	
	
}

public class Mainclass4 {

	public static void main(String[] args) {
		Room[] r= new Room[4];
		r[0]= new Room(101,"Deluxe","occupied",1000);
		r[1]=new Room(102,"Non-Deluxe","unoccupied",500);
		r[2]=new Room(103,"Deluxe","unoccupied",1500);
		r[3]=new Room(104,"Deluxe","occupied",1200);
		
      Condition.displaydeluxe(r,"Deluxe");
      Condition.displaybyroomno(r, 103);
      System.out.println(Condition.count(r,"occupied"));
      Condition.displaydesc(r);
     
      
	}

}
