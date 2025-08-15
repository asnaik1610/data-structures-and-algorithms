package linked_list;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // using, two pointer technique
        ListNode fast = head, slow = head;

        // move "fast" till it matches "n"
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // exception case when "n"th element is the last element
        if (fast == null)
            return head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }
}
