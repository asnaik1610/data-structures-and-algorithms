package linked_list;

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        if (head.next == null)
            return head;
        Node temp = new Node(0);
        temp.next = head;
        Node prev = temp;
        Node cur = head;
        while (cur != null && cur.next != null) {
            Node nxtpair = cur.next.next;
            Node sec = cur.next;

            sec.next = cur;
            cur.next = nxtpair;
            prev.next = sec;

            prev = cur;
            cur = nxtpair;
        }
        return temp.next;
    }
}

// node class of the linked list
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
