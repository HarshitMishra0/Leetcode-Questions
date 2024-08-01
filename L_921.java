import java.util.Stack;

public class L_921 {
    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                }
            } else {
                stack.push('(');
            }
        }
        return stack.size();
    }
}
