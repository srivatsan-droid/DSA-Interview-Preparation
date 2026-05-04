package Blind_75.LinkedList;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        boolean ans = hasCycle(head);
        System.out.println(ans);
    }
}
