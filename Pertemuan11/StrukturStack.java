	package Pertemuan11;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;

    public StrukturStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.TOP = -1;
    }

    public void push(int data) {
        if (TOP < capacity - 1) {
            TOP++;
            array[TOP] = data;
            System.out.println("Push: " + data);
        } else {
            System.out.println("Stack penuh.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = array[TOP];
            TOP--;
            return data;
        } else {
            System.out.println("Stack kosong.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return TOP == -1;
    }

    public boolean isFull() {
        return TOP == capacity - 1;
    }

    public int size() {
        return TOP + 1;
    }

    public int top() {
        if (!isEmpty()) {
            return array[TOP];
        } else {
            System.out.println("Stack kosong.");
            return -1;
        }
    }
}