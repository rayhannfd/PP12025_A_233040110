package Pertemuan6;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2); 

        System.out.println("Isi list awal:");
        list.display(); 

        list.removeMid();
        System.out.println("Setelah hapus elemen tengah:");
        list.display(); 
    }
}