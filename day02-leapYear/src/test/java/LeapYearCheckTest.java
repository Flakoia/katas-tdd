import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearCheckTest {

    private final LeapYearCheck leapYearCheck = new LeapYearCheck();

    @ParameterizedTest
    @ValueSource(ints = {1600, 2000, 2400})
    void year_divisible_by_400_is_leap(int year) {
        assertTrue(leapYearCheck.isLeap(year));
    }

}