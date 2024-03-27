package Kuis1_Ayleen;
import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        Album07[] ayleenArray = new Album07[5];
        System.out.println("====================================");

        for (int i = 0; i < ayleenArray.length; i++) {
            ayleenArray[i] = new Album07();
            System.out.print("Masukkan Judul Album : ");
            ayleenArray[i].judul07 = ayleen07.nextLine();

            System.out.print("Masukkan nama penyanyi : ");
            ayleenArray[i].penyanyi07 = ayleen07.nextLine();

            System.out.print("Masukkan jumlah Album : ");
            ayleenArray[i].jumlah07 = ayleen07.nextInt();
            ayleen07.nextLine();

            System.out.print("Masukkan Harga : ");
            ayleenArray[i].harga07 = ayleen07.nextInt();
            ayleen07.nextLine();

            System.out.println("====================================");
        }

        for (Album07 album : ayleenArray) {
            album.tampilkan07();
        }
        System.out.println("====================================");

        for (int i = 0; i < ayleenArray.length; i++) {
            int total = ayleenArray[i].hitungPenjualan07(ayleenArray[i].jumlah07);
            System.out.println("Total Penjualan " + ayleenArray[i].judul07 + ": Rp. " + total);
        }

        System.out.println("====================================");
        Album07 albumKurangPopuler = new Album07();
        albumKurangPopuler.cariAlbumKurangPopuler07(ayleenArray);

        System.out.println("====================================");

        Album07 daftar = new Album07();
        daftar.daftarAlbum07(ayleenArray);
    }
}
