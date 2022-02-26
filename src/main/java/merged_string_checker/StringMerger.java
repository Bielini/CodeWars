package merged_string_checker;

import java.util.Stack;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {

        if (s.length() != part1.length() + part2.length()) {
            return false;
        }
        boolean flag1 = true;
        boolean flag2 = true;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = part1.length() - 1; i >= 0; i--) {
            stack1.push(part1.charAt(i));
        }
        for (int i = part2.length() - 1; i >= 0; i--) {
            stack2.push(part2.charAt(i));
        }


        for (int i = 0; i < s.length(); i++) {
            if (!stack1.isEmpty() && stack1.peek() == s.charAt(i)) {
                stack1.pop();
            } else if (!stack2.isEmpty() && stack2.peek() == s.charAt(i)) {
                stack2.pop();
            } else {
                if (!stack1.isEmpty()&&!stack2.isEmpty()){
                    return false;
                }
            }
        }
        if (stack1.isEmpty()&&stack2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

}