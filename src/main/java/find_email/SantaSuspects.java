package find_email;

public class SantaSuspects {
	String[] suspects;
	
	int nextIndex = 0;
	int arraySize = 0;
	
	public SantaSuspects(int size) {
		this.suspects = new String[size];
		this.arraySize = size;
	}
	
	public void addSuspect(String suspect) {
		this.suspects[this.nextIndex] = suspect;
		this.nextIndex++;
		if (this.nextIndex >= this.arraySize) {
			this.nextIndex = 0;
		}
	}
	
	public void printSuspects() {
		for(int i = 0; i < this.suspects.length; i++) {
			if (null == this.suspects[i]) {
				continue;
			}
			System.out.println(this.suspects[i]);
		}
	}
	
	public boolean foundMatch(String input) {
		for(int i=0; i < this.suspects.length; i++) {
			if(null == this.suspects[i]) {
				continue;
			}
			if (this.suspects[i].equals(input)) {
				return true;
			}
		}
		return false;
	}
}







