/**
 * @author: Young
 * @create: 2018-10-17 21:40
 **/
public class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//        while (head != null && head.val == val) {
//            ListNode delNode = head;
//            head = head.next;
//            delNode.next = null; // 将delNode与链表断开
//        }
//
//        if (head == null) {
//            return null;
//        }
//
//        ListNode prev = head;
//        while (prev.next != null) {
//            if (prev.next.val == val) {
//                ListNode delNodel = prev.next;
//                prev = delNodel.next;
//                delNodel.next = null;
//            } else {
//                prev = prev.next;
//            }
//        }
//
//        return head;
//    }

    /**
     * 如果是提交到LeetCode上的话 将delNode置为null 可以省略 只要移动head即可
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }
}
