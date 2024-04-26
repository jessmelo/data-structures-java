package linear;

public class LinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        T data;
        Node next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList(T head) {
        this.head = new Node(head);
        this.tail = this.head;
        this.size = 1;
    }

    public void add(T data) {
        Node element = new Node(data);
        this.tail.next = element;
        this.tail = element;
        this.size++;
    }

    public void add(T data, int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == this.size) {
            add(data);
            return;
        }
        Node element = new Node(data);
        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node aux = current;
        current = element;
        current.next = aux.next;
        aux.next = current;
        this.tail = element;
        this.size++;
    }

    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.printf("%s ", current.data.toString());
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        return this.size;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            return this.head.data;
        }
        if (index == this.size - 1) {
            return this.tail.data;
        }
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node aux = current.next;
        current.next = aux.next;
        aux = null;
        this.size--;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}