package Jobsheet_8.Praktikum2;
import java.util.Scanner;

public class QueueMain07 {
    public static void menu() {
        System.out.println();
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        int pilih;
        
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = ayleen07.nextInt();
        Queue07 antri = new Queue07(jumlah);
        
        do {
            menu();
            pilih = ayleen07.nextInt();
            ayleen07.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = ayleen07.nextLine();
                    System.out.print("Nama : ");
                    String nama = ayleen07.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = ayleen07.nextLine();
                    System.out.print("Umur : ");
                    int umur = ayleen07.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = ayleen07.nextDouble();
                    Nasabah07 nb = new Nasabah07(norek, nama, alamat, umur, saldo);
                    ayleen07.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah07 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals
                        (data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar : " + data.norek + " "
                        + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo); 
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
            }
            
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}