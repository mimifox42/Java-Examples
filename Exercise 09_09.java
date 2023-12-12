public class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    RegularPolygon(){
    n = 3;
    side = 1;
    x = 0;
    y = 0;
}
RegularPolygon(int n1, double side1){
    n1 = n;
    side1 = side;
    x = 0;
    y = 0;
}
RegularPolygon(int n1, double side1, double x1, double y1){
    n1 = n;
    side1 = side;
    x1 = x;
    y1 = y;
}
public void setN(int n1){
    n1 = n;
}
public void setSide(double side1){
    side1 = side;
}
public void setX(double x1){
    x1 = x;
}
public void setY(double y1){
    y1 = y;
}
public int getN(){
    return n;
}
public double getSide(){
    return side;
}
public double getX(){
    return x;
}
public double getY(){
    return y;
}
public double getPerimeter(){
  return side * n;  
}
public double getArea(){
    return(n * Math.pow(side,2)) / (4 * Math.tan(Math.PI/n));
}
}
public class Exercise09_09{
    public static void main(String[] args){
        RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Polygon 1 perimeter: " + regularPolygon1.getPerimeter()); 
		System.out.println("Polygon 1 area: " + regularPolygon1.getArea());
		System.out.println("Polygon 2 perimeter: " + regularPolygon2.getPerimeter());
		System.out.println("Polygon 2 area: " + regularPolygon2.getArea());
	    System.out.println("Polygon 3 perimeter: " + regularPolygon3.getPerimeter());
	    System.out.println("Polygon 3 area: " + regularPolygon3.getArea());
		
    }
}