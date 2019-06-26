package JavaTest.concurrency;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
    public static class SafeQueue {
        Lock lock = new ReentrantLock();
        Condition isEmpty = lock.newCondition();
        Condition isFull = lock.newCondition();
        Queue<Integer> queue = new ArrayDeque<>();
        final int MAX_SIZE = 10;

        public synchronized void add(Integer elm) throws InterruptedException {
            while (queue.size() == MAX_SIZE) {
                isFull.await();
            }
            queue.add(elm);
            isEmpty.signalAll();
        }

        public synchronized Integer remove() throws InterruptedException {
            while (queue.isEmpty()) {
                isEmpty.await();
            }
            Integer ret = queue.remove();
            isFull.signalAll();
            return ret;
        }
    }
}
