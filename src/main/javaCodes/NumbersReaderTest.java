import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberProcessorTest {

    @Test
    public void testMinFunction() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 2, 1));
        assertEquals(1, NumberProcessor._min(numbers));
    }

    @Test
    public void testMaxFunction() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 2, 1));
        assertEquals(8, NumberProcessor._max(numbers));
    }

    @Test
    public void testSumFunction() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 2, 1));
        assertEquals(19, NumberProcessor._sum(numbers));
    }

    @Test
    public void testMultFunction() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 2, 1));
        assertEquals(240, NumberProcessor._mult(numbers));
    }
    
}
