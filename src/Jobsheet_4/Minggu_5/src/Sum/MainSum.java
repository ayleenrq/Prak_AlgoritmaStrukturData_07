package Jobsheet_4.Minggu_5.src.Sum;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = ayleen07.nextInt();
        
        Sum sm = new Sum(elm);
        System.out.println("============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
            sm.keuntungan[i] = ayleen07.nextDouble();
        }
        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + Math.round(sm.totalDC(sm.keuntungan, 0, sm.elemen-1) * 100.0) / 100.0);
    }
}
