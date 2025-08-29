import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.Technical.Palidrome;

public class ExerciseTest {
    @Test
    public void testReverseString() {
        String str = "Hello";
        Boolean isReversed = Palidrome.isPalidrome(str);
        assertTrue(true == isReversed);
    }

    @Test
    public void testReverseString() {
        String str = "Hello";
        Boolean isReversed = Palidrome.isPalidrome(str);
        assertFalse(false == isReversed);
    }
}
