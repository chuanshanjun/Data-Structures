/**
 * @author: Young
 * @create: 2018-10-17 15:18
 **/
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
