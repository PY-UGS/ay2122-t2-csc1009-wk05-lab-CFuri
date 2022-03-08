import java.util.*;
public class GeometricObject {
    String colour;
    boolean filled;
    Date dateCreated;
    public GeometricObject()
    {
        dateCreated = new Date();
    }
    public GeometricObject(String ncolour, boolean nfilled)
    {
        colour = ncolour;
        filled = nfilled;
        dateCreated = new Date();

    }
    public void setColour(String newcolour)
    {
        colour = newcolour;
    }
    public String getColour()
    {
        return colour;
    }
    public void setFilled(boolean newfilled)
    {
        filled = newfilled;
    }
    public boolean getFilled()
    {
        return filled;
    }
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }
    public String toString()
    {
        return "created on " + dateCreated;
    }
}   
