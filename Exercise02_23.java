import java.util.Scanner;
public class Exercise02_23{
  public static void main(String[] args){
    Scanner drivingInput = new Scanner(System.in);
    double distance = drivingInput.nextDouble();
    double miles = drivingInput.nextDouble();
    double price = drivingInput.nextDouble();
    double step1 = (distance / miles);
    double step2 = (step1 * price);
    System.out.println("The total for your trip is: " + step2);
  }
}