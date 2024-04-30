package Jobsheet_7.Percobaan1;
import java.util.Scanner;

public class Utama07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        Gudang07 gudang07 = new Gudang07(7);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = ayleen07.nextInt();
            ayleen07.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = ayleen07.nextInt();
                    ayleen07.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = ayleen07.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = ayleen07.nextLine();

                    Barang07 barangBaru = new Barang07(kode, nama, kategori);
                    gudang07.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang07.ambilBarang();
                    break;
                case 3:
                    gudang07.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        }
    }
}