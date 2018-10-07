/**
 * @author: Young
 * @create: 2018-10-07 13:54
 **/
public interface Stack<E> {

    void push(E e);

    E pop();

    E peek();

    int getSize();

    boolean isEmpty();
}
