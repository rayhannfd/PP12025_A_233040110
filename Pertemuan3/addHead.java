package Pertemuan3;

public class addHead {
    Node Head;

    addHead() {
        Head = null;
    }

    boolean isEmpty() {
        return Head == null;
    }

    public void addTail(int data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (isEmpty()) {
            Head = newNode;
        } else {
            curNode = Head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = Head;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            Head = newNode;
        } else {
            newNode.setNext(Head);
            Head = newNode;
        }
    }

    public static void main(String[] args) {
        addHead list = new addHead();
        list.addHead(7);
        list.addHead(5);
        list.addHead(4);
        list.addHead(1);	

        System.out.print("Output: ");
        list.displayElement();
    }
}
