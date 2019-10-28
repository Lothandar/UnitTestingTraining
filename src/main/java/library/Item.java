package library;

public abstract class Item {
	private static int nextID;
	private int iD;
	private String title;
	private String author;
	private int price;
	private Boolean isBooked;
	
	public String toString(){
		
		return String.format("%d %s %s %d",iD, title, author, price);
		
	}
	public static int getAmount()
	{
		return nextID;
	}
	
	public Item(String author,String title, int price)
	{
		nextID ++;
		this.iD = nextID;
		
		this.price = price;
		this.title = title;
		this.author = author;
	}
	

	public void CheckIn()
	{
		if(isBooked)
		{
			isBooked = false;
		}
	}
	public void CheckOut()
	{
		if(!isBooked)
		{
			isBooked = true;
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
}
