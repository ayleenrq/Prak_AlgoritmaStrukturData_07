package Jobsheet_1;
import java.util.Scanner;

public class Perulangan07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        long n, nilaiAkhir;

        System.out.print("Masukkan NIM : ");
        n = ayleen07.nextLong();

        nilaiAkhir = n % 100;
        if (nilaiAkhir < 10) {
            nilaiAkhir += 10;
        }
        System.out.println("n : " + nilaiAkhir);

        for (int i = 1; i <= nilaiAkhir; i++) {
            if (i % 2 == 0) {
                if (i != 6 && i != 10) {
                    System.out.print(i + " ");
                } else {
                    continue;
                }
            } else {
                System.out.print("* ");
            }
        }
    }
}
