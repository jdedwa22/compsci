import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
/**
 * Main class to run and test Earthquake Hierarchy.
 * @author Jacob Edwards
 */
public class EarthquakeTester
{
    private static final String input = "src/earthquakeSampleDataCSV.txt";
    private static final String error = "src/invalidInput.txt";
    private static final String output = "src/sortedEarthquakes.txt";

    /**
     * Method that is called when ran. Indicates the SampleData file that needs to be accessed.
     * Creates list of Earthquakes and Displays the list of Earthquakes in Console.
     * Sorts the list of Earthquakes and Displays the list again.
     * @param args Simple System out console messages
     */
    public static void main(String[] args)
    {
        List<Earthquake> earthquakes = readFile(input);

        System.out.println("Original Earthquake List:");
        for (Earthquake earthquake : earthquakes)
        {
            System.out.println(earthquake.toString());
        }

        earthquakes.sort(null);

        try (FileWriter sorted = new FileWriter(output))
        {
            System.out.println("\nSorted Earthquake List:");
            for (Earthquake earthquake : earthquakes)
            {
                System.out.println(earthquake.toString());
                sorted.write(earthquake + "\n");
            }
        } catch (IOException ignored) {}
    }

    /**
     * Method that is called in Main method in order to read the txt file.
     * Also checks and validates that data sets are correctly formatted before adding to List.
     * Writes to 2 new txt files; 1 for the invalid data sets that don't follow the correct format, and the other for the final sorted List.
     * @param input The file location
     * @return The list of earthquakes
     */
    private static List<Earthquake> readFile(String input)
    {

        System.out.println();

        List<Earthquake> earthquakes = new ArrayList<>();
        try (BufferedReader scan = new BufferedReader(new FileReader(input)))
        {

            FileWriter invalid = new FileWriter(error);
            String line;
            int linenumber = 0;

            while ((line = scan.readLine()) != null)
            {
                linenumber++;
                String[] data = line.split(",");

                if (data.length == 7)
                {
                    try
                    {
                        Double.parseDouble(data[1].trim());
                        Double.parseDouble(data[2].trim());
                        Double.parseDouble(data[3].trim());
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Number Parse Error (lat, lon, m): " + linenumber + "- " + line);
                        invalid.write("Number Parse Error (lat, lon, m): " + linenumber + "- " + line + "\n");
                        continue;
                    }

                    String d = data[0].trim();
                    double lat = Double.parseDouble(data[1].trim());
                    double lon = Double.parseDouble(data[2].trim());
                    double m = Double.parseDouble(data[3].trim());
                    String i = data[4].trim();
                    String p = data[5].trim() + ", " + data[6].trim();

                    try
                    {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                        dateFormat.parse(d);
                    } catch (ParseException e)
                    {
                        System.out.println("Pattern Parse Error (Date-Time): " + linenumber + "- " + line);
                        invalid.write("Pattern Parse Error (Date-Time): " +linenumber + "- " + line + "\n");
                        continue;
                    }

                    Earthquake earthquake;

                    if((lat >= -90 && lat <= 90) && (lon >= -180 && lon <= 180) && (m >= -1 && m <= 10))
                    {
                        if (m < 3)
                        {
                            earthquake = new NonClassified(d, lat, lon, m, i, p);
                        } else
                        {
                            earthquake = new Classified(d, lat, lon, m, i, p);
                        }
                        earthquakes.add(earthquake);
                    } else
                    {
                        System.out.println("Invalid Data Error (Out of proper range): " + linenumber + "- " + line);
                        invalid.write("Invalid Data Error (Out of proper range): " + linenumber + "- " + line + "\n");
                    }
                }
            }
        }
        catch (IOException ignored) {}

        System.out.println();

        return earthquakes;
    }
}