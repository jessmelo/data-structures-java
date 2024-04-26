import linear.LinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
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
    }
}