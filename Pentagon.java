
/**
 * Write a description of class Pentagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pentagon extends Shape
{
    private double length;
    
    public Pentagon( String c, boolean f, double l){
        super(c,f);
        length = l;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double l){
        length = l;
    }
    
    public double calculatePerimeter(){
        return length*5;
    }
    
    public double calculateArea(){
        double area =0;
        double num = 2* Math.sqrt(5);
        area = 0.25 * Math.sqrt(5*(5+ num))*length*length;
        return area;
    }
}
