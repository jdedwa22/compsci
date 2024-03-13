import java.util.ArrayList;

public class PuzzleSolve {
	public static <E> void solve(int k, ArrayList<E> S, ArrayList<E> U, PuzzleTest<E> t)
	{
		for (int i = 0; i < U.size(); i++)
		{
			E e = U.remove(i);
			S.add(e);
			if (k == 1)
			{
				if (t.test(S))
				{
					t.foundSolution(S);
				}
			} else
			{
				solve(k - 1, S, U, t);
			}
			U.add(i, e);
			S.remove(S.size() - 1);
		}
	}
}