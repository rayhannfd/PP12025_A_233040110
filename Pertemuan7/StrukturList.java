package Pertemuan7;

public class StrukturList {
    Node head;

    public StrukturList() {
        head = null;
    }

    public void tambah(int data) {
        Node baru = new Node(data);
        if (head == null) {
            head = baru;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }
    }

    public void tampil() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List Kosong");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean find(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void hapusSemua() {
        head = null;
    }
}
