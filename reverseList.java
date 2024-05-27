class ListNode{
    ListNode curr ;
    ListNode prev = null;
    ListNode next;

}
public class reverseList {
    public static ListNode reverselist(ListNode head){
        ListNode curr = head;
    ListNode prev = null;
    ListNode next;
    while(curr != null){
        next = curr.next;
        curr.next =prev;
        if(next == null)
        break;
        prev=curr;
        curr=next;
    }
    return curr;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
    }
}
