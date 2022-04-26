import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import string_anagram.StringAnagram;

import static org.junit.jupiter.api.Assertions.*;



public class StringAnagramTest {

    @Test
    public void diffLengthCheck(){
        String one = "knee";
        String two = "kneee";

        boolean check = StringAnagram.check(one, two);

        assertFalse(check,"Strings length are not equal");
    }

    @Test
    public void isAnagram(){
        String one = "knee";
        String two = "keen";

        boolean check = StringAnagram.check(one, two);

        assertTrue(check,"Strings are not Anagram");
    }

    @Test
    public void notAnagram(){
        String one = "knee";
        String two = "kean";

        boolean check = StringAnagram.check(one, two);

        assertFalse(check,"Strings are not Anagram");
    }

}