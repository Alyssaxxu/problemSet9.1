
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House extends Shape
{
    private double side;
    public House( String c, boolean f, double s){
        super(c,f);
        side = s;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double s){
        side = s;
    }

    public double calculatePerimeter(){
        return side*5;
    }

    public double calculateArea(){
        double areaSquare = side * side;
        double roofPerimeter = side *3;
        double halfP = roofPerimeter/2;
        double areaRoof = Math.sqrt( halfP*(halfP - side)*(halfP- side)*(halfP- side));
        return areaSquare + areaRoof;
    }
}
