package linked_list;

public class KthFromEnd {
    // Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
        int size = 0;
        Node current = head;

        while (current != null) {
            current = current.next;
            size += 1;

        }

        if (size < n)
            return -1;

        current = head;
        for (int i = 1; i < size - n + 1; i++) {
            current = current.next;
        }
        return current.data;

    }
}

// Structure of node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
