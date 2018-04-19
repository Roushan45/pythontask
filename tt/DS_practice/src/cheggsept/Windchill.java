package cheggsept;
/**
 * Windchill class
 * @author your name
 *
 */
public class Windchill
{
    private double temperatureInFahr;
    private double windspeed;
    private double windChillIndex;
    
    /**
     * default Constructor 
     */
    public Windchill( )
    {
        temperatureInFahr = 32;
        windspeed = 0;
        windChillIndex = 32;
    }
    /**
     * Parameterized constructor
     */
    public Windchill(double inTemperature, double inWindSpeed)
    {
        temperatureInFahr = inTemperature;
        windspeed = inWindSpeed;
        if(temperatureInFahr < 50 && windspeed > 3)
           windChillIndex = 35.74 + (.6215 * temperatureInFahr) - (35.75 * Math.pow(windspeed, 0.16))
                         + (.4275 * temperatureInFahr * Math.pow(windspeed, 0.16));
        else
           windChillIndex = temperatureInFahr;
    
    }
    /**
     * Setting the temperature
     * @param inTemperature
     */
    public void setTemperature(double inTemperature)
    {
     temperatureInFahr = inTemperature;
       
      if(temperatureInFahr < 50 && windspeed > 3)
         windChillIndex = 35.74 + (.6215 * temperatureInFahr) - (35.75 * Math.pow(windspeed, 0.16))
                       + (.4275 * temperatureInFahr * Math.pow(windspeed, 0.16));
      else
       windChillIndex = temperatureInFahr;
    }
    /**
     * setting wild speed
     * @param inWindSpeed
     */
    public void setWindSpeed(double inWindSpeed)
    {
        windspeed = inWindSpeed;
        if(temperatureInFahr < 50 && windspeed > 3)
           windChillIndex = 35.74 + (.6215 * temperatureInFahr) - (35.75 * Math.pow(windspeed, 0.16))
                         + (.4275 * temperatureInFahr * Math.pow(windspeed, 0.16));
        else
           windChillIndex = temperatureInFahr;
    }
    
    public double getTemperatureInFahr(  )
    {
        return temperatureInFahr;
    }
    
    public double getWindspeed( )
    {
        return windspeed;
    }
    
    public double getWindChillIndex( )
    {
        return windChillIndex;
    }
    /**
     * to string method for printing object
     */
    public String toString( )
    {
        return "Fahernheit temperature: " + temperatureInFahr
              + "\nWind speed in mph: " + windspeed
              + "\nWind chill index: " + windChillIndex;
    }
    
} 