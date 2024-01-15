
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape
{
    private double side1, side2, side3;
    private double perimeter;

    public Triangle( String c, boolean f, double x, double y, double z){
        super( c, f);
        side1 = x;
        side2 = y;
        side3 = z;
    }
    // accessor methods
    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }
    // mutator methods
    public void setSide1( double a){
        side1 = a;
    }

    public void setSide2( double a){
        side2 = a;
    }

    public void setSide3( double a){
        side3 = a;
    }

    public double calculatePerimeter(){
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public double calculateArea(){
        calculatePerimeter();
        double halfP = perimeter/2;
        double area =0;
        area = Math.sqrt( halfP*(halfP - side1)*(halfP- side2)*(halfP- side3));
        return area;
    }
}
