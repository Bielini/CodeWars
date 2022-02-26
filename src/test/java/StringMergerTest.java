import merged_string_checker.StringMerger;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
//        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertTrue("Can we merge it? Yes, we can!", StringMerger.isMerge("Can we merge it? Yes, we can!", "C e meit ,w a!", "anwerg ?Yes ecn"));
        assertTrue("Can we merge it? Yes, we can!", StringMerger.isMerge("Can we merge it? Yes, we can!","Canmere it?Y," ," we g es we can!" ));
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
    }
}
