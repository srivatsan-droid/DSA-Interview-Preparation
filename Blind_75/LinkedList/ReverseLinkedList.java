package Blind_75.LinkedList;
class ListNode{
    int data;
    ListNode next;
    ListNode(int new_data) {
        data = new_data;
        next = null;
    }
}
public class ReverseLinkedList {
    static ListNode reverseList(ListNode head) {
        ListNode curr = head,prev = null,next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static void print(ListNode node) {
        while(node != null) {
            System.out.println(node.data);
            if(node.next != null) {
                System.out.println("-->");
                node = node.next;
            }
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        print(head);
        reverseList(head);
        print(head);
    }
}
