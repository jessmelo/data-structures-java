import linear.LinkedList;
import linear.Stack;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Single Linked List
        LinkedList<String> list = new LinkedList<>("Hello");
        list.add("World");
        list.add("!");
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Jess");
        list.printList();
        System.out.println("This list has " + list.size() + " elements");
        list.clear();
        System.out.println("This list has " + list.size() + " elements");

        // Stack
        Stack<String> stack = new Stack<>("Hello");
        stack.push("World");
        stack.push("!");
        stack.push("My");
        stack.push("name");
        stack.push("is");
        stack.push("Jess");
        System.out.println("This stack has " + stack.size() + " elements");
        System.out.println("Printing stack (from top to bottom):");
        stack.printStack();
    }
}