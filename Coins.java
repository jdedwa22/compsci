import java.util.Scanner;

public class Coins
{
    public static void main(String[] args)
    {
        final String P_TYPE = "P";
        final String N_TYPE = "N";
        final String D_TYPE = "D";
        final String Q_TYPE = "Q";

        System.out.println("Enter number and type of coins: ");

        Scanner in = new Scanner(System.in);
        int numCoins = in.nextInt();
        String typCoin = in.next();
        double value = 0;
        if (typCoin.equals(P_TYPE)) {
            value = numCoins * 0.01;
            System.out.print(value);
        } else if (typCoin.equals(N_TYPE)) {
            value = numCoins * 0.05;
            System.out.print(value);
        } else if (typCoin.equals(D_TYPE)) {
            value = numCoins * 0.10;
            System.out.print(value);
        } else if (typCoin.equals(Q_TYPE)) {
            value = numCoins * 0.25;
            System.out.print(value);
        } else {
            System.out.println("Error");
        }
    }
}