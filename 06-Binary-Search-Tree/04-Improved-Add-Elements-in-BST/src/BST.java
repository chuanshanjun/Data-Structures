/**
 * @author: Young
 * @create: 2018-10-19 10:28
 **/
public class BST<E extends Comparable<E>> {

    private class Node {
        public Node left, right;
        public E e;

        public Node(E e) {
            left = null;
            right = null;
            this.e = e;
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

    // 向二分搜索树中添加节点
    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {

        // 终结条件
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }

//    public void add(E e) {
//        if (root == null) {
//            root = new Node(e);
//            size++;
//        }
//
//        add(root, e);
//    }
//
//    private void add(Node node, E e) {
//
//        // 终止情况
//        if (e.equals(node.e)) {
//          return;
//        } else if (e.compareTo(node.e) < 0 && node.left == null) {
//            node.left = new Node(e);
//            size++;
//            return;
//        } else if (e.compareTo(node.e) > 0 && node.right == null) {
//            node.right = new Node(e);
//            size++;
//            return;
//        }
//
//        if (e.compareTo(node.e) < 0) {
//            add(node.left, e);
//        } else { // e.compareTo(node.e) > 0
//            add(node.right, e);
//        }
//    }
}
