import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();

        while (n >= 0) {
            System.out.print(n + "...");
            n--;
        }
        System.out.print("Liftoff");
    }
}