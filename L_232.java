import java.util.Stack;

public class L_232 {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.add(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int answer = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return answer;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int answer = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return answer;
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}
