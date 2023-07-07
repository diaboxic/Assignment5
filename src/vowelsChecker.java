import java.util.Scanner;

public class vowelsChecker {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner (System.in);
	
		
		System.out.println("Input your String: ");
		
		String word = scn.nextLine();
		boolean vowels = false;
		
		for (int i = 0; i < word.length(); i++ ) {
			
			char c = word.charAt(i);

			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				vowels = true;
				break;			
			}
			
			else {
				vowels = false;
			}
		}
		
		if (vowels) {
			System.out.println("There is vowels in the String");
		}
		
		else {
			System.out.println("There is no vowel in the String");
		}
		
		scn.close();

	}

}
