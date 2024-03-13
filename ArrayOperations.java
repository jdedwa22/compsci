import java.util.Scanner;


public class ArrayOperations {

    public static void main(String[] args)
    {
        System.out.println("This program is for ACO101 Homework-05 Developed by: Jacob Edwards");

        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);

        final int length = 100;
        int dataSize = 0;
        double[] data = new double[length];

        while (in.hasNextDouble() && dataSize < data.length)
        {
            data[dataSize] = in.nextDouble();
            dataSize++;
        }

        System.out.println();

        System.out.println("Input array with largest and smallest marked: ");

        ArrayOperations.displayArrayMarkLargestAndSmallest(data, dataSize);
        ArrayOperations.arrayAverage(data, dataSize);
        ArrayOperations.displayArrayInReverse(data, dataSize);
        ArrayOperations.rotatedArrayToLeft(data, dataSize);


    }
    public static void displayArrayMarkLargestAndSmallest (double[] data, int dataSize)
    {

        double largest = data[0];
        double smallest = 100;

        for (int i = 1; i < dataSize; i++)
        {
            if (data[i] > largest)
            {
                largest = data[i];
            }
        }

        for (int i = 0; i < dataSize; i++)
        {
            System.out.print(data[i]);
            if (data[i] == largest)
            {
                System.out.print(" <== largest value");
            } else if (data[i] < smallest)
            {
                System.out.print(" <== smallest value");
                smallest = data[i];
            }
            System.out.println();
        }
    }

    public static double arrayAverage(double[] data, int dataSize)
    {

        double total = 0;

        for (int i = 0; i < dataSize; i++)
        {
            total = total + data[i];
        }

        double average = total / dataSize;

        System.out.println();
        System.out.printf("Array average value:  " + String.format("%.2f", average));
        System.out.println();
        System.out.println();

        return total;
    }

    public static void displayArrayInReverse(double[] data, int dataSize)
    {

        System.out.print("Input array in reverse: ");

        for (int i = dataSize - 1; i >= 0; i--)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();

    }

    public static void rotatedArrayToLeft(double[] data, int dataSize)
    {

        double shift = data[0];

        for (int i = 0; i < dataSize; i++)
        {
            data[i] = data[i + 1];
        }

        data[dataSize - 1] = shift;

        System.out.print("Input array rotated one position to the left: ");

        for (int i = 0; i < dataSize; i++)
        {
            System.out.print(data[i] + " ");
        }

    }
}
