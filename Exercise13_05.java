public class Exercise13_05 {
	public static void main(String[] args) {
		Circle circle1 = new Circle(5, "white", true);
		Circle circle2 = new Circle(4, "green", false);

		System.out.println("\nCircle 1: ");
		print(circle1);
		System.out.println("\nCircle 2: ");
		print(circle2);

		print("\nThe larger of the two circles was ");
		print(Circle.max(circle1, circle2));

		Rectangle rectangle1 = new Rectangle(15, 4, "blue", false);
		Rectangle rectangle2 = new Rectangle(10, 5, "red", true);

		System.out.println("\nRectangle 1: ");
		print(rectangle1);
		System.out.println("\nRectangle 2: ");
		print(rectangle2);
		print("\nThe larger rectangles is ");
		print(Rectangle.max(rectangle1, rectangle2));
	}
}