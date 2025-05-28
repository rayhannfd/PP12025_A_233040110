package Pertemuan11;

public class StackApp {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());
        System.out.println("Size: " + stack.size());
        System.out.println("Is Full: " + stack.isFull());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}