package Pertemuan7;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.tambah(4);
        list.tambah(3);
        list.tambah(7);
        list.tambah(8);
        list.tambah(1);
        list.tambah(9);

        list.tampil();
        list.hapusSemua();
        list.tampil(); 
    }
}
