package Jobsheet_3.ArrayObjects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        PersegiPanjang[][] ppArray = new PersegiPanjang[2][2];

        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                ppArray[i][j] = new PersegiPanjang(i, j);
                System.out.println("Persegi panjang ke-" + (i * ppArray[i].length + j + 1));

                System.out.print("Masukkan panjang : ");
                ppArray[i][j].panjang = ayleen07.nextInt();

                System.out.print("Masukkan lebar : ");
                ppArray[i][j].lebar = ayleen07.nextInt();
            }
        }
        System.out.println();
        
        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                System.out.println("Persegi panjang ke-" + (i * ppArray[i].length + j + 1));
                System.out.println("Panjang : " + ppArray[i][j].panjang + ", lebar : " + ppArray[i][j].lebar);
            }
        }
    }
}