/**
 * Class to create LinkedList consisting of: (Strings, Integers, Doubles, etc.) in this case; Strings.
 * @param <E> Type of elements that List consists of (Strings, Integers, Doubles, etc.)
 * @author Jacob Edwards
 * @version 1.2
 */
public class SinglyLinkedList<E>
{
    /**
     * Class used to create Nodes (Minions).
     * @param <E> Type of elements being stored by each Node.
     */
    private static class Node<E>
    {
        public E element;
        public Node<E> next;

        /**
         * Method used to create the Nodes.
         * @param e Element to be stored
         * @param n Next node in sequence.
         */
        public Node(E e, Node<E> n)
        {
            element = e;
            next = n;
        }
        /**
         * Simple method to retrieve the Element stored inside requested Node.
         * @return Element stored in called Node.
         */
        public E getElement()
        {
            return element;
        }
        /**
         * Simple method to retrieve the next Node following requested Node.
         * @return Next Node in sequence.
         */
        public Node<E> getNext()
        {
            return next;
        }
        /**
         * Simple method to set the next Node to follow called Node.
         * @param n Node to follow called Node.
         */
        public void setNext(Node<E> n)
        {
            next = n;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;
    /**
     * Method to set defaults of a linked list. Sets head and tail Node of list to null since there is no beginning or end yet.
     * Also sets the 'size' or 'length' of the List to 0 since no elements have been created yet.
     */
    public SinglyLinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }
    /**
     * Simple method to retrieve the 'size' or 'magnitude' of the List.
     * @return Size / Length / Magnitude of List.
     */
    public int length()
    {
        return size;
    }

    /**
     * Simple method to check and see if there are any elements included in the List.
     * @return True / False if the 'size' of List is 0.
     */
    public boolean isEmpty()
    {
        return size == 0;
    }
    /**
     * Simple method to retrieve the first value of the list. Calls 'isEmpty' method to check if there is a first value at all.
     * @return The element stored inside of Node 'head'
     */
    public E getFirst()
    {
        if (isEmpty())
        {
            return null;
        }
        return head.getElement();
    }
    /**
     * Simple method to retrieve the last value of the list. Calls 'isEmpty' method as-well to check if there is a first value at all.
     * @return The element stored inside of Node 'tail', if only 1 element in List then is both 'head' and 'tail'.
     */
    public E getLast()
    {
        if (isEmpty())
        {
            return null;
        }
        return tail.getElement();
    }
    /**
     * Simple method to insert the provided element into the first position of the List, A.K.A. the 'head' of the List.
     * Also checks to see if List is empty cause if it is, the new First element is also the Last element of the List.
     * @param e The element to be stored by new 'head' Node.
     */
    public void addFirst(E e)
    {
        head = new Node<E>(e, head);
        if (isEmpty())
        {
            tail = head;
        }
        size++;
    }
    /**
     * Simple method to insert the provided element into the last position of the List, A.K.A. the 'tail' of the List.
     * Also checks to see if List is empty cause if it is, the new Last element is also the First element of the List.
     * @param e The element to be stored by new 'tail' Node.
     */
    public void addLast(E e)
    {
        Node<E> newest = new Node<E>(e, null);
        if (isEmpty())
        {
            head = newest;
        }
        else
        {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }
    /**
     * Simple method to remove the first element of the List. Checks to see if List is empty and if it is then prints a message stating that the element
     * cannot be removed due to the List being empty. Sets the new 'head' to the next Node in sequence and "Lets garbage collection" get rid of it.
     * @return The element that was removed from the List.
     */
    public E removeFirst()
    {
        if (isEmpty())
        {
            System.out.println("\u001B[41m\u001B[30m List is empty, unable to remove First Element!\u001B[0m");
            return null;
        }

        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty())
        {
            tail = null;
        }
        return answer;
    }
    /**
     * Complex method to remove the Last element of the List. Also checks to see if List is empty and if it is then prints a message stating that the element
     * cannot be removed due to the List being empty. Goes through a loop that goes checks each Node to see if it has a next Node in sequence while also
     * keeping track of the last known Node to be found. Once it finds the 'tail' Node the loop is broken due to the next Node in sequence being null. After loop is finished
     * it sets the previous Node before 'tail' as the new 'tail' and makes Node point to null in order to cut off the old 'tail' Node.
     * @return The element that was removed from the List.
     */
    public E removeLast()
    {
        if (isEmpty())
        {
            System.out.println("\u001B[41m\u001B[30m List is empty, unable to remove Last Element!\u001B[0m");
            return null;
        }

        E answer = tail.getElement();
        Node<E> current = head;
        Node<E> previous = null;

        while (current.getNext() != null)
        {
            previous = current;
            current = current.getNext();
        }
        if (previous != null)
        {
            previous.setNext(null);
            tail = previous;
        }
        size--;
        if (isEmpty())
        {
            System.out.println("\u001B[31m List no longer has a Tail!\u001B[0m");;
        }
        return answer;
    }
    /**
     * Complex method in order to retrieve the element stored of requested Index #. Checks to see if the requested Index # is within range of the List 'size' / 'length'.
     * If the requested Index # is within the List then it starts from the beginning of the sequence at the 'head' and goes 1 by 1 until it reaches the requested Index #.
     * Once it reaches the Node requested it calls for the 'getElement'.
     * @param n The Index # to search for
     * @return The element stored within requested Index #
     */
    public E get(int n)
    {
        if (n < 0 || n >= length())
        {
            return null;
        }
        Node<E> get = head;
        for(int i = 0; i < n; i++)
        {
            get = get.getNext();
        }

        return get.getElement();
    }

