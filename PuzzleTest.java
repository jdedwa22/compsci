import java.util.ArrayList;

public interface PuzzleTest<E> {
	public boolean test(ArrayList<E> candidate);
	public void foundSolution(ArrayList<E> solution);
}