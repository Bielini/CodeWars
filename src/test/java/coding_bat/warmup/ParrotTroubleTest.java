package coding_bat.warmup;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ParrotTroubleTest {

    @Test
    public void isTalkingAtNight() {
        boolean talking = true;
        int hour = 23;

        assertTrue(ParrotTrouble.parrotTrouble(talking, hour), "talking at night");
    }
    @Test
    public void isTalkingAtDay() {
        boolean talking = true;
        int hour = 11;

        assertFalse(ParrotTrouble.parrotTrouble(talking, hour), "talking at day");
    }
    @Test
    public void isSilence() {
        boolean talking = false;
        int hour = 23;

        assertFalse(ParrotTrouble.parrotTrouble(talking, hour), "isn t talking any more");
    }

}

