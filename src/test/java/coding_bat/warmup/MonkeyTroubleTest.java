package coding_bat.warmup;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonkeyTroubleTest {


    @Test
    public void bothSmiling(){
        boolean aSmile = true;
        boolean bSmile = true;

        boolean result = MonkeyTrouble.monkeyTrouble(aSmile, bSmile);

        assertTrue(result, "Both  problem");

    }
    @Test
    public void neitherSmiling(){
        boolean aSmile = false;
        boolean bSmile = false;

        boolean result = MonkeyTrouble.monkeyTrouble(aSmile, bSmile);

        assertTrue(result, "Both  problem");
    }
    @Test
    public void onlyASmiling(){
        boolean aSmile = true;
        boolean bSmile = false;

        boolean result = MonkeyTrouble.monkeyTrouble(aSmile, bSmile);

        assertFalse(result, "One problem");
    }
    @Test
    public void onlyBSmiling(){
        boolean aSmile = false;
        boolean bSmile = true;

        boolean result = MonkeyTrouble.monkeyTrouble(aSmile, bSmile);

        assertFalse(result, "One problem");
    }

}