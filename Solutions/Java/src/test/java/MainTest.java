import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void mainPositiveTest() {
        assertTrue(Main.isPositive(5));
        assertFalse(Main.isPositive(0));


    @ParameterizedTest
    @DisplayName("Is Divisible")
    @CsvSource({"30, 5, true", "12, 3, true", "11, 5, false", "7, 3, false"})
    public void mainIsDivisibleTest(int num, int div, boolean isDivisible) {
        assertEquals(Main.isDivisible(num, div), isDivisible);
    }

    @ParameterizedTest
    @DisplayName("FizzBuzzWords")
    @CsvSource({"-3, ''", "13, ''", "3, Fizz", "21, Fizz Bazz", "5, Buzz", "40, Buzz Bozz", "15, Fizz Buzz",
            "24, Fizz Bozz", "35, Buzz Bazz", "56, Bazz Bozz", "105, Fizz Buzz Bazz", "120, Fizz Buzz Bozz",
            "168, Fizz Bazz Bozz", "280, Buzz Bazz Bozz", "840, Fizz Buzz Bazz Bozz", "7, Bazz", "16, Bozz"})
    public void mainFizzBuzzWordsTest(int num, String word) {
        assertEquals(word, Main.fizzBuzz(num));
    }
}
