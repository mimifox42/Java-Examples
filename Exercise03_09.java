import java.util.Scanner;

public class Exercise03_09 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		int user = userInput.nextInt();

		int d1 = user / 100000000;
		int num = user % 100000000;
		int d2 = num / 10000000;
		num %= 10000000;
		int d3 = num / 1000000;
		num %= 1000000;
		int d4 = num / 100000;
		num %= 100000;
		int d5 = num / 10000;
		num %= 10000;
		int d6 = num / 1000;
		num %= 1000;
		int d7 = num / 100;
		num %= 100;
		int d8 = num / 10;
		num %= 10;
		int d9 = num;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		String end =("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
		if (d10 == 10)
			System.out.println(end + "X");
		else
			System.out.println(end + d10);
	}
}