package library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	List<Person> users = new ArrayList<>();
	List<Item> items = new ArrayList<>();
	List<Item> bookedItems = new ArrayList<>();
	
	private void showbookedItems()
	{
		for(Item i : bookedItems)
		{
			System.out.println(i.toString());
		}
	}
	private void showItems()
	{
		for(Item i : items)
		{
			System.out.println(i.toString());
		}
	}
	
	private void amountOfItem()
	{
			System.out.println("There is: "+ (items.size()+bookedItems.size()) +" items currently registered within the library.");
	}
	
	private void addItem()
	{
		System.out.println("New Item Wizard");
		System.out.println("First What Item do you want to add?");
		System.out.println("1 - Book");
		System.out.println("2 - Maps");
		System.out.println("3 - Government Documents");
		switch(App.scan.nextLine().toLowerCase())
		{
		case "1":
		case "book":
		case "b":
			//add wizard
			items.add(new Books());
		break;
		case "2":
		case "maps":
		case "map":
		case "m":
			//add wizard get class fields? and loop through them?
			items.add(new Maps());
			break;
		case "3":
		case "government documents":
		case "government document":
		case "government":
		case "gd":
		case "g d":
			items.add(new GovernmentDocuments());
			break;
		}
		System.out.println("Item Added Successfully");
		
	}
	private void addPerson()
	{
		System.out.println("New Person Wizard");
		System.out.println("First What Person do you want to add?");
		System.out.println("1 - Staff");
		System.out.println("2 - Customer");
		switch(App.scan.nextLine().toLowerCase())
		{
		case "1":
		case "staff":
		case "s":
			users.add(new Staff());
			break;
		case "2":
		case "customer":
		case "c":
			users.add(new Customer());
			break;
		}
	}
	private void removeItem()
	{
		if(items.size()==0)
		{
			System.out.println("You can't remove an item as none are currently existing");
		}
		else
		{
			System.out.println("Removal Item Wizard");
			System.out.println("Do you want to see a list of available items?");
			System.out.println("Y / N");
			switch(App.scan.nextLine().toLowerCase())
			{
			case "y":
			case "yes":
				showItems();
				break;
			case "n":
			case "no":
				break;
			}
			System.out.println("now which of them do you want to remove please write their ID");
			int i = Integer.parseInt(App.scan.nextLine());
			 List<Item> temp = items.stream().filter(x -> i == x.getiD()).collect(Collectors.toList());
			 //only one
			 System.out.println(temp.get(0).toString() +" will be removed do you confirm? Y/N");
			
			 
			 if(App.scan.nextLine().toLowerCase().toString().contentEquals("y"))
			 {
				 items = items.stream().filter(x -> x != temp.get(0)).collect(Collectors.toList());
				 System.out.println(temp.get(0) + " has been successfully removed");
			 }
			 else
			 {
				 System.out.println("Removal process canceled");
			 }
			 
		}
	}
	private void removePerson()
	{
		
	}
	private void updateItem()
	{
		System.out.println("update Item Wizard");
		System.out.println("Do you want to see a list of available items?");
		System.out.println("Y / N");
		switch(App.scan.nextLine().toLowerCase())
		{
		case "y":
		case "yes":
			break;
		case "n":
		case "no":
			break;
		}
	}
	private void updatePerson()
	{
		
	}
	
	public void run() {
		amountOfItem();
		System.out.println("What do you want to do?");
		System.out.println("1 - check out");
		System.out.println("2 - check in");
		System.out.println("3 - add item");
		System.out.println("4 - remove item");
		System.out.println("5 - update item");
		System.out.println("6 - add person");
		System.out.println("7 - remove person");
		System.out.println("8 - update person");
		
		switch(App.scan.nextLine().toLowerCase())
		{
		case "1":
		case "check out":
		case "co":
			Person p = findPerson();
			if(p.getBooked().length >= 4)
			{
				System.out.println("This person cannot check out another item as they reached the maximum already");
				break;
			}
			checkOut();
			break;
		case "2":
		case "check in":
		case "ci":
			Person p1 = findPerson();
			
			if(p1.getBooked().length == 0)
			{
				System.out.println("this Person has no booked item to check in");
				break;
			}
			for(Item i : p1.getBooked())
			{
				System.out.println(i.toString());
			}
			break;
		case "3":
		case "add item":
		case "ai":
			addItem();
			break;
		case "4":
		case "remove item":
		case "ri":
			removeItem();
			break;
		case "5":
		case "update item":
		case "ui":
			updateItem();
			break;
		case "6":
		case "add person":
		case "ap":
			addPerson();
			break;
		case "7":
		case "remove person":
		case "rp":
			removePerson();
			break;
		case "8":
		case "update person":
		case "up":
			updatePerson();
			break;
		}
	}
	private void checkOut() {
		// TODO Auto-generated method stub
		
	}
	private Person findPerson() {
		
		return new Person();
	}
}
