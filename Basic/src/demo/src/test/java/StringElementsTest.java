

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringElementsTest {
    @Test
    public void singleString() {
        List<String> input = List.of("abc123","123","abc");
        String longest = com.example.Technical.StringElements.findLargestString(input);
        assertEquals("abc123", longest);
    }
}