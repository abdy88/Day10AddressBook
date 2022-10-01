package bl.com.addressbook;

import java.util.ArrayList;

public interface AddressBookService {

	public Contacts createContact();

	public void displayContact();
	
	public void editContact(ArrayList<Contacts> contactList);

}
