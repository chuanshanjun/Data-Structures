/**
 * @author: Young
 * @create: 2018-10-18 13:32
 **/
public class Solution6 {
    public ListNode removeElements(ListNode head, int val, int depth) {

        String depthString = generateDepthString(depth);

        System.out.print(depthString);
        System.out.println("Call: remove " + val + " in " + head);

        // 1 解决最细分的情况
        if (head == null) {
            System.out.print(depthString);
            System.out.println("Retuen:" + head);
            return null;
        }

        // 2 构建递归过程：用更小的规模的解去构建原规模的解
        ListNode res = removeElements(head.next, val, depth + 1);
        System.out.print(depthString);
        System.out.println("After remove" + val + ":" + head.next);

        ListNode ret;
        if (head.val == val) {
            ret = res;
        } else {
            head.next = res;
            ret = head;
        }

        System.out.print(depthString);
        System.out.println("Return: " + ret);

        return ret;
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);

        Solution6 solution6 = new Solution6();
        System.out.println(solution6.removeElements(listNode, 6, 0));
    }
}
