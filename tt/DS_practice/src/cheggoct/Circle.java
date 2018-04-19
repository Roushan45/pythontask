package cheggoct;
public class Circle extends GeometricObject {
    
    private double radius;
    
    public Circle()
    {
        radius = 1.0;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getArea()
    {
        return 3.14 * (radius * radius);
    }
    
    public double getPerimeter()
    {
        return 2 * 3.14 * radius;
    }
    
    public double getDiameter()
    {
        return radius * 2;
    }
    
    
    
}