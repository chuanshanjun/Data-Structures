/**
 * @author: Young
 * @create: 2018-10-15 21:04
 **/
public class LinkedList<E> {

    // 使用私有内部类，这样只有LinkedList才能访问到
    // 属性使用public 也是为了LinkedList类能访问
    private class Node {
        public E e;

        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
