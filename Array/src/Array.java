/**
 * @author: Young
 * @create: 2018-10-01 12:10
 **/
public class Array<E> {

    private E[] data;

    private int size;

    // 构造函数 传入数组的容量capacity 构造数组
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
    }

    // 无参构造方法 默认容量capacity 为10
    public Array() {
        data = (E[]) new Object[10];
    }

    // 获取数组中的元素个数
    public int getSize() {
        return size;
    }

    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 往所有元素的最后一位添加元素
    public void addLast(E e) {
        // 原始的addLast方法
//        if (size == data.length) {
//            throw new IllegalArgumentException("addLast failed, Array is full");
//        }
//        data[size] = e;
//        size ++;

        // 写完add 方法后 可以优化addLast
        add(size, e);
    }

    // 往所有元素的最前一位添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    // 在第inde个位置插入元素e
    public void add(int index, E e) {
        if (size == data.length) {
            throw new IllegalArgumentException("addLast failed, Array is full");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, index is Illegal");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    // 获取index 索引位置的元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get failed, Index is Illegal");
        }

        return data[index];
    }

    // 修改index 索引位置的元素
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get failed, Index is Illegal");
        }

        data[index] = e;
    }

    // 查找数组中元素是否有e
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }

        return false;
    }

    // 查找元素中e所在的索引, 如果不存在元素e 则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }

        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal");
        }

        E res = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size --;
        return res;
    }

    // 从第一个删除
    public E removeFirst() {
        return remove(0);
    }

    // 从最后一个删除
    public E removeLast() {
        return remove(size - 1);
    }

    // 从元素中删除元素
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }



    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array size: %d, Array capacity: %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(',');
            }
        }
        res.append(']');
        return res.toString();
    }
}
