
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    private double radius;

    public Circle(String c, boolean f, double r){
        super(c, f);
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double a){
        radius = a;
    }

    public double calculateArea(){
        double area =  Math.PI * radius * radius;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = Math.PI * 2 * radius;
        return perimeter;
    }
}
