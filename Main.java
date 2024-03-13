import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter number of integers to be sorted: ");
        int n = read.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " integers: ");

        for (int i = 0; i < n; i++)
        {
            array[i] = read.nextInt();
        }

        System.out.println("Original Array: ");
        displayArray(array);

        sortDescending(array);

        System.out.println("Array after sorting: ");
        displayArray(array);

        read.close();

    }

    public static void sortDescending(int[] args)
    {
        int n = args.length;

        for (int i = 0; i < (n - 1); i++)
        {
            int max = i;
            for (int j = i + 1; j < n; j++)
            {
                if(args[j] > args[max])
                {
                    max = j;
                }
            }

            int temp = args[max];
            args[max] = args[i];
            args[i] = temp;
        }
    }

    public static void displayArray(int[] args)
    {
        for (int num : args)
        {
            System.out.println(num);
        }
        System.out.println();
    }
}