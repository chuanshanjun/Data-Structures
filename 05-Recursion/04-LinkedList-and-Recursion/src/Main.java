public class Main {

    public ListNode removeElements(ListNode head, int val) {
        // 1 解决最细分的情况
        if (head == null) {
            return null;
        }

        // 2 构建递归过程：用更小的规模的解去构建原规模的解
        ListNode res = removeElements(head.next, val);
        if (head.val == val) {
            return res;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
    }
}
