import java.util.ArrayList;
import java.util.List;

public class GenTree
{
    static List<TicTacToePosition> gameTree = new ArrayList<>(500000000);

    public static void main(String[] args)
    {
        // Generate game tree starting with X's turn
        generateGameTree("", 0, 'X');
        for (int i = 0; i < 100; i++)
        {
            TicTacToePosition t = gameTree.get(i);
            if (t != null)
                System.out.printf("%2d) %s\n", i, gameTree.get(i).board);
            else
                System.out.printf("%2d) Empty\n", i);
        }
    }

    // Generate the game tree recursively
    static void generateGameTree(String board, int position, char player)
    {
        if (position == 9 || gameIsOver(board))
        {
            gameTree.add(new TicTacToePosition(board));
            return;
        }

        for (int i = 0; i < 9; i++)
        {
            if (board.length() <= i || board.charAt(i) == ' ')
            {
                String newBoard = board + (player == 'X' ? 'X' : 'O');
                generateGameTree(newBoard, position + 1, player == 'X' ? 'O' : 'X');
            }
        }
    }

    // Check if the game is over (either someone has won or the board is full)
    static boolean gameIsOver(String board)
    {
        // Check for Horizontal Win (rows)
        // 'i'  is added by 3 instead of 1 in this instance since the row positions are oriented;
        // [0, 1, 2] , [3, 4, 5] , [6, 7, 8]
        // So by adding by 3 you go from 0 -> 3 -> 6 which are the first element in the row.
        for (int i = 0; i < 9; i += 3)
        {
            // Checks sequentially left -> right
            if (board.charAt(i) != ' ' && board.charAt(i) == board.charAt(i + 1) && board.charAt(i) == board.charAt(i + 2))
            {
                return true;
            }
        }

        // Check for Vertical Win (columns)
        // 'i' is only added by 1 since there are 3 columns and instead of being bound under 9 I put 3 in order to maintain the if checks
        // Since 'i' gets added by 1 each loop, It will work over each column by its top row.
        // Starts off at 0 for 1st element of the 1st row, then next look is 1 which is 2nd element of 1st row.
        for (int i = 0; i < 3; i++)
        {
            // Checks sequentially top -> bottom
            if (board.charAt(i) != ' ' && board.charAt(i) == board.charAt(i + 3) && board.charAt(i) == board.charAt(i + 6))
            {
                return true;
            }
        }

        // Checks for Diagonal Win (top left -> bottom right)
        // Checks positions on the grid directly in order to check.
        if (board.charAt(0) != ' ' && board.charAt(0) == board.charAt(4) && board.charAt(0) == board.charAt(8))
        {
            return true;
        }

        // Checks for Diagonal Win (top right -> bottom left)
        // Checks positions on the grid directly in order to check.
        if (board.charAt(2) != ' ' && board.charAt(2) == board.charAt(4) && board.charAt(2) == board.charAt(6))
        {
            return true;
        }

        // Checks for Draw (0 -> 8)
        for (int i = 0; i < 9; i++)
        {
            // Checks for blank positions (available moves).
            if (board.charAt(i) != ' ')
            {
                return true;
            }
        }
        // Else statement for all if checks, which means no one has won nor has drawn.
        return false;
    }
}