package find_email;

import java.util.Scanner;

public class EmailOperations {
	String[] emails;
	
	int index = 0;
	int arraySize = 0;
	
	String choice;
	
	public EmailOperations(int size) {
		this.emails = new String[size];
		this.arraySize = size;
	}
	
	public void addEmail(String email) {
		this.emails[this.index] = email;
		this.index++;
		
		if(this.index >= this.arraySize) {
			this.index = 0;
		}
	}
	
	public void printEmails() {
		for(int i = 0; i < this.emails.length; i++) {
			if(null == this.emails[i]) {
				continue;
			}
			System.out.println(this.emails[i]);
		}
	}
	
	public boolean findEmail(String input) {
		for(int i = 0; i < this.emails.length; i++) {
			if(null == this.emails[i]) {
				continue;
			}
			if(this.emails[i].equals(input)) {
				return true;
			}
		}
		return false;
	}
	
	public String chooseAction() {
				
		System.out.println("Would you like to print the email directory or search for an Email?");
		System.out.println("Input (exactly) 'Print' or 'Search'");
		
		Scanner scanner = new Scanner(System.in);
		String action = scanner.nextLine();
		

		if(action.equals("Print")) {
			this.printEmails();
			return "Print Complete!";
		} else if (action.equals("Search")) {
			
			System.out.println("Please provide an email to search for:");
			Scanner emailScan = new Scanner(System.in);
			String emailInput = emailScan.nextLine();
			
			System.out.println("Searching...");
			
			boolean matchStatus = this.findEmail(emailInput);
			
			if (matchStatus) {
				System.out.println("'" + emailInput + "'" + " is a current company email!");
			} else {
				System.out.println("'" + emailInput + "'" + " is NOT a current company email.");
			}
			
			return "Search Complete!";
		} else {
			return "Wrong Input";
		}
	
	}
	
}
