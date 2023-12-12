import java.util.Scanner;
public class Exercise08_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array:");
		int row = in.nextInt();
		int column = in.nextInt();
        double[][] largElement = new double[row][column];
        System.out.println("Enter the array:");
		for (int i = 0; i < largElement.length; i++) {
			for (int j = 0; j < largElement[i].length; j++) {
				largElement[i][j] = in.nextDouble();
			}
		}
        int[] largLocation = locateLargest(largElement);
        System.out.println("The location of the largest element is at " + "(" +
			largLocation[0] + ", " + largLocation[1] + ")");
	}
	public static int[] locateLargest(double[][] a) {
		int[] lowArray = new int[2];
		lowArray[0] = 0;
		lowArray[1] = 0;
		double z = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > z) {
					lowArray[0] = i;
					lowArray[1] = j;
					z = a[i][j];
				}
			}
		}
		return lowArray;
	}
}