package bl.com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookServiceImpl implements AddressBookService {

	Scanner sc = new Scanner(System.in);
	Contacts obj1 = new Contacts();

	@Override
	public  Contacts createContact() {
		sc.nextLine();

		System.out.println("Enter firstName");
		obj1.setFirstName(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter lastName");
		obj1.setLastName(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter address");
		obj1.setAddress(sc.nextLine());
		
		System.out.println("Enter city");
		obj1.setCity(sc.next());
		
		System.out.println("Enter state");
		obj1.setState(sc.next());
		
		System.out.println("Enter zip");
		obj1.setZip(sc.nextLong());
		
		System.out.println("Enter phoneNo");
		obj1.setPhoneNo(sc.nextLong());
		
		
		System.out.println("Enter email");
		obj1.setEmail(sc.next());
		
		return obj1;
	}

	@Override
	public void displayContact() {
		
		
		System.out.println("First Name :"+ obj1.getFirstName());
		System.out.println("Last Name :"+ obj1.getLastName());
		System.out.println("address :"+ obj1.getAddress());
		System.out.println("City :"+ obj1.getCity());
		System.out.println("State :"+ obj1.getState());
		System.out.println("Zip :"+ obj1.getZip());
		System.out.println("Phone No:" +obj1.getPhoneNo());
		System.out.println("Email:" +obj1.getEmail());
		
		
	}

	@Override
	public void editContact(ArrayList<Contacts> contactList) {
		
		if(contactList.size() == 0)
		{
			System.out.println("Contact List empty");
			
		}
		
		System.out.println("Existing contacts are :");
		
		for(Contacts cont: contactList) {
			System.out.print(cont.getFirstName());
		}
		
		sc.nextLine(); 
		System.out.print("Enter name of contact you want to edit : ");
		String firstN = sc.nextLine(); 
		
		int index =checkContact(contactList, firstN);
		if(index == -1)
		{
			System.out.println("name not found");
		}
		else
			{contactList.set(index, createContact());}
		
	}
		
		private int checkContact(ArrayList<Contacts> contactList, String name) {
			for(int i = 0; i < contactList.size(); i++) {
				if(contactList.get(i).getFirstName().equals(name))
				return i;
			}
			return -1;
			
	}

	}
	

