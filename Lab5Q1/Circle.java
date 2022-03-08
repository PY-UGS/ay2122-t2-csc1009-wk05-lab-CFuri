import java.util.Date;
import java.lang.Math;
public class Circle extends GeometricObject{
    double radius;
    public Circle()
    {
        dateCreated = new Date();
    }
    public Circle(double nradius)
    {
        radius = nradius;
        dateCreated = new Date();
    }
    public Circle(double nradius, String ncolour, Boolean nfilled)
    {
        radius = nradius;
        colour = ncolour;
        filled = nfilled;
        dateCreated = new Date();
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double nradius)
    {
        radius = nradius;
    }
    public double getPerimeter()
    {
        return 2*radius*Math.PI;
    }
    public double getDiameter()
    {
        return 2*radius;
    }
    public double getArea()
    {
        return Math.PI * Math.pow(radius,2);
    }
}
