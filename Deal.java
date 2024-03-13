import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("List Price: ");
        double listPrice = in.nextDouble();
        System.out.println("Actual price: ");
        double actualPrice = in.nextDouble();

        if (actualPrice < listPrice / 2) {
            System.out.println("Great deal");
        } else if (actualPrice < listPrice * 0.8) {
            System.out.println("Good deal");
        } else if (actualPrice <= listPrice) {
            System.out.println("Ok deal");
        } else {
            System.out.println("Bad deal");
        }
    }
}
