package JavaTest.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {
    @Test
    public void test() {
        List<String> names = new ArrayList<>(Arrays.asList("Emily", "Mike", "Tom", "Victor", "Mike", "Emily"));
        List<String> otherNames = Arrays.asList("Kate", "Nancy");
        names.addAll(otherNames);
        names.remove("Emily"); // TODO: remove the first one
        names.removeAll(Arrays.asList("Mike", "Tom"));
        System.out.println("hello world");
    }
;
}
