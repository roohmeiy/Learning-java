package anonymousQuesSet;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis solution = new ValidParenthesis();
        String s = "[]()[][]";
        boolean result = solution.isValid(s);
        System.out.println("Is the string \"" + s + "\" valid? " + result);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                stack.push(i);
            } else if ((i == ')' || i == '}' || i == ']') ) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((i == ')' && top != '(') || (i == '}' && top != '{') || (i == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
