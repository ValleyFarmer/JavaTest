package JavaTest.collection;

import org.junit.Test;

import java.util.*;

import JavaTest.Employee;
import JavaTest.TestUtil;

public class ArrayTest {

    @Test
    public void testWithList() {
        List<Employee> employeeList = TestUtil.getTestEmployes();

        // list to array
        Object[] objectArray = employeeList.toArray();
        Employee[] employeeArray = employeeList.toArray(Employee[]::new);

        // array to list
        // TODO: fixed size (view)
        List<Employee> employeeList2 = Arrays.asList(employeeArray);
        List<Employee> employeeList3 = Arrays.asList(Employee.MIKE, Employee.JOHN);
        // sort will affect underlining array
        employeeList2.sort(Comparator.comparing(Employee::getName));
        employeeList3.sort(Comparator.comparing(Employee::getName));
        //employeeList3.add(Employee.GEORGE);
        // TODO: non-fixed size
        List<Employee> employeeList4 = new ArrayList<>(Arrays.asList(Employee.MIKE, Employee.JOHN));
        employeeList4.add(Employee.GEORGE);
    }

    @Test
    public void testConstruction() {
        int[] arr = {1,2,3};
        int[] arr2 = new int[]{2, 3, 4, 2, 5, 6, 2, 7, 8, 2, 9, 9, 9};
    }

    @Test
    public void testArrays() {
        Employee[] employeeArray = TestUtil.getTestEmployes().toArray(Employee[]::new);

       // TODO: no Arrays.swap

        {
            int[] arr = {3, 2, 4, 1};
            Arrays.sort(arr, 0, 1);
            Arrays.sort(employeeArray, Comparator.comparing(Employee::getName));
        }

        {
            int[] arr = {1, 2, 3, 4};
            int[] arr1 = Arrays.copyOf(arr, 6);
            int[] arr2 = Arrays.copyOf(arr, 2);
            int[] arr3 = Arrays.copyOfRange(arr, 1, 4);
        }

        int pos1 = Arrays.binarySearch(employeeArray, Employee.JOHN, Comparator.comparing(Employee::getName));
        int pos2 = Arrays.binarySearch(employeeArray, Employee.MIKE, Comparator.comparing(Employee::getName));
        System.out.printf("position %d, %d", pos1, pos2);
    }
}
