package Jobsheet_6.TestSearching.src.P7;

public class Buku07 {
    public String judul, pengarang;
    public int kodeBuku, tahunTerbit, stock;

    Buku07 (int k, String j, int t, String p, int s) {
        kodeBuku = k;
        judul = j;
        tahunTerbit = t;
        pengarang = p;
        stock = s;
    }
    void TampilDataBuku() {
        System.out.println("=============================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang Buku : " + pengarang);
        System.out.println("Stock Buku : " + stock);
    }
}