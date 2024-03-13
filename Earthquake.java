/**
 * Main parent class that implements Comparable interface.
 * @author Jacob Edwards
 */
public abstract class Earthquake implements Comparable<Earthquake>
{
    private String dateTimeZ;
    private double latitude;
    private double longitude;
    private double magnitude;
    private String id;
    private String place;

    /**
     * Gives a value to the initialized variables to represent all the data needed.
     * @param d dateTimeZ value
     * @param lat Latitude value
     * @param lon Longitude value
     * @param m Magnitude value
     * @param i ID value
     * @param p Place value
     */
    public Earthquake(String d, double lat, double lon, double m, String i, String p)
    {
        dateTimeZ = d;
        latitude = lat;
        longitude = lon;
        magnitude = m;
        id = i;
        place = p;
    }

    /**
     * Overrides the toString method in Java.
     * @return  Prints a custom format for basic Earthquakes
     */
    public String toString()
    {
        return "Earthquake {" + "dateTimeZ='" + dateTimeZ +
                '\'' + ", latitude=" + latitude + ", longitude=" + longitude + ", magnitude=" + magnitude + ", id='" + id +
                '\'' + ", place='" + place +
                '\'' + '}';
    }

    /**
     * Simple function to retrieve the current dateTimeZ value
     * @return dateTimeZ String
     */
    public String getDateTimeZ()
    {
        return dateTimeZ;
    }

    /**
     * Simple function to retrieve the current Latitude value
     * @return Latitude double
     */
    public double getLatitude()
    {
      return latitude;
    }

    /**
     * Simple function to retrieve the current Longitude value
     * @return Longitude double
     */
    public double getLongitude()
    {
        return longitude;
    }

    /**
     * Simple function to retrieve the current Magnitude value
     * @return Magnitude double
     */
    public double getMagnitude()
    {
        return magnitude;
    }

    /**
     * Simple function to retrieve the current ID value
     * @return ID String
     */
    public String getId()
    {
        return id;
    }

    /**
     * Simple function to retrieve the current Place value
     * @return Place String
     */
    public String getPlace()
    {
        return place;
    }

    /**
     * Simple function in order to compare Earthquakes' magnitudes for sorting purposes
     * @return Compares the Earthquakes' magnitudes
     */
    public int compareTo(Earthquake o)
    {
        return Double.compare(this.magnitude, o.magnitude);
    }

}