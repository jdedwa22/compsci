import java.util.Scanner;

public class SecondToLast
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        int secondToLast = (n % 100) / 10;
        System.out.println("Second to last digit: " + secondToLast);
    }
}