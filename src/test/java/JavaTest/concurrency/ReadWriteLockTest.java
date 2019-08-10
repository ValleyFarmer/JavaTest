package JavaTest.concurrency;

import org.junit.Test;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
    @Test
    public void testLock() {
        ReadWriteLock rwLock = new ReentrantReadWriteLock();
        rwLock.readLock().lock();
        try {

        } finally {
            rwLock.readLock().unlock();
        }

        rwLock.writeLock().unlock();
    }
}
