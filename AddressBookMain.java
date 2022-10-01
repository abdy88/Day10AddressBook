package bl.com.addressbook;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Address book Program");

		ArrayList<Contacts> contactList = new ArrayList<>();

		AddressBookService obj2 = new AddressBookServiceImpl();

		int choice = 0;

		while (choice != 5) {

			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.EDIT");
			System.out.println("4.DELETE");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Contacts c1 = obj2.createContact();
				contactList.add(c1);
				obj2.displayContact();
				System.out.println('\n');
				break;
			case 2:
				System.out.println(contactList);
//				obj2.displayContact();
				break;
			case 3:

				obj2.editContact(contactList);
				System.out.println('\n');
//			  obj2.displayContact();
//			  System.out.println('\n');
				break;
			case 4:
				obj2.deleteContact(contactList);
				break;
			case 5:
				System.out.println("GoodBye!");
				break;

			default:
				System.out.println("Please enter a valid option");
				break;

			}
		}

	}

}
