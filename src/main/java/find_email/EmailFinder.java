package find_email;

import java.util.Scanner;

public class EmailFinder {
	public static void main(String[] args) {
		
		EmailOperations companyEmails = new EmailOperations(20);
		
		companyEmails.addEmail("sample@gmail.com");
				
		SantaSuspects santaSuspects = new SantaSuspects(10);
		
		santaSuspects.addSuspect("Bob Bezanga");
		santaSuspects.addSuspect("Sally Zimmer");
		santaSuspects.addSuspect("Peter Pinkel");
		santaSuspects.addSuspect("Bobby Drop Tables");
		santaSuspects.addSuspect("Bob Ross");
		santaSuspects.addSuspect("Ubiga Altman");
		santaSuspects.addSuspect("Tony Ross");
		santaSuspects.addSuspect("Aaron Rogers");
		santaSuspects.addSuspect("Yolo Once");
		santaSuspects.addSuspect("Yaka Yamalla");
		santaSuspects.addSuspect("Big Show");
		santaSuspects.addSuspect("Doug Dimmadome");

		santaSuspects.printSuspects();
	
		System.out.println("Provide a name to search for:");
		Scanner scanner = new Scanner(System.in);
		String searchFor = scanner.nextLine();
		
		boolean foundMatch = santaSuspects.foundMatch(searchFor);
		
		if(foundMatch) {
			System.out.println(searchFor + " is indeed a santa suspect");
		} else {
			System.out.println(searchFor + " is not a santa suspect");
		}
	
	
	}
}






