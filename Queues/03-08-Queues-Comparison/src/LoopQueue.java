public class LoopQueue<E> implements Queue<E> {

	private E[] data;

	private int front, tail;

	private int size;

	public LoopQueue(int capacity) {
		data = (E[])new Object[capacity + 1];
		front = 0;
		tail = 0;
		size = 0;
	}

	public LoopQueue() {
		this(10);
	}

	public int getCapacity() {
		return data.length - 1;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return front == tail;
	}

	@Override
	public void enqueue(E e) {
		if ((tail + 1) % data.length == front) {
			resize(getCapacity() << 1);
		}

		data[tail] = e;
		tail = (tail + 1) % data.length;
		size++;
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			throw new IllegalArgumentException("dequeue failed, queue is empty");
		}

		E res = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		size--;

		if (size == getCapacity() >> 2 && getCapacity() >> 1 != 0) {
			resize(getCapacity() >> 1);
		}

		return res;
	}

	@Override
	public E getFront() {
		if (isEmpty()) {
			throw new IllegalArgumentException("dequeue failed, queue is empty");
		}
		return data[front];
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
		res.append("Queue: front [");
		for (int i = front; i != tail; i = (i + 1) % data.length) {
			res.append(data[i]);
			if (i != tail - 1) {
				res.append(',');
			}
		}
		res.append("] tail");
		return res.toString();
	}

	private void resize(int newCapacity) {
		E[] newData = (E[])new Object[newCapacity + 1];

		for (int i = 0; i < size; i++) {
			newData[i] = data[(i + front) % data.length];
		}

		data = newData;
		front = 0;
		tail = size;
	}

	public static void main(String[] args) {
		LoopQueue<Integer> loop = new LoopQueue<>();
		for (int i = 0; i < 10; i++) {
			loop.enqueue(i);
			System.out.println(loop);

			if (i % 3 == 2) {
				loop.dequeue();
				System.out.println(loop);
			}
		}
	}
}