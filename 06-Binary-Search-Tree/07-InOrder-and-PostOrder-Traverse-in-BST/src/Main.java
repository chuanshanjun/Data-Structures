public class Main {

    public static void main(String[] args) {
	    BST<Integer> bst = new BST<>();
	    int[] nums = {5, 3, 2, 4, 6, 8};

	    for (int num : nums) {
            bst.add(num);
        }

        bst.inOrder();

        System.out.println("========>");

        bst.preOrder();
    }
}
