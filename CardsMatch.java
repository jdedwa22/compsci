import java.util.Scanner;

public class CardsMatch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first card: ");
        String value1 = in.next();
        in.next(); // Skip "of"
        String suit1 = in.next();

        System.out.println("Enter second card: ");
        String value2 = in.next();
        in.next(); // Skip "of"
        String suit2 = in.next();

        if (value1.equals(value2) && suit1.equals(suit2)){
            System.out.println("Same card");
        } else {
            System.out.println("Different cards");
        }

    }

}
