import java.util.LinkedList;
import java.util.Queue;

public class GenTreeTest
{

    public static void main(String[] args)
    {
        ArrayTree<String> gameTree = new ArrayTree<>(9, 500000000);
        gameTree.addRoot("         ");
        Queue<Integer> diffPos = new LinkedList<>();
        diffPos.offer(0);
        genTree(gameTree, 0, true, diffPos);
        for (int i = 0; i < 100; i++)
        {
            String t = gameTree.get(i);
            if (t != null)
                System.out.printf("%2d) %s\n", i, t);
            else
                System.out.printf("%2d) Empty\n", i);
        }
    }

    public static void genTree(ArrayTree<String> gameTree, int n, boolean player, Queue<Integer> diffPos)
    {
        String p = gameTree.get(n);
        String turn = player ? "X" : "O";

        for (int i = 0; i < 9; i++)
        {
            char c = p.charAt(i);

            if (c == ' ')
            {
                String p2 = p.substring(0, i) + turn + p.substring(i + 1);
                int childPos = gameTree.addChild(n, i, p2);
                diffPos.offer(childPos);
                genTree(gameTree, childPos, !player, diffPos);
            }
        }
    }
}