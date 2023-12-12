import java.util.Scanner;
public class Exercise06_21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String str = in.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(str.charAt(i))));
			else
				System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y' || uppercaseLetter == 'Z')
			return 9;
		else if (uppercaseLetter >= 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V')
			return 8;
		else if (uppercaseLetter >= 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S')
			return 7;
		else if (uppercaseLetter >= 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O')
			return 6;
		else if (uppercaseLetter >= 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L')
			return 5;
		else if (uppercaseLetter >= 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I')
			return 4;
		else if (uppercaseLetter >= 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F')
			return 3;
		else 
			return 2;
	}
}
  