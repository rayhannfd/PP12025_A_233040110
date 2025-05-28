package Pertemuan11;

public abstract class AbstractStack {
    protected int maxSize;
    protected int[] stackArray;
    protected int top;

    public AbstractStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public abstract void push(int value);
    public abstract int pop();
    public abstract boolean isEmpty();
}
