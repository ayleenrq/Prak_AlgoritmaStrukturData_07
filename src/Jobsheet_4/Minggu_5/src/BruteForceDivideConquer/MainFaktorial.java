package Jobsheet_4.Minggu_5.src.BruteForceDivideConquer;
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.print("Masukkan jumlah elemen : ");
        int ijml = ayleen07.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < ijml; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = ayleen07.nextInt();
        }
        System.out.println("HASIL - BRUTE FORCE WHILE");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force While adalah " + fk[i].faktorialBF_while(fk[i].nilai));
        }
        System.out.println("HASIL - BRUTE FORCE DO - WHILE");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force Do-While adalah " + fk[i].faktorialBF_dowhile(fk[i].nilai));
        }
        
        // System.out.println("HASIL - BRUTE FORCE");
        // for (int i = 0; i < ijml; i++) {
        //     System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        // }
        // System.out.println("HASIL - DIVIDE AND CONQUER");
        // for (int i = 0; i < ijml; i++) {
        //     System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        // }
    }
}