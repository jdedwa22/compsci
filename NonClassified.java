/**
 * Subclass of Earthquake.
 * @author Jacob Edwards
 */
public class NonClassified extends Earthquake
{
    /**
     * Makes it so that the values indicated and initialized in parent class are accessible.
     * @param d dateTimeZ value
     * @param lat Latitude value
     * @param lon Longitude value
     * @param m Magnitude value
     * @param i ID value
     * @param p Place value
     */
    public NonClassified(String d, double lat, double lon, double m, String i, String p)
    {
        super(d, lat, lon, m, i, p);
    }

    /**
     * Overrides the parent class's toString method in order to display new prefix of 'Non-Classified'.
     * @return Prints a custom format for Non-Classified Earthquakes
     */
    public String toString()
    {
        return "Non-Classified {" + "dateTimeZ= '" + getDateTimeZ() +
                '\'' + ", latitude= " + getLatitude() + ", longitude= " + getLongitude() + ", magnitude= " + getMagnitude() + ", id= '" + getId() +
                '\'' + ", place= '" + getPlace() +
                '\'' + '}';
    }
}
