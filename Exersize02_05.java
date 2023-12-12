import java.util.Scanner;
public class Exercise02_05{
  public static void main(String[] args){
  Scanner totalAndGratuity = new Scanner(System.in);
  double subTotal = totalAndGratuity.nextDouble();
  double  gratuityRate = totalAndGratuity.nextDouble();
  double amountOfGratuity = subTotal * (gratuityRate / 100);
  double total = subTotal + amountOfGratuity;
  System.out.print("The gratuity rate is " + amountOfGratuity + " and the total is " +total);
}
  }