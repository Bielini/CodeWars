package coding_bat.warmup;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SleepInTest {

    @Test
    public void isWorkday() {
        boolean weekday = true;
        boolean vacation = false;

        boolean result = SleepIn.sleepIn(weekday, vacation);

        assertFalse(result,"There are no weekday");
    }
    @Test
    public void isVacation() {
        boolean weekday = true;
        boolean vacation = true;

        boolean result1 = SleepIn.sleepIn(weekday, vacation);

        weekday=false;
        boolean result2 = SleepIn.sleepIn(weekday, vacation);


        assertTrue(result1,"Wrong result for weekend true vac true");
        assertTrue(result2,"Wrong result for weekend false vac true");

    }

    @Test
    public void isWeekend() {

        boolean weekday = false;
        boolean vacation = true;

        boolean result1 = SleepIn.sleepIn(weekday, vacation);


        assertTrue(result1,"Wrong result for weekend false");

    }
}
