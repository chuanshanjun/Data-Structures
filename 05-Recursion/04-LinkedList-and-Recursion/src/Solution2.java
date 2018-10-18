/**
 * @author: Young
 * @create: 2018-10-17 22:00
 **/
public class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode( -1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode = null;
            } else {
                prev = prev.next;
            }
        }

        return prev.next;
    }
}
