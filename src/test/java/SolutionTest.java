import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import org.w3c.dom.Node;
import sort_binary_by_levels.Kata;

public class SolutionTest {
    @Test
    public void nullTest() {
        assertEquals(Arrays.asList(), Kata.treeByLevels(null));
    }


}