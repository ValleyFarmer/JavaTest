package JavaTest.concurrency;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;


public class IntrinsicLockTest {

    public static class SafeQueue {
        Queue<Integer> queue = new ArrayDeque<>();
        final int MAX_SIZE = 10;

        public synchronized void add(Integer elm) throws InterruptedException {
            while (queue.size() == MAX_SIZE) {
                wait();
            }
            queue.add(elm);
            notifyAll();
        }

        public synchronized Integer remove() throws InterruptedException {
            while (queue.isEmpty()) {
                wait();
            }
            Integer ret = queue.remove();
            notifyAll();
            return ret;
        }
    }

    @Test
    public void test() {
        SafeQueue safeQueue = new SafeQueue();
        Thread t1 = new Thread(
                () -> {
                    try {
                        safeQueue.add(1);
                        safeQueue.add(1);
                        safeQueue.add(1);
                        safeQueue.add(1);
                        safeQueue.add(1);
                        safeQueue.add(1);
                    } catch (Exception e) {

                    }
                });
        t1.start();
    }
}
