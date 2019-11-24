package JavaTest;

import org.junit.Test;

import java.io.File;

public class IOTest {

    @Test
    public void testOpenFile() {
        File wordlistFile = new File("1.txt");
        System.out.println(wordlistFile.getAbsolutePath());
    }
}
