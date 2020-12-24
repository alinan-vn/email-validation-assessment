package find_email;

import java.util.Scanner;

public class EmailFinder {
	public static void main(String[] args) {
				
		EmailOperations companyEmails = new EmailOperations(50);
		
		companyEmails.addEmail("sample@company.com");
		companyEmails.addEmail("hello.there@company.com");
		companyEmails.addEmail("general.kenobi@company.com");
		companyEmails.addEmail("this.is.where@company.com");
		companyEmails.addEmail("the.fun@company.com");
		companyEmails.addEmail("begins@company.com");
		companyEmails.addEmail("star.wars.quotes@company.com");
		companyEmails.addEmail("john@company.com");
		companyEmails.addEmail("smith@company.com");
		companyEmails.addEmail("another.one@company.com");
		companyEmails.addEmail("eric@company.com");
		companyEmails.addEmail("oscar@company.com");
		companyEmails.addEmail("george@company.com");
		companyEmails.addEmail("george.michael@company.com");
		companyEmails.addEmail("bluth.family@company.com");
		companyEmails.addEmail("g.o.b@company.com");
		companyEmails.addEmail("tobias@company.com");
		companyEmails.addEmail("toby@company.com");
		companyEmails.addEmail("sam@company.com");
		companyEmails.addEmail("jeffery@company.com");
				
		String choice = companyEmails.chooseAction();
				
		System.out.println(choice);
	
	}
}

