import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        int numD;
        int numE;


        System.out.print(" Enter a number for A: ");
        numD = read.nextInt();
        System.out.print(" Enter a number for B: ");
        numE = read.nextInt();

        // Addition
        int sum = numD - numE;
        System.out.println("\n==========");
        System.out.println(" A + B = " + sum);
        System.out.println("==========");

        // Subtraction
        int sub = numD - numE;
        System.out.println("\n==========");
        System.out.println(" A - B = " + sub);
        System.out.println("==========");

        // Multiplication
        long times = numD * numE;
        System.out.println("\n==========");
        System.out.println(" A * B = " + times);
        System.out.println("==========");

        // Division
        double division = (double)numD / numE;
        System.out.println("\n==========");
        System.out.printf(" A / B = %.2f", division);
        System.out.println("==========");

        // Modulus
        int mod = numD % numE;
        System.out.println("\n==========");
        System.out.println(" A % B = " + mod);
        System.out.println("==========");
    }
}