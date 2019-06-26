package JavaTest;

import java.util.function.Function;
import java.util.function.Predicate;

public class InterfaceTest {
    Function<Integer, Long> func = new Function<>() {
        @Override
        public Long apply(Integer o) {
            return o.longValue();
        }
    };

    Function<Integer, Long> func2 = o->o.longValue();

    Function<Integer, Long> func3 = Integer::longValue;

    Predicate<Employee> isHighSalary = e -> e.getSalary() > 10000;
}
