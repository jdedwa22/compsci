import java.util.Scanner;

/**
 A program that prompts for the present value, interest rate,
 and number of years for a certificate of deposit to mature,
 and then prints the present value.
 All variables should be of type double.
 */
public class CDWorth
{
    public static void main (String[] args)
    {
        System.out.print("Please enter the amount to be deposited: ");

        Scanner in = new Scanner(System.in);
        double presentVal = in.nextDouble();

        System.out.print("Please enter the rate of interest: ");

        double intRate = in.nextDouble();

        System.out.print("Please enter the number of years: ");

        int years = in.nextInt();

        double futureVal = presentVal * Math.pow(1 + intRate / 100, years);

        System.out.printf("%.2f\n", futureVal);
    }
}