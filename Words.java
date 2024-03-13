import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int n = word.length();
        word = word.charAt(n - 1) + word.substring(1, n - 1) + word.charAt(0);
        int bottles;
        System.out.println(word);
    }
}
