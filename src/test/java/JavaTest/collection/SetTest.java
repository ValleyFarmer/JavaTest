package JavaTest.collection;

import JavaTest.Employee;
import JavaTest.TestUtil;
import lombok.Data;
import org.junit.Test;

import java.util.*;

import com.google.common.collect.Sets;

public class SetTest {
    @Test
    public void testSet() {
        Set<Integer> setA = new TreeSet<>(Arrays.asList(2, 3));
        setA.addAll(new TreeSet<>(Arrays.asList(3, 4, 5)));
        boolean changed = setA.add(3);
        changed = setA.add(7);
        setA.retainAll(new TreeSet<>(Arrays.asList(3, 4, 5, 6)));
        setA.removeAll(new TreeSet<>(Arrays.asList(4)));
        changed = setA.remove(4);
        changed = setA.remove(3);
        boolean existed = setA.contains(4);
        existed = setA.containsAll(Arrays.asList(3,5));
        System.out.println("hello world");
    }

    @Test
    public void testTreeSet() {
        TreeSet<Employee> employeeSet = new TreeSet<>(Comparator.comparing(Employee::getName));
        employeeSet.addAll(TestUtil.getTestEmployes());

        Employee employee = employeeSet.first();
        employee = employeeSet.last();
        employee = employeeSet.higher(Employee.JOHN);
        employee = employeeSet.lower(Employee.JOHN);
        employee = employeeSet.ceiling(Employee.JOHN);
        employee = employeeSet.floor(Employee.JOHN);
        employeeSet.descendingSet();
        System.out.println("hello world");
    }

    @Test
    public void testLinkedHashSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        //Iterator<Integer> it = set.spliterator();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    }

    @Test
    public void testSets() {
        Set<Integer> setA = new TreeSet<>(Arrays.asList(2, 3, 4, 5));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(4, 5, 6, 7));
        Set<Integer> ret = Sets.union(setA, setB);
        ret = Sets.difference(setA, setB);
        ret = Sets.intersection(setA, setB);
        System.out.println("hello world");
    }

    @Data
    class TestClass {
        int a;
        int b;
        public int c;
        public TestClass(int d, int e, int f) {
            a=d;
            b=e;
            c=f;
        }
/*
        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (! (o instanceof TestClass)) {
                return false;
            }
            TestClass other = (TestClass)o;
            return a == other.a && b == other.b && c == other.c;
        }*/
    }
    @Test
    public void testArraySet() {
        Set<int[]> s = new HashSet<>();
        s.add(new int[]{2,3,4});
        int[] arr = new int[]{2,3,5};
        arr[2]--;
        s.add(arr);
        System.out.println("hello world");
    }

    @Test
    public void testObjSet() {
        Set<TestClass> s = new HashSet<>();
        s.add(new TestClass(2,3,4));
        TestClass obj = new TestClass(2,3,5);
        obj.c--;
        s.add(obj);
        System.out.println("hello world");
    }

}
