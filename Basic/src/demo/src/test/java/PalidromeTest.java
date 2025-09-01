import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

import com.example.Technical.Palidrome;


public class PalidromeTest {
    @Test
    public void isPalidrome() {
        String str = "ese";
        Boolean isReversed = Palidrome.isPalidrome(str);
        assert(true == isReversed);
    }

    @Test
    public void isNotPalidrome() {
        String str = "hello";
        Boolean isReversed = Palidrome.isPalidrome(str);
        assertFalse(true == isReversed);
    }
}
