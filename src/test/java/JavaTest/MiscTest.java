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
        int skip[][] = new int[10][10];
        for (int[] pair : new int[][] {{1,3}, {1,7}, {3, 9},{7,9}, {1,9}, {2,8}, {3,7}, {4,6}}) {
            skip[pair[0]][pair[1]] = (pair[0] + pair[1]) / 2;
        }
    }

    @Test
    public void testRandom() {
        Random random = new Random();
        int r = random.nextInt(10);
        r = random.nextInt();
        long rLong = random.nextLong();
    }
}
