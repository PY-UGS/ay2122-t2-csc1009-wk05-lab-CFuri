import java.util.Date;

public class Rectangle extends GeometricObject {
    double width,height;
    public Rectangle()
    {
        dateCreated = new Date();
    }
    public Rectangle(double wide, double high)
    {
        width = wide;
        height = high;
        dateCreated = new Date();
    }
    public Rectangle(double wide, double high, String ncolour, boolean nfilled)
    {
        width = wide;
        height = high;
        filled = nfilled;
        colour = ncolour;
        dateCreated = new Date();
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWidth(double nwidth)
    {
        width = nwidth;
    }
    public void setHeight(double nheight)
    {
        height = nheight;
    }
    public double getArea()
    {
        return height*width;
    }
    public double getPerimeter()
    {
        return height * 2 + width * 2;
    }
}
