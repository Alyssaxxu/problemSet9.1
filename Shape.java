
/**
 * @ Alyssa Xu
 */
public class Shape
{
    private String color;
    private boolean filled;
    // constructors
    public Shape( String c, boolean f){
        color = c;
        filled = f;
    }

    // accessor methods
    public String getColor(){
        return color;
    }
    
    public boolean getFill(){
        return filled;
    }
    
    // mutator methods
    public void setColor( String a ){
        color = a;
    }
    
    public void setFill(boolean b){
        filled = b;
    }
    // methods
    public double calculateArea(){
        return 0;
    }
    
    public double calculatePerimeter(){
        return 0;
    }
    
    public String displayInfo(){
        String temp= "";
        if (filled == true) temp = "filled";
        else if (filled == false) temp = "not filled";
        return "The shape is " + color + " and is " + temp;
    }
}
