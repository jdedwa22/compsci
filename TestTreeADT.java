public class TestTreeADT
{
	public static void main(String[] args)
	{
		ArrayTree<Integer> a1 = new ArrayTree<Integer>(2, 25);
		ArrayTree<Integer> a2 = new ArrayTree<Integer>(5, 55);
		int val = 1;

		System.out.println("*** Test ArrayTree ADT - Jacob Edwards ***\n");
		
		testcase("a1.isEmpty()", a1.isEmpty() ? 1 : 0, 1);

		int pos = a1.addRoot(val++);
		for (int i = 0; i < 10; i++)
		{
			a1.addChild(pos, 0, val++);
			a1.addChild(pos, 1, val++);
			pos++;
		}

		testcase("a1.root()", a1.root(), 0);
		testcase("a1.parent()", a1.parent(7), 3);
		testcase("a1.child()", a1.child(10, 1), 22);
		testcase("a1.size()", a1.size(), 21);
		testcase("a1.isEmpty()", a1.isEmpty() ? 1 : 0, 0);
		testcase("a1.get()", a1.get(3), 4);
		testcase("a1.getChild()", a1.getChild(6, 1), 15);
		System.out.println("Small Tree: " + a1 +"\n");


		testcase("a2.isEmpty()", a2.isEmpty() ? 1 : 0, 1);

		pos = a2.addRoot(val++);
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a2.addChild(pos, j, val++);
			}
			pos++;
		}

		testcase("a2.root()", a2.root(), 0);
		testcase("a2.parent()", a2.parent(27), 5);
		testcase("a2.child()", a2.child(14, 4), 75);
		testcase("a2.size()", a2.size(), 51);
		testcase("a2.isEmpty()", a2.isEmpty() ? 1 : 0, 0);
		testcase("a2.get()", a2.get(18), 40);
		testcase("a2.getChild()", a2.getChild(9, 0), 68);
		System.out.println("Large Tree: " + a2);
	}

	private static void testcase(String description, int actual, int expected)
	{
		if (actual == expected)
		{
			System.out.println("Pass: " + description);
		} else
		{
			System.out.println("Fail: " + description + ", expected " + expected + ", got " + actual);
		}
	}
}
