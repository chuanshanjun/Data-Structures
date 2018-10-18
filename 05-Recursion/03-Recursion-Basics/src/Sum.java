/**
 * @author: Young
 * @create: 2018-10-18 11:26
 **/
public class Sum {

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    public static int sum(int[] arr, int start) {
        if (start == arr.length) {
            return 0;
        }

        return arr[start] + sum(arr, start + 1);
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(test));
    }
}
