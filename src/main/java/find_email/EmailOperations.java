package find_email;

public class EmailOperations {
	String[] emails;
	
	int index = 0;
	int arraySize = 0;
	
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
	
	public boolean foundEmail(String input) {
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
	
}
