import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = in.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;
        lastDigit = number % 10;
        System.out.println("Last Digit is: " + lastDigit);
        int totalDigits = (int) Math.log10(number);
        firstDigit = (int) (number / (int) Math.pow(10, totalDigits));
        System.out.println("First Digit: " + firstDigit);
    }
}
