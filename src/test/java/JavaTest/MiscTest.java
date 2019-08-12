package JavaTest;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MiscTest {
    @Test
    public void test() {
        boolean q = Character.isLetter('3');
        q = Character.isDigit('3');
        q = Character.isLowerCase('5');
        System.out.println("hello");
    }

    @Test
    public void testRandom() {
        Random random = new Random();
        int r = random.nextInt(10);
        r = random.nextInt();
        long rLong = random.nextLong();
    }
}
