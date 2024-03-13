public class BasicListTester
{
    public static void main(String[] args)
    {
        SinglyLinkedList<String> l = new SinglyLinkedList<String>();

        System.out.println("\u001B[37mEnhanced List Tester - Jacob Edwards\n");

        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        l.delete(0);

        l.addFirst("Alpha");
        System.out.println(l);

        l.addLast("Beta");
        System.out.println(l);

        l.addFirst("Gamma");
        System.out.println(l);

        l.addLast("Delta");
        System.out.println(l);

        System.out.println("First is " + l.getFirst());
        System.out.println("Last is " + l.getLast());
        for (int i = 0; i < l.length(); i++)
        {
            System.out.printf("%d) %s\n", i, l.get(i));
        }

        for (int j = 1; j <= 7; j += 2)
        {
            l.insertAfter(j, "X" + j);
            System.out.println(l);
        }

        String last = l.removeLast();
        System.out.println("Removed the last item: " + last);
        System.out.println(l);
        System.out.println("First is " + l.getFirst());
        System.out.println("Last is " + l.getLast());

        while (!l.isEmpty())
        {
            System.out.println("\u001B[32mRemoving " + l.removeLast());
        }

        l.addFirst("3");
        l.addLast("2");
        l.addFirst("1");
        l.addFirst("5");
        l.addFirst("4");
        System.out.println(l);

        l.delete(0);
        System.out.println(l);

        l.delete(3);
        System.out.println(l);

        l.delete(1);
        System.out.println(l);

        l.delete(0);
        System.out.println(l);

        l.delete(0);
        System.out.println(l);
    }
}
