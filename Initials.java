import java.util.Scanner;

public class Initials
{
    public static void main (String[] args)
    {
        System.out.println("Please enter first name, middle name, last name: ");

        Scanner in = new Scanner(System.in);
        String fName = in.next();
        String mName = in.next();
        String lName = in.next();

        String initials = fName.substring(0, 1) + mName.substring(0, 1) + lName.substring(0, 1);

        System.out.println(fName.substring(fName.length() / 2, fName.length()));

        System.out.println(initials);

    }
}