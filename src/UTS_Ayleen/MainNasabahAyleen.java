package UTS_Ayleen;
import java.util.Scanner;

public class MainNasabahAyleen {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        PencarianNasabah data = new PencarianNasabah();
        int jumNasabah = 6, menu;
        
        do {
            System.out.println("============================================");
            System.out.println("Menu");
            System.out.println("============================================");
            System.out.println("1. Input Data Nasabah");
            System.out.println("2. Cari Data Nasabah");
            System.out.println("3. Tampilkan Seluruh Informasi Nasabah");
            System.out.println("4. Informasi Saldo Nasabah (descending)");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");
            menu = ayleen07.nextInt();
            
            switch (menu) {
                case 1:
                System.out.println("============================================");
                System.out.println("Masukkan Data Nasabah");
                for (int i = 0; i < jumNasabah; i++) {
                    System.out.println("============================================");
                    System.out.println("Data Nasabah ke-" + (i+1));
                    System.out.println("--------------------------------------------");
                    System.out.print("Masukkan Nomor Rekening\t\t : ");
                    String norek = ayleen07.next();
                    ayleen07.nextLine();
                    System.out.print("Masukkan Nama Nasabah \t\t : ");
                    String nama = ayleen07.next();
                    ayleen07.nextLine();
                    System.out.print("Masukkan NIK Nasabah \t\t : ");
                    String nik = ayleen07.next();
                    ayleen07.nextLine();
                    System.out.print("Masukkan Umur Nasabah \t\t : ");
                    int umur = ayleen07.nextInt();
                    System.out.print("Masukkan Jumlah Saldo Nasabah \t : ");
                    double saldo = ayleen07.nextDouble();
        
                    NasabahAyleen nas = new NasabahAyleen(norek, nama, nik, umur, saldo);
                    data.TambahAyleen(nas);
                    }
                    break;
                case 2:
                    data.searchNasabahAyleen();
                    break;
                case 3:
                    data.TampilDataAyleen();
                    break;
                case 4:
                    data.selectionSortDescendingAyleen();
                    System.out.println("Informasi Saldo Nasabah (descending):");
                    data.TampilDataAyleen();
                    break;
                default:
                    System.out.println("Pilihan Menu tidak valid");
                    break;
            }
        } while (menu != 5);
    }
}
