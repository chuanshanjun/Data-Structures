import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        BST<Integer> bst = new BST<>();

        for (int i = 0; i < 100; i++) {
            bst.add(random.nextInt(1000));
        }

        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMin());
        }

        System.out.println(nums);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                throw new IllegalArgumentException("Error");
            }
        }
        System.out.println("removeMin test complete");

        //test removeMax
        BST<Integer> bst2 = new BST<>();
        for (int i = 0; i < 100; i++) {
            bst2.add(random.nextInt(1000));
        }

        nums = new ArrayList<>();
        while (!bst2.isEmpty()) {
            nums.add(bst2.removeMax());
        }

        System.out.println(nums.size());

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) < nums.get(i)) {
                throw new IllegalArgumentException("Error");
            }
        }

        System.out.println(nums);
    }
}
