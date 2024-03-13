import java.util.Scanner;


public class LexiOrder
{
    public static void main(String[] args)
    {
        System.out.println("Please enter two words: ");

        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();

        if (word1.compareTo(word2) < 0) {
            System.out.println(word1 + " " + word2);
        } else if (word1.compareTo(word2) > 0){
            System.out.println(word2 + " " + word1);
        } else {
            System.out.println(word1);
        }
    }
}