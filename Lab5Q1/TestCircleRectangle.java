import org.w3c.dom.css.Rect;

public class TestCircleRectangle {
    public static void main(String[] args){
        Circle circle = new Circle(1.0,"white",false);
        System.out.println("A circle "+ circle.toString());
        System.out.println("color: " + circle.getColour() + " and filled: " + circle.getFilled());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The Area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The color is " + circle.getColour() + " and filled is " + circle.getFilled());
        System.out.println("The Area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        
    }   
}
