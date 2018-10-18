/**
 * @author: Young
 * @create: 2018-10-18 13:23
 **/
public class Solution3 {
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
            head.next = res; // 把值为6的元素移除
            return head;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);

        Solution3 solution3 = new Solution3();
        System.out.println(solution3.removeElements(listNode, 6));
    }
}
