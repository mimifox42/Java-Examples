import java.util.*;
public class Exercise11_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter numbers to shuffle: ");
		Integer number = in.nextInt();

		while (list.size() < 10) {
			list.add(number);
			number = in.nextInt();
		}
		shuffle(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}
}