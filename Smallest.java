import java.util.Scanner;


public class Smallest
{
    public static void main(String[] args)
    {
        System.out.println("Please enter three integer values:");

        Scanner in = new Scanner(System.in);
        int value1 = in.nextInt();
        int value2 = in.nextInt();
        int value3 = in.nextInt();

        int smallest = Math.min(value1, value2);
        smallest = Math.min(smallest, value3);

        System.out.println(smallest);
    }
}