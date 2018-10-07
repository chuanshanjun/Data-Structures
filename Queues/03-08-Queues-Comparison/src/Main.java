import java.util.Random;

public class Main {

	private static double testQueue(int countsNum, Queue<Integer> queue) {
		long startTime = System.nanoTime();
		Random random = new Random();

		// 逻辑过程
		for (int i = 0; i < countsNum; i++) {
			queue.enqueue(random.nextInt(Integer.MAX_VALUE));
		}
		for (int i = 0; i < countsNum; i++) {
			queue.dequeue();
		}

		long endTime = System.nanoTime();

		return (endTime - startTime) / 1000000000.0;
	}

	public static void main(String[] args) {
		int countsNum = 100000;

		System.out.println("ArrayQueue, time: " + testQueue(countsNum, new ArrayQueue<Integer>()) + "s");
		System.out.println("LoopQueue, time: " + testQueue(countsNum, new LoopQueue<Integer>()) + "s");
	}
}