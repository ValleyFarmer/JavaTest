package JavaTest.collection;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.stream.Collectors;

import JavaTest.Employee;

public class CollectionTest {
    @Test
    public void testStack() {
        Stack<String> st = new Stack<>();
        st.add("aa");
        st.add("bb");
        String str = st.peek();
        str = st.pop();
    }

    @Test
    public void testDeque() {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("xx");
        deque.add("yy");
        deque.add("aa");
        deque.addFirst("bb");
        deque.addLast("cc");
        String t = deque.remove();
        t = deque.removeFirst();
        deque.removeLast();
        deque.push("aa");
        t = deque.pop();
        t = deque.peek();
        t = deque.peekFirst();
        t = deque.peekLast();
    }

    @Test
    public void testPriorityQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("xx");
        queue.add("yy");
        queue.add("cc");
        queue.add("aa");
        String t = queue.remove();
        System.out.println("hello world!");

        PriorityQueue<Employee> employeeQueue = new PriorityQueue<>(Comparator.comparing(Employee::getSalary));
    }

    @Test
    public void testComparator() {
        List<Employee> employees = new ArrayList<>(Arrays.asList(Employee.JOHN, Employee.MIKE, Employee.GEORGE));
        employees.sort(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));
        List<String> namesReverseOrder = employees.stream().map(Employee::getName).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("hello world!");
    }


}
