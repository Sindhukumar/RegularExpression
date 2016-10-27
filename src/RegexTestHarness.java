import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {

	private static Scanner keyboard;

	public static void main(String args[]) {
		keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your regex: ");
			Pattern pattern = Pattern.compile(keyboard.nextLine());

			System.out.println("Enter input string to search: ");
			Matcher matcher = pattern.matcher(keyboard.nextLine());

			boolean found = false;
			while (matcher.find()) {
				System.out.printf("I found the text %s starting at " + "index %d and ending at index %d\n",
						matcher.group(), matcher.start(), matcher.end());
				found = true;

			}
			if (!found) {
				System.out.println("No match found.");
			}
		}
	}
}
