public class ArrayTree<E> {
    private E[] array;
    private int count;
    private int capacity;
    private int order;

    public ArrayTree(int order, int cap)
    {
        array = (E[]) new Object[cap];
        count = 0;
        capacity = cap;
        this.order = order;
    }

    public ArrayTree()
    {
        // Default order & capacity
        this(2, 1000);
    }

    public int root()
    {
        return 0;
    }

    public int parent(int p)
    {
        return (p - 1) / order;
    }

    public int child(int p, int c)
    {
        int childPos = p * order + c + 1;
        if (childPos < capacity)
        {
            return childPos;
        }
        return -1;
    }

    public int size()
    {
        return count;
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    public int addRoot(E e)
    {
        if (count >= capacity)
        {
            throw new IllegalStateException("Tree is full");
        }
        array[count] = e;
        count++;
        // Root position
        return 0;
    }

    public E get(int pos)
    {
        if (pos < 0 || pos >= capacity)
        {
            throw new IllegalArgumentException("Invalid position");
        }
        return array[pos];
    }

    public int addChild(int parent, int child, E e)
    {
        if (count >= capacity)
        {
            throw new IllegalStateException("Tree is full");
        }
        int childPos = child(parent, child);
        array[childPos] = e;
        count++;
        return childPos;
    }

    public E getChild(int parent, int child)
    {
        int childPos = child(parent, child);
        if (childPos < count)
        {
            return array[childPos];
        }
        return null;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[ArrayTree: order=").append(order);
        sb.append(", count=").append(count);
        sb.append(", size=").append(capacity);
        sb.append(", array={");
        for (int i = 0; i < count; i++)
        {
            sb.append(array[i]).append(" ");
        }
        for (int i = count; i < capacity; i++)
        {
            sb.append("- ");
        }
        sb.append("}]");
        return sb.toString();
    }
}