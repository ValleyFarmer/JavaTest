package JavaTest;

import org.junit.Test;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MiscTest {
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
