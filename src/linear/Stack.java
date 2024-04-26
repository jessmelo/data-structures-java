package linear;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    List<T> stack = new ArrayList<T>();

    public Stack(T data) {
        stack.add(data);
    }

    public int size() {
        return stack.size();
    }

    public void push(T data) {
        stack.add(data);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public void printStack() {
        for (int i = stack.size()-1; i >= 0; i--) {
            System.out.printf("%s ", stack.get(i).toString());
        }
    }
}
