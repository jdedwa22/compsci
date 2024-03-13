import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest
{

    public static void main(String[] args)
    {

        System.out.println("----------------------------------");
        System.out.println("         Type 4 Numbers: ");
        System.out.println("It will output the highest number.");
        System.out.println("----------------------------------");

        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int d = num.nextInt();

        ArrayList<Integer> menu;
        menu = new ArrayList<Integer>();
        menu.add(a);
        menu.add(b);
        menu.add(c);
        menu.add(d);

        int size = menu.size();
        int high = menu.get(size - 1);

        System.out.println();
        System.out.println("The Highest number is: " + high);

    }
}