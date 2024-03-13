class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node header, trailer;

    public DoublyLinkedList() {
        // Initialize header and trailer sentinels
        header = new Node(-1);  // Assuming -1 is not a valid data value
        trailer = new Node(-1);
        header.next = trailer;
        trailer.prev = header;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        // Update pointers to add the new node at the end of the list
        newNode.prev = trailer.prev;
        newNode.next = trailer;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
    }

    public Node findMiddleNode() {
        Node slow = header.next;
        Node fast = header.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Add nodes to the doubly linked list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        // Example usage to find the middle node
        Node middleNode = list.findMiddleNode();

        if (middleNode != null) {
            System.out.println("Middle Node Data: " + middleNode.data);
        } else {
            System.out.println("List is empty or middle node not found.");
        }
    }
}
