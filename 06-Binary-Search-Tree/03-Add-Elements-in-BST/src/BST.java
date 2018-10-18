import java.util.Comparator;

/**
 * @author: Young
 * @create: 2018-10-18 22:29
 **/
public class BST<E extends Comparable<E>> {

    private class Node {
        public Node left, right;
        public E e;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 向二分搜索树中添加新的元素
    public void add(E e) {

        if (root == null) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    // 向以node为根的二分搜索树中插入元素e,递归算法
    private void add(Node node, E e) {
        if (e.equals(node.e)) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        }

        // 此处等于0的情况已经在上面处理了
        if (e.compareTo(node.e) < 0) {
            add(node.left, e);
        } else {
            add(node.right, e);
        }
    }
}
