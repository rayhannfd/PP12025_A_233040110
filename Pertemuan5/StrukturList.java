package Pertemuan5;

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

    
    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }
}
