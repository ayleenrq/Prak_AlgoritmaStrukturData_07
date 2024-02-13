package Jobsheet_1;
import java.util.Scanner;

public class Tugas1_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        String inputKode;
        boolean kodeDitemukan = false;
        String[] kode = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[][] kota = {
            {"B", "A", "N", "T", "E", "N"},
            {"J", "A", "K", "A", "R", "T", "A"},
            {"B", "A", "N", "D", "U", "N", "G"},
            {"C", "I", "R", "E", "B", "O", "N"},
            {"B", "O", "G", "O", "R"},
            {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},
            {"S", "E", "M", "A", "R", "A", "N", "G"},
            {"S", "U", "R", "A", "B", "A", "Y", "A"},
            {"M", "A", "L", "A", "N", "G"},
            {"T", "E", "G", "A", "L"}
        };

        System.out.print("Masukkan Kode Plat Nomor : ");
        inputKode = ayleen07.nextLine();
        
        for (int i = 0; i < kode.length; i++) {    
            if (inputKode.equalsIgnoreCase(kode[i])) {
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                kodeDitemukan = true;
                break;
            }
        }

        if (!kodeDitemukan) {
            System.out.println("Kode tidak ditemukan.");
        }
    }
}
