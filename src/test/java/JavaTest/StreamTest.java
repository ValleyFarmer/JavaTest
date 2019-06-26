package JavaTest;

import org.junit.Test;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    @Test
    public void testPrimitiveStream() {
        // TODO: constructor to/from Stream
        IntStream intStream = IntStream.of(1,2,3,4);
        intStream = IntStream.of(new int[]{1,2,3,4});
        intStream = Stream.of(1,2,3,4).mapToInt(x->x);
        Stream<Integer> streamOfInt = intStream.boxed();

        int max = intStream.max().getAsInt(); //TODO: OptionalInt
        int min = intStream.min().getAsInt();
        int oddSum = intStream.filter(x->x%2!=0).sum();

        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5));
        int sum = list.stream().mapToInt(x->x).sum();

        Stream<Integer> stream = Stream.of(1,2,3,4);
    }

    @Test
    public void TestStream() {
        List<Integer> intList = Stream.of(1,3,2,3,4,3).distinct().collect(Collectors.toList());
        Integer sum = Stream.of(1,3,2,3,4,3).reduce(0, (x,y)->x+y);
        List<Integer> sorted = Stream.of(1,3,2,3).sorted().collect(Collectors.toList());

        // effective final
        int[] sum2 = new int[1];
        Stream.of(1,3,2,3).forEach(x-> sum2[0] += x);

        List<Character> chars = Stream.of("good", "bad")
                .flatMap(x->{
                    List<Character> charList = new ArrayList<>();
                    for (char c: x.toCharArray()) {
                        charList.add(c);
                    }
                    return charList.stream();
                })
                .collect(Collectors.toList());
        chars = Stream.of("good", "bad")
                .flatMap(x->x.chars().mapToObj(c->((char)c)))
                .collect(Collectors.toList());
        List<String> names = TestUtil.getTestEmployes()
                .stream()
                .collect(Collectors.mapping(Employee::getName, Collectors.toList()));

        //TODO: to array
        String[] nameArray = TestUtil.getTestEmployes()
                .stream()
                .map(Employee::getName)
                .toArray(String[]::new);

        // TODO: to Map
        Map<String, Integer> salaries = TestUtil.getTestEmployes()
                .stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));

        // TODO: groupingBy
        Map<Size, List<String>> groupBySize = TestUtil.getTestEmployes()
                .stream()
                .collect(Collectors.groupingBy(Employee::getShirtSize,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        Map<Size, List<Employee>> groupBySize2 = TestUtil.getTestEmployes()
                .stream()
                .collect(Collectors.groupingBy(Employee::getShirtSize,
                        Collectors.toList()));
        Map<Size, List<Employee>> groupBySize3 = TestUtil.getTestEmployes()
                .stream()
                .collect(Collectors.groupingBy(Employee::getShirtSize));
        System.out.println("hellow world");

        // TODO: max/min
        int max = Stream.of(2,3,6,9,4).max(Comparator.naturalOrder()).get();
        int min = Stream.of(2,3,6,9,4).min(Comparator.naturalOrder()).get();

        // TODO: reduce
        int totalSalary = TestUtil.getTestEmployes()
                .stream()
                .mapToInt(Employee::getSalary)
                .sum();
        totalSalary = TestUtil.getTestEmployes()
                .stream()
                .map(Employee::getSalary)
                .reduce(0, (x,y)->x+y);
        Optional<Integer> totalSalaryOptional = Stream.of(1,3,2,3).reduce((x,y)->x+y);
        // TODO: anyMatch, allMatch
        boolean matched = TestUtil.getTestEmployes()
                .stream()
                .anyMatch(x->x.getName().equals("John"));

        // TODO: findAny, Optional
        Optional<Employee> optionalEmployee = TestUtil.getTestEmployes()
                .stream()
                .filter(x->x.getName().equals("John"))
                .findAny();
        if (optionalEmployee.isEmpty()) {
            System.out.println("no employee found");
        } else {
            System.out.println("found employee " + optionalEmployee.get().getName());
        }
        Employee employee = optionalEmployee.orElse(Employee.JOHN);
    }
}
