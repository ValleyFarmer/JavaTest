package JavaTest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    String name;
    Size shirtSize;
    Integer salary;
    static public Employee JOHN = new Employee("John", Size.LARGE, 10000);
    static public Employee MIKE = new Employee("Mike", Size.LARGE, 6000);
    static public Employee GEORGE = new Employee("George", Size.MEDIUM, 7000);
}
