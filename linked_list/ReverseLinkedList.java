package linked_list;

class ReverseLinkedList {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        Node cur = head;
        Node prev = null;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }
}

// Node class of the linked list
class Node {
    int data;
    Node next;

    public Node(int value) {
        data = value;
    }
}
