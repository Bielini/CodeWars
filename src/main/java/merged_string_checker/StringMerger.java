package merged_string_checker;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) {
            return false;
        }
        StringBuilder t = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder(part1);
        StringBuilder sb2 = new StringBuilder(part2);
        while (t.length() > 0) {
            int len1 = 0;
            int len2 = 0;

            for (int i = 0; i < sb1.length(); i++) {

                if (t.charAt(i) == sb1.charAt(i)) {
                    len1++;
                } else {
                    break;
                }
            }
            for (int i = 0; i < sb2.length(); i++) {

                if (t.charAt(i) == sb2.charAt(i)) {
                    len2++;
                } else {
                    break;
                }
            }
            if (len1 == 0 && len2 == 0) {
                return false;
            }
            if (len1 > len2) {
                sb1.delete(0, 1);
                t.delete(0, 1);

            } else {
                sb2.delete(0, 1);
                t.delete(0, 1);
            }

        }
        if (t.length() == 0 && sb1.length() == 0 && sb2.length() == 0) {
            return true;
        } else {
            return false;
        }

    }

}