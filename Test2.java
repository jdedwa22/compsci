import java.util.LinkedList;
import java.util.Queue;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("Game Tree Development: Jacob Edwards");
        System.out.println();
        ArrayTree<String> gameTree = new ArrayTree<>(9, 500000000);
        gameTree.addRoot("         ");
        Queue<Integer> positionsToVisit = new LinkedList<>();
        int rootPosition = 0;
        positionsToVisit.offer(rootPosition);
        genTree(gameTree, rootPosition, true, positionsToVisit);
        int count = 0;
        while (!positionsToVisit.isEmpty())
        {
            int position = positionsToVisit.poll();
            String t = gameTree.get(position);
            if (t != null)
                System.out.printf("%2d) %s\n", count++, t);
            else
                System.out.printf("%2d) Empty\n", count++);
        }
    }

    public static void genTree(ArrayTree<String> gameTree, int n, boolean player, Queue<Integer> positionsToVisit)
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
                positionsToVisit.offer(childPos); // Add newly created position to the queue
                genTree(gameTree, childPos, !player, positionsToVisit);
            }
        }
    }
}