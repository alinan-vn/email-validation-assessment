package find_email;

import java.util.Scanner;

public class EmailFinder {
	public static void main(String[] args) {
				
		EmailOperations companyEmails = new EmailOperations(50);
		
		companyEmails.addEmail("sample@gmail.com");
		companyEmails.addEmail("hello.there@gmail.com");
		companyEmails.addEmail("general.kenobi@gmail.com");
		companyEmails.addEmail("this.is.where@gmail.com");
		companyEmails.addEmail("the.fun@gmail.com");
		companyEmails.addEmail("begins@gmail.com");
		companyEmails.addEmail("star.wars.quotes@gmail.com");
		companyEmails.addEmail("john@gmail.com");
		companyEmails.addEmail("smith@gmail.com");
		companyEmails.addEmail("another.one@gmail.com");
		companyEmails.addEmail("eric@gmail.com");
		companyEmails.addEmail("oscar@gmail.com");
		companyEmails.addEmail("george@gmail.com");
		companyEmails.addEmail("george.michael@gmail.com");
		companyEmails.addEmail("bluth.family@gmail.com");
		companyEmails.addEmail("g.o.b@gmail.com");
		companyEmails.addEmail("tobias@gmail.com");
		companyEmails.addEmail("toby@gmail.com");
		companyEmails.addEmail("sam@gmail.com");
		companyEmails.addEmail("jeffery@gmail.com");
				
		String choice = companyEmails.chooseAction();
				
		System.out.println(choice);
	
	}
}

