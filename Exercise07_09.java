import java.util.Scanner;
public class Exercise07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numList = new double[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numList[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(numList));
    }

    public static double min(double[] array) {
       double smallNum = array[0];	
		for (double i: array) {
			  if (i < smallNum)
				smallNum = i;
		}
		return smallNum;
    }
}