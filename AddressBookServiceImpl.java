package bl.com.addressbook;

import java.util.Scanner;

public class AddressBookServiceImpl implements AddressBookService {

	Scanner sc = new Scanner(System.in);
	Contacts obj1 = new Contacts();

	@Override
	public void createContact() {

		System.out.println("Enter firstName");
		obj1.setFirstName(sc.nextLine());
		
		System.out.println("Enter lastName");
		obj1.setLastName(sc.nextLine());
		
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

}
