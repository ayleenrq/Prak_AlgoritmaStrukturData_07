package Jobsheet_1;
import java.util.Scanner;

public class Pemilihan07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        float uas, uts, kuis, tugas, nilaiAkhir;
        String hasil, nilaiHuruf;
        int nilai;

        System.out.println("==============================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas : ");
        tugas = ayleen07.nextFloat();
        System.out.print("Masukkan Nilai Kuis  : ");
        kuis = ayleen07.nextFloat();
        System.out.print("Masukkan Nilai UTS   : ");
        uts = ayleen07.nextFloat();
        System.out.print("Masukkan Nilai UAS   : ");
        uas = ayleen07.nextFloat(); 

        if ((uas >=0 && uas <= 100) && (uts >=0 && uts <= 100) && (kuis >=0 && kuis <= 100) && (tugas >=0 && tugas <= 100)) {

            nilaiAkhir = (tugas * 0.2F) + (kuis * 0.2F) + (uts * 0.3F) + (uas * 0.3F);
            nilai = (int) nilaiAkhir;

            if (nilai > 80 && nilai <= 100){
                nilaiHuruf = "A";
            }
            else if (nilai > 73 && nilai <= 80){
                nilaiHuruf = "B+";
            }
            else if (nilai > 65 && nilai <= 73){
                nilaiHuruf = "B";
            }
            else if (nilai > 60 && nilai <= 65){
                nilaiHuruf = "C+";
            }
            else if (nilai > 50 && nilai <= 60){
                nilaiHuruf = "C";
            }
            else if (nilai > 39 && nilai <= 50){
                nilaiHuruf = "D";
            }
            else {
                nilaiHuruf = "E";
            }

            hasil = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "ANDA TIDAK LULUS" : "SELAMAT ANDA LULUS";
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println(hasil);
            System.out.println("==============================");

        } else {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai tidak valid!");
            System.out.println("==============================");
            System.out.println("==============================");
        }     
    }
}
