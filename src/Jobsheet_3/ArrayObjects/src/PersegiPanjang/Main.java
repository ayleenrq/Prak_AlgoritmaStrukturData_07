package Jobsheet_3.ArrayObjects.src.PersegiPanjang;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = ayleen07.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[length];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = ayleen07.nextInt();
            System.out.print("Masukkan lenar : ");
            ppArray[i].lebar = ayleen07.nextInt();
        }
        System.out.println();

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }
    }
}