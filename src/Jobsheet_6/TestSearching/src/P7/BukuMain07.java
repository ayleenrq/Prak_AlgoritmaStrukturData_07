package Jobsheet_6.TestSearching.src.P7;
import java.util.Scanner;

public class BukuMain07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        Scanner ayleen072 = new Scanner(System.in);
        PencarianBuku07 data = new PencarianBuku07();
        int jumBuku = 5;

        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = ayleen07.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = ayleen072.nextLine();
            ayleen07.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = ayleen07.nextInt();
            System.out.print("Pengarang Buku \t : ");
            String pengarang = ayleen072.nextLine();
            ayleen07.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = ayleen07.nextInt();

            Buku07 m = new Buku07(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.Tambah(m);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Data keseluruhan Buku :");
        data.TampilDataBuku();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari : ");
        System.out.print("Kode Buku : ");
        int cari = ayleen07.nextInt();

        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        Buku07 dataBuku = data.FindBuku(cari);
        dataBuku.TampilDataBuku();
    }
}