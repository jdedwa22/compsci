import java.util.Scanner;

public class OneOnlyEven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x and y: ");
        int x = in.nextInt();
        int y = in.nextInt();
        if ((x % 2 == 0 && y % 2 != 0) || (x % 2 != 0 && y % 2 == 0)){
            System.out.println("Exactly one of " + x + " and " + y + " is even.");
        } else {
            System.out.println("Neither or both of " + x + " and " + y + " are even.");
        }

    }

}