    /**
     * Complex method to create a new Node after requested Index #. Just like 'get' method also checks to see if the Index # requested is within range of List.
     * If the requested Index # is within range it goes through the sequence from the start ('head'). Once you have reached the requested Index # it stores the
     * requested Index # as a placeholder called 'current' to where the new Node is put in-between the 'current' Node (Index #) and the Node following 'current'
     * by setting 'current' s next Node to the new Node and the new Node's next in sequence is 'current' s old next Node in sequence.
     * @param n Index # to find
     * @param e element to be stored in new Node
     */
    public void insertAfter(int n, E e)
    {
        if (n < 0 || n >= length())
        {
            System.out.println("\u001B[41m\u001B[30mIndex of " + n + " is out of range!\u001B[0m");
        }
        else
        {
            Node<E> newest = new Node<E>(e, tail);
            Node<E> current = head;

            for(int i = 0; i < n; i++)
            {
                current = current.getNext();
            }

            newest.setNext(current.getNext());
            current.setNext(newest);

            if(current == tail)
            {
                tail = newest;
            }
            size++;
        }
    }

    /**
     * Complex method to delete a specific Node in position of 'n'. Just like 'get' and 'insertAfter' method it checks to see if requested Index # is within range.
     * If Index # n is within range then it goes through the loop in order to get to the 'n' th position in the List. Each iteration also stores a placeholder called 'previous'
     * in order to keep track of the surrounding Nodes. Once the Index # has been reached it sets the Node previous in sequence's next Node to the Node that follows the requested Index #
     * Also checks to see if the requested Index # is the tail and if it is then it makes sure to set the previous Node as the tail rather than leaving if null.
     * @param n Index # to find
     */
    public void delete(int n)
    {
        if (n < 0 || n >= length())
        {
            return;
        }

        Node<E> current = head;
        Node<E> previous = null;

        for (int i = 0; i < n; i++)
        {
            previous = current;
            current = current.getNext();
        }

        if (previous != null) {
            previous.setNext(current.getNext());
            if (current == tail)
            {
                tail = previous;
            }
        } else
        {
            head = current.getNext();
            if (head == null)
            {
                tail = null;
            }
        }
        size--;
    }
    /**
     * Simple method to Override the default 'toString' method in Java to create our own console outputs when this Class's data is being forced to print as a String.
     * @return The concatenated data
     */
    public String toString()
    {
        String result = "\u001B[33m" + length() + " element(s) " + "\u001B[32m:[";
        for (Node<E> p = head; p != null; p = p.getNext())
        {
            result += p.getElement();
            if (p.getNext() != null)
            {
                result += "\u001B[32m, ";
            }
        }
        result += "\u001B[32m]";
        return result;
    }
}