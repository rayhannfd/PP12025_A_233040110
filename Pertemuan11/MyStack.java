package Pertemuan11;

public class MyStack extends AbstractStack {

    public MyStack(int size) {
        super(size);
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack overflow");
        }
    }
    
    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack underflow");
            return 0; 
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}