package JavaTest.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ConcurrentTest {

    int[] nums = {2,5,6, 7, 8, 10, 12, 13, 15, 18, 19, 20, 22, 23, 25, 26, 27, 28, 30, 35};
    int threadCnt = 5;

    Thread[] threads = new Thread[threadCnt];
    class SquareRunnable implements Runnable {
        int num;
        SquareRunnable(int num) {
            this.num = num;
        }

        @Override
        public void run() {

        }
    }

    int[] computeSquare(int[] nums) {
        int[] states = new int[nums.length];
        ThreadPoolExecutor executorService = (ThreadPoolExecutor)Executors.newFixedThreadPool(threadCnt);
        executorService.getActiveCount();
        return null;
    }

}
