package Jobsheet_3.ArrayObjects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = ayleen07.nextInt();
            System.out.print("Masukkan lenar : ");
            ppArray[i].lebar = ayleen07.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }
    }
}
