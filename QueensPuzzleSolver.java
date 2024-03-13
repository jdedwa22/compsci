import java.util.ArrayList;

public class QueensPuzzleSolver implements PuzzleTest<Integer> {

    private static final int N = 8;
    private static ArrayList<Integer> solutions = new ArrayList<>();

    public static void main(String[] args)
    {
        ArrayList<Integer> universe = new ArrayList<>();
        System.out.println("Eight-Queens Puzzle – Jacob Edwards");
        for (int i = 0; i < N; i++)
        {
            universe.add(i);
        }

        PuzzleSolve.solve(N, solutions, universe, new QueensPuzzleSolver());
    }

    @Override
    public boolean test(ArrayList<Integer> candidate)
    {
        for (int i = 0; i < candidate.size() - 1; i++)
        {
            for (int j = i + 1; j < candidate.size(); j++)
            {
                if (candidate.get(i).equals(candidate.get(j)) || Math.abs(candidate.get(i) - candidate.get(j)) == Math.abs(i - j))
                {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void foundSolution(ArrayList<Integer> solution)
    {
        System.out.println("Solution:");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                // Ternary Operator, a lot easier than if/else
                System.out.print((solution.get(i) == j) ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}