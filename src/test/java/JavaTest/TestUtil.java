package JavaTest;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {

    static public List<Employee> getTestEmployes () {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", Size.LARGE, 10000));
        employees.add(new Employee("Kate", Size.MEDIUM, 8000));
        employees.add(new Employee("Tom", Size.MEDIUM, 8000));
        employees.add(new Employee("Emily", Size.SMALL, 12000));
        employees.add(new Employee("Victor", Size.SMALL, 9000));
        return employees;
    }


}
