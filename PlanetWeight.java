import java.util.Scanner;

public class PlanetWeight
{


    public static String[] planets =
            {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    public static double[] gravity =
            {0.39, 0.91, 1.00, 0.38, 2.87, 1.32, 0.93, 1.23};

    public static void main(String[] args)
    {
        System.out.printf("%nThis program is for ACO101 Homework-06. ");
        System.out.printf("Developed by: Jacob Edwards%n%n");
        double weight;
        String planet;
        int planetIndex;
        Scanner terminalInput = new Scanner(System.in);

        do
        {
            System.out.print("Enter a weight on earth. Enter 0 to exit: ");
            weight = terminalInput.nextDouble();
            if (weight !=0)
            {
                do
                {
                    System.out.print("Enter a valid planet name: ");
                    planet =  terminalInput.next();
                    planetIndex = findByPlanet (planet);
                    if (planetIndex != -1)
                        System.out.printf("The weight of the object on the planet %s is %4.2f.\n\n",
                                planets[planetIndex],
                                weightOnPlanet(weight, planetIndex));
                }
                while  (planetIndex == -1);
            }
        }
        while (weight != 0);
        System.out.println ("Goodbye!");
    }
    public static int findByPlanet(String planet)
    {
            for (int i = 0; i < planets.length; i++)
            {
                if (planets[i].equalsIgnoreCase(planet))
                {
                    return i;
                }
            }
        return -1;
    }
    public static double weightOnPlanet(double weight, int planetIndex)
    {
        weight = weight * gravity[planetIndex];
        return weight;
    }
}