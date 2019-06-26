package JavaTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimitiveWrapper {
    @Test
    public void test() {
        int i = 50;
        Integer intVal = Integer.valueOf("234");
        long longVal = intVal.longValue();
        Long longVal2 = Long.valueOf(i);
        Integer intVal2 = Integer.valueOf("123");

        String str1 = intVal.toString();
        String str2 = Integer.toString(i);

        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,1));
        // TODO: remove(1) will remove element at index 1
        intList.remove(Integer.valueOf(1));
    }
}
