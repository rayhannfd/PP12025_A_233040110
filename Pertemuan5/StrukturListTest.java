package Pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {
       
        System.out.println("Latihan 2:");
        StrukturList list = new StrukturList();
        
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7);

        System.out.print("Isi list: ");
        list.display();

        list.removeHead();
        System.out.print("Setelah hapus head: ");
        list.display();

        list.removeHead();
        System.out.print("Setelah hapus head lagi: ");
        list.display();

        list.removeHead();
        System.out.print("Setelah hapus head ketiga kali: ");
        list.display();

        System.out.println();

        
        System.out.println("Latihan 4:");
        StrukturList list2 = new StrukturList();

        list2.addFirst(1);
        list2.addFirst(5);
        list2.addFirst(3);
        list2.addFirst(6);
        list2.addFirst(2);

        System.out.print("Isi list: ");
        list2.display();

        list2.removeTail();
        System.out.print("Setelah hapus tail: ");
        list2.display();

        list2.removeHead();
        System.out.print("Setelah hapus head: ");
        list2.display();

        list2.removeTail();
        System.out.print("Setelah hapus tail lagi: ");
        list2.display();
    }
}
