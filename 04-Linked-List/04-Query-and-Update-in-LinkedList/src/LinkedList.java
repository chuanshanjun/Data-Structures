/**
 * @author: Young
 * @create: 2018-10-16 14:55
 **/
public class LinkedList<E> {

    private class Node {
        public Node next;
        public E e;

        public Node(Node next, E e) {
            this.next = next;
            this.e = e;
        }

        public Node(E e) {
            this(null, e);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node();
        size = 0;
    }

    // 获取链表中的元素个数
    public int getSize() {
        return size;
    }

    // 链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 聊表中增加操作
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, index illegal");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

//        Node node = new Node(e);
//        node.next = prev.next;
//        prev.next = node;

        prev.next = new Node(prev.next, e);
        size++;
    }

    // 在链表头添加新的元素
    public void addFirst(E e) {
        add(0, e);
    }

    // 在链表尾添加新元素
    public void addLast(E e) {
        add(size, e);
    }

    // 获取索引index位置的元素e
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, index illegal");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.e;
    }

    // 获取链表第一个元素
    public E getFirst() {
        return get(0);
    }

    // 获取链表最后一个元素
    public E getLast() {
        return get(size - 1);
    }

    // 链表set操作
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("add failed, index illegal");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    // 查找链表中是否有元素e
    public boolean contains(E e) {
        Node cur = dummyHead.next;

        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

//        Node cur = dummyHead.next;
//        while (cur != null) {
//            res.append(cur + "->");
//            cur = cur.next;
//        }

        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
            res.append(cur + "->");
        }

        res.append("NULL");
        return res.toString();
    }
}
