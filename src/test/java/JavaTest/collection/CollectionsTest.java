package JavaTest.collection;

import JavaTest.Employee;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class CollectionsTest {
    @Test
    public void testCollections() {
        List<String>  names = new ArrayList<>(Arrays.asList("Emily", "Mike", "Tom", "Victor"));
        Collections.sort(names, Comparator.reverseOrder());
        //names.sort(Comparator.reverseOrder());
        //names.sort(Comparator.naturalOrder());
        //names.sort(String::compareTo);
        assertEquals(2, Collections.binarySearch(names, "Tom"));
        assertEquals(-2, Collections.binarySearch(names, "Nancy"));

        Collections.reverse(names);
        Collections.swap(names, 1, 2);

        String firstName = Collections.min(names);
        Collections.addAll(names, "Nancy", "Kate");
    }
}
