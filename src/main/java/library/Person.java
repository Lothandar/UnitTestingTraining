package library;

public class Person {
	private static int nextID;
	private Item[] booked = new Item[4];
	private int iD;
	private String name;
	private String address;
	private String phoneNumber;
	private String mailAddress;
	private boolean government = false;
	public Person()
	{
		this.setiD(nextID);
		nextID++;
	}

	public Item[] getBooked() {
		return booked;
	}

	public void setBooked(Item[] booked) {
		this.booked = booked;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}
}
