package cheggsept;
/**
 * Temperature converter class 
 * @author Your name
 *
 */
public class Temperature
{
    private double celciusTemperature;
    private double fahrenheitTemperature;
    
    //the constructor method has the same exact name
    //as the class and there is NO return type
    //The constructor method is used to "construct"
    //an object
    
    public Temperature( )
    {
       celciusTemperature = 0;
       fahrenheitTemperature = 32;
    }
    
    //mthos with the same name but with
    //different formal paramter lists can coexist
    //This is call overloading a method
    public Temperature(double inTemp, char scale )
    { 
      if(scale == 'C' || scale == 'c')
      {
          celciusTemperature = inTemp;
          fahrenheitTemperature = (9.0/5 * celciusTemperature) + 32;
        }
        else
        {
          fahrenheitTemperature = inTemp;
          celciusTemperature = (fahrenheitTemperature - 32) * 5.0/9;
        }
          
    }
    
    
    public void setCelcius(double inTemp)
    {
        celciusTemperature = inTemp;
        fahrenheitTemperature = (9.0/5 * celciusTemperature) + 32;
        
    }
    
    public void setFahrenheit(double inTemp)
    {
        fahrenheitTemperature = inTemp;
        celciusTemperature = (fahrenheitTemperature - 32) * 5.0/9;
        
    }
    
    public double getFahrenheitTemperature( )
    {
        return fahrenheitTemperature;
    }
    
    public double getCelciusTemperature( )
    {
        return celciusTemperature;
    }
    
    public String toString( )
    {
       return "Celcius is " + celciusTemperature + " Fahrenheit is " 
                      + fahrenheitTemperature ;
    }
    
    
    
   
}