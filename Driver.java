
/**
 * @Alyssa Xu
 */
public class Driver
{
    public static void main(String [] args) {

        Shape [] shapes = new Shape [6];

        shapes[0] = new Circle("red", true, 5);
        shapes[1] = new Rectangle("blue", false, 5, 10);
        shapes[2] = new Triangle("green", false, 5, 5,5);
        shapes[3] = new Pentagon("green", false, 5);
        shapes[4] = new House ("purple", true, 5);
        shapes[5] = new Square("yellow", false, 10);

        System.out.println( "Perimeters:");
        for (int i = 0; i< shapes.length; i++){
            System.out.println(shapes[i].calculatePerimeter());
        }

        System.out.println(" Areas: ");
        for (Shape s : shapes){
            System.out.println(s.calculateArea());
        }
    }
}
