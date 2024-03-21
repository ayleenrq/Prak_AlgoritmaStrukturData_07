package Jobsheet_4.Minggu_5.src.Sum;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan : ");
        int jumlahPerusahaan = ayleen07.nextInt();

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("\nPerusahaan " + (i + 1));
            
            System.out.println("============================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan jumlah bulan : ");
            int elm = ayleen07.nextInt();
            
            Sum sm = new Sum(elm);
            System.out.println("============================================================");
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                sm.keuntungan[j] = ayleen07.nextDouble();
            }
            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
            System.out.println("============================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + Math.round(sm.totalDC(sm.keuntungan, 0, sm.elemen-1) * 100.0) / 100.0);
        }
    }
}