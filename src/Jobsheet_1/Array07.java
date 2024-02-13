package Jobsheet_1;
import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        double pancasila, kti, ctps, matematika, inggris, daspro, prakDaspro, keselamatan, total = 0;

        String[][] hasilNilai = {
            {"MK                                    ", "    Nilai Angka", "Nilai Huruf", "Bobot Nilai"},
            {"Pancasila                             ", "", "", ""},
            {"Konsep Teknologi Informasi            ", "", "", ""},
            {"Critical Thinking dan Problem Solving ", "", "", ""},
            {"Matematika Dasar                      ", "", "", ""},
            {"Bahasa Inggris                        ", "", "", ""},
            {"Dasar Pemograman                      ", "", "", ""},
            {"Praktikum Dasar Pemrograman           ", "", "", ""},
            {"Keselamatan dan Kesehatan Kerja       ", "", "", ""}
        };

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 1; i < hasilNilai.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + hasilNilai[i][0] + ": ");
            switch (i) {
                case 1:
                    pancasila = ayleen07.nextDouble();
                    if (pancasila >=0 && pancasila <= 100) {
                        hasilNilai[i][1] = String.valueOf(pancasila);
                        hasilNilai[i][2] = nilaiHuruf(pancasila);
                        hasilNilai[i][3] = String.valueOf(bobotNilai(pancasila));
                        total += bobotNilai(pancasila) * 2;
                    } else {
                        System.out.println("Nilai tidak valid!");
                    }
                    break;
                case 2:
                    kti = ayleen07.nextDouble();
                    if (kti >=0 && kti <= 100) {
                        hasilNilai[i][1] = String.valueOf(kti);
                        hasilNilai[i][2] = nilaiHuruf(kti);
                        hasilNilai[i][3] = String.valueOf(bobotNilai(kti));
                        total += bobotNilai(kti) * 2;
                    } else {
                        System.out.println("Nilai tidak valid!");
                        i--;
                    }
                    break;
                case 3:
                    ctps = ayleen07.nextDouble();
                    if (ctps >=0 && ctps <= 100) {
                        hasilNilai[i][1] = String.valueOf(ctps);
                        hasilNilai[i][2] = nilaiHuruf(ctps);
                        hasilNilai[i][3] = String.valueOf(bobotNilai(ctps));
                        total += bobotNilai(ctps) * 2;
                    } else {
                        System.out.println("Nilai tidak valid!");
                        i--;
                    }
                    break;
                case 4:
                    matematika = ayleen07.nextDouble();
                    if (matematika >=0 && matematika <= 100) {
                        hasilNilai[i][1] = String.valueOf(matematika);
                        hasilNilai[i][2] = nilaiHuruf(matematika);
                        hasilNilai[i][3] = String.valueOf(bobotNilai(matematika));
                        total += bobotNilai(matematika) * 3;
                    } else {
                        System.out.println("Nilai tidak valid!");
                        i--;
                    }
                    break;
                case 5:
                    inggris = ayleen07.nextDouble();
                    if (inggris >=0 && inggris <= 100) {
                        hasilNilai[i][1] = String.valueOf(inggris);
                        hasilNilai[i][2] = nilaiHuruf(inggris);
                        hasilNilai[i][3] = String.valueOf(bobotNilai(inggris));
                        total += bobotNilai(inggris) * 2;
                    } else {
                        System.out.println("Nilai tidak valid!");
                        i--;
                    }
                    break;
                case 6:
                    daspro = ayleen07.nextDouble();
                    if (daspro >=0 && daspro <= 100) {
                        hasilNilai[i][1] = String.valueOf(daspro);
                        hasilNilai[i][2] = nilaiHuruf(daspro);
                        hasilNilai[i][3] = String.valueOf(bobotNilai(daspro));
                        total += bobotNilai(daspro) * 2;
                    } else {
                        System.out.println("Nilai tidak valid!");
                        i--;
                    }
                    break;
                case 7:
                    prakDaspro = ayleen07.nextDouble();
                    if (prakDaspro >=0 && prakDaspro <= 100) {
                        hasilNilai[i][1] = String.valueOf(prakDaspro);
                        hasilNilai[i][2] = nilaiHuruf(prakDaspro);
                        hasilNilai[i][3] = String.valueOf(bobotNilai(prakDaspro));
                        total += bobotNilai(prakDaspro) * 3;
                    } else {
                        System.out.println("Nilai tidak valid!");
                        i--;
                    }
                    break;
                case 8:
                    keselamatan = ayleen07.nextDouble();
                    if (keselamatan >=0 && keselamatan <= 100) {
                        hasilNilai[i][1] = String.valueOf(keselamatan);
                        hasilNilai[i][2] = nilaiHuruf(keselamatan);
                        hasilNilai[i][3] = String.valueOf(bobotNilai(keselamatan));
                        total += bobotNilai(keselamatan) * 2;
                    } else {
                        System.out.println("Nilai tidak valid!");
                        i--;
                    }
                    break;
            }
        }

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        for (int i = 0; i < hasilNilai.length; i++) {
            for (int j = 0; j < hasilNilai[i].length; j++) {
                if (i == 0) {
                    System.out.print(hasilNilai[i][j] + "  ");
                    continue;
                }
                System.out.print(hasilNilai[i][j] + "          ");
            }
            System.out.println();
        }

        double ip = total / 18;
        System.out.println("==============================");
        System.out.println("IP Semester : " + Math.round(ip * 100.0) / 100.0);
        System.out.println("==============================");

    }
    static String nilaiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100){
            return "A ";
        }
        else if (nilai > 73 && nilai <= 80){
            return "B+";
        }
        else if (nilai > 65 && nilai <= 73){
            return "B ";
        }
        else if (nilai > 60 && nilai <= 65){
            return "C+";
        }
        else if (nilai > 50 && nilai <= 60){
            return "C ";
        }
        else if (nilai > 39 && nilai <= 50){
            return "D ";
        }
        else {
            return "E ";
        }
    }
    static double bobotNilai(double nilai) {
        if (nilai > 80 && nilai <= 100){
            return 4.00;
        }
        else if (nilai > 73 && nilai <= 80){
            return 3.50;
        }
        else if (nilai > 65 && nilai <= 73){
            return 3.00;
        }
        else if (nilai > 60 && nilai <= 65){
            return 2.50;
        }
        else if (nilai > 50 && nilai <= 60){
            return 2.00;
        }
        else if (nilai > 39 && nilai <= 50){
            return 1.00;
        }
        else {
            return 0.00;
        }
    }
}
