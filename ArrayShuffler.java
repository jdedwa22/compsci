import java.util.Random;

public class ArrayShuffler {
    private static Random rand = new Random();

    // Method to shuffle elements of array A
    public static void shuffle(int[] A) {
        int n = A.length;

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randIndex = rand.nextInt(i + 1);

            // Swap elements at randIndex and i
            int temp = A[randIndex];
            A[randIndex] = A[i];
            A[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arrayToShuffle = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + java.util.Arrays.toString(arrayToShuffle));

        // Shuffle the array
        shuffle(arrayToShuffle);

        System.out.println("Shuffled array: " + java.util.Arrays.toString(arrayToShuffle));
    }
}
