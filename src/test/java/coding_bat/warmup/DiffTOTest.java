package coding_bat.warmup;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiffTOTest {

    @Test
    public void over21(){
        int n = 25;
        assertEquals(8,DiffTO.diff21(n));
    }
    @Test
    public void below21(){
        int n = 10;
        assertEquals(11,DiffTO.diff21(n));
    }

    @Test
    public void equal21(){
        int n = 21;
        assertEquals(0,DiffTO.diff21(n));
    }
}