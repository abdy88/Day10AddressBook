package bl.com.addressbook;

import java.util.*;

public class MulAddressBook {

	Scanner sc = new Scanner(System.in);
	HashMap<String, ArrayList<Contacts>> myAddressBookMap = new HashMap<>();

	public static void main(String[] args) {
		
		
		MulAddressBook multiple = new MulAddressBook();
		multiple.addMultipleAddressBook();
	}

	public void addMultipleAddressBook() {
		
		AddressBookService obj3 = new AddressBookServiceImpl();

		int choice = 0;

		while (choice != 2) {

			System.out.println("Enter selection \n1)To Access Address Book\n2)exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name of address book");
				String name = sc.next();
				if (myAddressBookMap.containsKey(name)) {
					System.out.println("Entered Addressbook name present");
					System.out.println(myAddressBookMap);
				} else {
					ArrayList<Contacts> contactList2 = new ArrayList<>();
					System.out.println("Welcome to addressbook" + " "+ name);
					myAddressBookMap.put(name, contactList2);
					
					System.out.println(myAddressBookMap);
					contactList2.add(obj3.createContact());
					System.out.println(myAddressBookMap);
				}
				break;

			case 2:
				System.out.println("exiting");
				break;

			}

		}

	}

}
