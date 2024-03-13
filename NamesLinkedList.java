import java.util.Iterator;
import java.util.LinkedList;

public class NamesLinkedList
{

    public static void main(String[] args)
    {

        LinkedList<String> words = new LinkedList<>();
        words.add("Sara");
        words.add("Farhad");
        words.add("Marya");
        words.add("Sam");
        words.add("Victor");
        words.add("Tom");
        words.add("Suzanne");

        System.out.println("Initial Linked List:");
        displayList(words);

        iterator(words);

        System.out.println();
        System.out.println("Final Linked List:");
        displayList(words);
    }

    private static void iterator(LinkedList<String> linkedList)
    {
        Iterator<String> filter = linkedList.iterator();
        while (filter.hasNext())
        {
            String current = filter.next();
            if (current.length() < 4)
            {
                filter.remove();
            }
        }
    }

    private static void displayList(LinkedList<String> linkedList)
    {
        for (String num : linkedList)
        {
            System.out.print(num + " -> ");
        }
    }
}
