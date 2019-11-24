package JavaTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringTest {
    @Test
    public void stringTest() {
        // Test == and equals
        String a = "this is";
        String b = "this " + "is";
        char ch = b.charAt(2);
        System.out.println(a == b);

        assertEquals(4, "good".length());
        assertTrue("Aa".equalsIgnoreCase("aa"));

        String sentence = "We need leave now.";
        assertEquals (2, sentence.indexOf(' '));
        assertEquals(13, sentence.lastIndexOf(' '));
        assertEquals(3, sentence.indexOf("need"));
        assertEquals(7, sentence.indexOf(' ', 3));

        assertFalse(sentence.isBlank());
        assertFalse(sentence.isEmpty());
        assertTrue(sentence.startsWith("We"));

        String stripped = sentence.strip();
        stripped = sentence.stripLeading();
        stripped = sentence.stripTrailing();

        String lowerCase = sentence.toLowerCase();
        String upperCase = sentence.toUpperCase();

        String subStr = sentence.substring(3);
        assertEquals("need", sentence.substring(3, 7));

        String joined = String.join(",", "aa", "b", "c");
        String joined2 = String.join(", ", new String[]{"aa", "b", "c"});
        List<String> stringList = Arrays.asList("ab", "cd");
        String joined3 = String.join(",", stringList);
        System.out.println(String.format("joined: %s, %s",joined, joined2));

        String[] separated = joined.split(","); //TODO: regex
        String[] splited = "this is a   good time".split("\\s+");
        splited = "this is a   good time".split(" +");
        splited = "//a//".split("/");
        System.out.println(String.format("separated: %s", separated.toString()));
    }

    @Test
    public void stringBuilderTest() {
        StringBuilder builder = new StringBuilder();
        builder.append(true);
        builder.append(35);
        builder.append("aa");
        builder.indexOf("aa");
        builder.indexOf("aa", 0);
        builder.lastIndexOf("aa", builder.length() - 1);
        builder.deleteCharAt(builder.length() - 1); //TODO: builder.length()
        builder.delete(3,5);
        builder.charAt(3);
        builder.setCharAt(3, '3');  // TODO: setCharAt
        builder.insert(0, "start");
        builder.substring(3);
        builder.substring(3, 8);
        builder.length();
        System.out.println(builder);
        String.format("%d->%d", 3, 5);
        //TODO: StringBuffer vs StringBuilder, StringBuffer is synchronized
    }
}
