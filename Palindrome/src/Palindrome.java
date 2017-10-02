import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
		final boolean palindrome = isPalindrome(input);

		System.out.println("Is palindrome? " + palindrome);
		scanner.close();
	}

	public static boolean isPalindrome(String sentence) {
		return isPalindrome(sentence.toCharArray());
	}

	public static boolean isPalindrome(char[] sentence) {

		int end = sentence.length - 1;

		for (int start = 0; start < end; start++) {//++start b4
			final char s = sentence[start];

			/*only for extra assignment!!!!!!!!!!!!!!!
			 * if (!Character.isLetterOrDigit(s)) {
				++end; // <-- we only want to increment the start, not decrement
						// the end
				continue;
			}*/

			final char e = sentence[end];

			/*only for extra assignment!!!!!!!!!!!!!!!
			 * if (!Character.isLetterOrDigit(e)) {
				--start; // <-- we only want to decrement the end, not increment
							// the start
				continue;
			}
			*/

			if (Character.toLowerCase(s) != Character.toLowerCase(e))
				return false;

			end--;//--end b4
		}

		return true;
	}
}