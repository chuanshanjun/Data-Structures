/**
 * @author: Young
 * @create: 2018-09-30 15:41
 **/
public class ArrayTest {

    public static void main(String[] args) {
//        // 1. 数组的定义第一种
//        int[] scores = new int[10];
//
//        // i < scores.length; 推荐这种写法 不推荐 i < 10; 这种硬编码写法
//        for (int i = 0; i < scores.length; i++) {
//            scores[i] = i;
//        }
//        for (int score : scores) {
//            System.out.println(score);
//        }
//
//        // 2. 数组的定义第二种
//        int[] arrs = new int[]{10, 11, 12};
//        for (int arr : arrs) {
//            System.out.println(arr);
//        }

        // 测试1 构造一个Array
//        Array<Integer> array1 = new Array();
//        Array<Integer> array2 = new Array(12);
//
//        // 测试 getCapacity
//        System.out.println(array1.getCapacity());
//        System.out.println(array2.getCapacity());
//
//        // 测试add 方法
//        for (int i = 0; i < array1.getCapacity(); i++) {
//            array1.add(i, i);
//        }
//        System.out.println(array1);
//
//        array2.addLast(12);
//        array2.addFirst(-1);
//        System.out.println(array2);
//
//        array2.remove(0);
//        System.out.println(array2);
//
//        array2.removeElement(12);
//        System.out.println(array2);
//
//        Array<Student> studentArray = new Array<>();
//        studentArray.addLast(new Student("young", 100));
//        studentArray.addLast(new Student("amy", 60));
//        studentArray.addLast(new Student("alice", 70));
//        System.out.println(studentArray);

        // 测试2 Array的扩容 与 缩容
        Array<Integer> integerArray = new Array<>();
        for (int i = 0; i < integerArray.getCapacity(); i++) {
            integerArray.add(i, i);
        }

        System.out.println(integerArray);

        integerArray.addLast(10);
        System.out.println(integerArray);

        integerArray.removeLast();
        System.out.println(integerArray);

        for (int i = 0; i < 5; i++) {
            integerArray.removeLast();
        }

        System.out.println(integerArray);
    }
}
