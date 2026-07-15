import java.util.*;

public class BalancedBrackets {

    public static boolean isValidConfig(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing bracket ')'
            else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }

            else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

            // Closing bracket ']'
            else if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        if (isValidConfig(str)) {
            System.out.println("Valid Brackets");
        } else {
            System.out.println("Invalid Brackets");
        }
    }
}