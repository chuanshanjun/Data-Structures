/**
 * @author: Young
 * @create: 2018-10-17 21:39
 **/
public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }

      // 使用arr为参数，创建一个链表，当前的ListNode为链表头结点
      public ListNode(int[] arr) {
          if (arr == null && arr.length == 0) {
              throw new IllegalArgumentException("arr can not be empty");
          }

          this.val = arr[0];
          ListNode cur = this;
          for (int i = 1; i < arr.length; i++) {
              cur.next = new ListNode(arr[i]);
              cur = cur.next;
          }
      }

      @Override
    public String toString() {
          StringBuilder stringBuilder = new StringBuilder();
          ListNode cur = this;
          while (cur != null) {
              stringBuilder.append(cur.val + "->");
              cur = cur.next;
          }

          stringBuilder.append("NULL");
          return stringBuilder.toString();
      }
}
