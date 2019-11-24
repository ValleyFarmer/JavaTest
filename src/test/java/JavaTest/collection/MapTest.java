package JavaTest.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    @Test
    public void testMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("aa", 1);
        map.put("bb", 2);
        Integer original = map.put("hh", 1);
        map.put("dd", 4);
        map.put("cc", 3);
        original = map.put("hh", 5);
        map.put("h2", 6);

        map.values().removeIf(v->v==2);
        map.entrySet().removeIf(e -> e.getValue()==3);
        map.replaceAll((k,v)->{
            if (k.startsWith("h")) {
                v += 1;
            }
            return v;
        });

        LinkedList<String> keys = new LinkedList<>(map.keySet());
        Iterator<String> it = keys.descendingIterator();

        System.out.print("hello world");
    }

    @Test
    public void testLinkedHashMap() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(){
            @Override
            public boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return this.size() > 3;
            }
        };
        map.put("aa", 1);
        map.put("bb", 2);
        map.put("hh", 3);
        map.put("dd", 4);
        map.put("cc", 5);
        map.put("hh", 6);

        LinkedList<String> keys = new LinkedList<>(map.keySet());
        Iterator<String> it = keys.descendingIterator();

        System.out.print("hello world");
    }

    @Test
    public void testTreeMap() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("b", 3);
        map.put("a", 2);
        map.put("c", 5);
        for (var key: map.descendingKeySet()) {
            System.out.println(key);
        }
        for (var entry: map.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        for (var entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
