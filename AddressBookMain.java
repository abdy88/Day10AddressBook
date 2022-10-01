package bl.com.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address book Program");

		
		AddressBookService obj2 = new AddressBookServiceImpl();
		obj2.createContact();
		obj2.displayContact();
		
	}

}
