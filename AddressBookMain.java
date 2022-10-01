package bl.com.addressbook;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Address book Program");

		
		AddressBookService obj2 = new AddressBookServiceImpl();
		
		int choice=0;
		
		System.out.println("1.INSERT");
		System.out.println("2.DISPLAY");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
		  case 1:
			  obj2.createContact();
		    break;
		  case 2:
			  obj2.displayContact();
		    break;
		  default:
			  System.out.println("Please enter a valid option");
	          break;
		    
		}

	
	}

}
