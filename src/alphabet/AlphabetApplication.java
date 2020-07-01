package alphabet;

public class AlphabetApplication {
	public static void main(String[] args) {
		// Declare Variables
		char letter = 'A';
		String type = "consonant";
		
		// Loop through alphabet, set value of type variable, and print results
		while(letter < 'Z') {
			switch(letter) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'Y':
				type = "vowel";
				break;
			default:
				type = "consonant";
				break;
			}
			
			System.out.println(letter + " is a " + type);
			letter += 1;
		}
	}
}
