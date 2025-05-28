package Pertemuan6;

public class StrukturList {
    private Node head;

    public StrukturList() {
        head = null;
    }
    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void removeHead() {
        if (head == null) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }
        Node temp = head;
        head = head.getNext();
        dispose(temp);
    }

    public void removeTail() {
        if (head == null) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }
        if (head.getNext() == null) {
            dispose(head);
            head = null;
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp.getNext() != null) {
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(null);
        dispose(temp);
    }

    public void removeMid() {
        if (head == null || head.getNext() == null) {
            System.out.println("List kosong atau hanya memiliki satu elemen.");
            return;
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        int midIndex = count / 2;

        temp = head;
        Node prev = null;
        for (int i = 0; i < midIndex; i++) {
            prev = temp;
            temp = temp.getNext();
        }

        if (prev != null && temp != null) {
            prev.setNext(temp.getNext());
            dispose(temp);
        }
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }
}