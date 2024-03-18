import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;

import static java.time.Month.MARCH;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void year() {
        int result = Main.year("2023-03-01T13:00:00Z");
        assertEquals(2023, result);
    }

    @Test
    void month() {
        Month result = Main.month("2023-03-01T13:00:00Z");
        assertEquals(MARCH, result);
    }

    @Test
    void dayOfTheMonth() {
        int result = Main.dayOfTheMonth("2023-03-01T13:00:00Z");
        assertEquals(01, result);
    }

    @Test
    void dayOfTheWeek() {
        DayOfWeek result = Main.dayOfTheWeek("2023-03-01T13:00:00Z");
        assertEquals(DayOfWeek.WEDNESDAY, result);
    }
}