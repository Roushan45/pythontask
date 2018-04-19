package cheggoct;
public class Rectangle extends GeometricObject{
    private double width;
    private double height;
    
    public Rectangle()
    {
        width = 1.0;
        height = 1.0;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getPerimeter()
    {
        return 2 * (height * width);
    }
    
    public double getArea()
    {
        return width * height;
    }   
}