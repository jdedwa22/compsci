/**
 * Subclass of Earthquake.
 * @author Jacob Edwards
 */
public class Classified extends Earthquake
{
    private String magnitudeClass;

    /**
     * Makes it so that the values indicated and initialized in parent class are accessible.
     * @param d dateTimeZ value
     * @param lat Latitude value
     * @param lon Longitude value
     * @param m Magnitude value
     * @param i ID value
     * @param p Place value
     */
    public Classified(String d, double lat, double lon, double m, String i, String p)
    {
        super(d, lat, lon, m, i, p);
    }

    /**
     * Overrides the parent class's toString method in order to display new prefix of 'Classified'.
     * @return Prints a custom format for Classified Earthquakes
     */
    public String toString()
    {
        return "Classified {" + "dateTimeZ= '" + getDateTimeZ() +
                '\'' + ", latitude= " + getLatitude() + ", longitude= " + getLongitude() + ", magnitude= " + getMagnitude() + ", id= '" + getId() +
                '\'' + ", place= '" + getPlace() +
                '\'' + ", classification= '" + getMagClass() +
                '\'' + '}';
    }

    /**
     * Method to filter through the magnitude values of Earthquakes to see which Classification they fall under.
     * @return String value of their Earthquake Classification
     */
    public String getMagClass()
    {
        if(3 <= getMagnitude() && getMagnitude() <= 3.9)
        {
            magnitudeClass = "Minor";
        }
        else if(4 <= getMagnitude() && getMagnitude() <= 4.9)
        {
            magnitudeClass = "Light";
        }
        else if(5 <= getMagnitude() && getMagnitude() <= 5.9)
        {
            magnitudeClass = "Moderate";
        }
        else if(6 <= getMagnitude() && getMagnitude() <= 6.9)
        {
            magnitudeClass = "Strong";
        }
        else if(7 <= getMagnitude() && getMagnitude() <= 7.9)
        {
            magnitudeClass = "Major";
        }
        else if(8 <= getMagnitude())
        {
            magnitudeClass = "Great";
        }
        return magnitudeClass;
    }
}
