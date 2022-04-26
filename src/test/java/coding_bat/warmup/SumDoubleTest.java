package coding_bat.warmup;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumDoubleTest {

    @Test
    public void negativeNumbers(){
        int a = -3;
        int b = -3;

        int result = SumDouble.sumDouble(a,b);

        assertEquals(-12,result);
    }
    @Test
    public void zeroAppeared(){
        int a = 0;
        int b = 0;

        int result = SumDouble.sumDouble(a,b);

        assertEquals(0,result);
    }
    @Test
    public void positiveNumbers(){
        int a = 10;
        int b = 2;

        int result = SumDouble.sumDouble(a,b);

        assertEquals(12,result);
    }

    @Test
    public void sameNumbers(){
        int a = 3;
        int b = 3;

        int result = SumDouble.sumDouble(a,b);

        assertEquals(12,result);
    }






}


