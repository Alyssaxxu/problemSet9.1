
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    private double width;

    public Square( String c, boolean f, double w){
        super(c,f);
        width =w;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        width = w;
    }
    
    public double calculateArea(){
        return width*width;
    }
    
    public double calculatePerimeter(){
        return width* 4;
    }
}
