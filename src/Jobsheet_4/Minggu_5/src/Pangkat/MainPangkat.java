package Jobsheet_4.Minggu_5.src.Pangkat;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = ayleen07.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            png[i].nilai = ayleen07.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            png[i].pangkat = ayleen07.nextInt();
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}