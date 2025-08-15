package linked_list;

public class MiddleOfLinkedList {
    int getMiddle(Node head) {
        Node temp = head;
        int N = 0;
        while (temp != null) {
            N++;
            temp = temp.next;
        }

        temp = head;

        N = N / 2;

        for (int i = 0; i < N; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}

// Node of a linked list
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
