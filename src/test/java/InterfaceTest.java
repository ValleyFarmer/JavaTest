import java.util.function.Function;

public class InterfaceTest {
    Function<Integer, Long> func = new Function<>() {
        @Override
        public Long apply(Integer o) {
            return o.longValue();
        }
    };

    Function<Integer, Long> func2 = o->o.longValue();

    Function<Integer, Long> func3 = Integer::longValue;
}
