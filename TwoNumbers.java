import java.util.Scanner;

public class TwoNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Keep prompting the user until the input is correct

        System.out.println("Enter two positive integers, the first smaller than the second.");
        System.out.print("First: ");
        int a = in.nextInt();
        System.out.print("Second: ");
        int b = in.nextInt();

        // Only print this when the input is correct

        System.out.println("You entered " + a + " and " + b);
    }
}