import java.util.Scanner;
public class Exercise11_01{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();
    String color = input.next();
    boolean filledOrNot = input.nextBoolean();
    
    Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
  }
}
