package JavaTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimitiveWrapper {
    @Test
    public void test() {
        Integer i1=null, i2=null;
        if ((i1 == null && i2 == null ) || (i1 != null && i1.equals(i2))) {
            System.out.println("check equal");
        }

        boolean q = Character.isLetter('3');
        q = Character.isLetterOrDigit('3');
        q = Character.isDigit('3');
        q = Character.isLowerCase('5');
        char c = Character.toLowerCase('B');

        int i = 50;
        Integer intVal = Integer.valueOf("234");
        long longVal = intVal.longValue();
        Long longVal2 = Long.valueOf(i);
        Integer intVal2 = Integer.valueOf("123");

        String str1 = intVal.toString();
        String str2 = Integer.toString(i);

        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,1));
        // TODO: remove(1) will remove element at index 1
        int r = -7 % 3;

        intList.remove(Integer.valueOf(1));
    }
}
