public class ArrayStack<E> implements Stack<E>
{
	private E[] S;
	private int t;

	public ArrayStack(int capacity)
	{
		S = (E[]) new Object[capacity];
		t = -1;
	}

	public int size()
	{
		return t + 1;
	}

	public boolean isEmpty()
	{
		return t == -1;
	}

	public E top()
	{
		if (isEmpty())
			return null;
		return S[t];
	}

	public void push(E element)
	{
		if (t == S.length - 1)
			throw new IllegalStateException();
		else
		{
			t++;
			S[t] = element;
		}
	}

	public E pop()
	{
		if (isEmpty())
			return null;
		E temp = S[t];
		S[t] = null;
		t--;
		return temp;
	}
	
	public String toString()
	{
		String retVal = "(";
		for (int i = 0; i <= t; i++)
		{
			retVal += S[i];
			if (i <= t - 1)
			{
				retVal += ", ";
			}
		}
		retVal += ")";
		
		return retVal;
	}
}
