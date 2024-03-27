package Kuis1_Ayleen;
import Jobsheet_3.ArrayObjects.src.Tugas2.Mahasiswa;

public class Album07 {
    String judul07, penyanyi07;
    int jumlah07, harga07;

    Album07() {

    }

    Album07 (String jud07, String pny07, int jum07, int har07) {
        judul07 = jud07;
        penyanyi07 = pny07;
        harga07 = har07;
        jumlah07 = jum07;
    }

    void tampilkan07() {
        System.out.println("Judul Album : " + judul07);
        System.out.println("Penyanyi : " + penyanyi07);
        System.out.println("Jumlah Album : " + jumlah07);
        System.out.println("Harga : Rp. " + harga07);
    }

    int hitungPenjualan07(int jml) {
        return harga07 * jumlah07;
    }

    public static void daftarAlbum07(Album07[] ayleenArray) {
        Album07 daftarAlbum = ayleenArray[0];
        for (int i = 0; i < ayleenArray.length - 1; i++) {
            for (int j = 0; j < ayleenArray.length - i - 1; j++) {
                if (ayleenArray[j].harga07 < ayleenArray[j + 1].harga07) {
                    Album07 temp = ayleenArray[j];
                    ayleenArray[j] = ayleenArray[j + 1];
                    ayleenArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Album Kurang Populer adalah : ");
        daftarAlbum.tampilkan07();
    }

    public static void cariAlbumKurangPopuler07(Album07[] ayleenArray) {
        Album07 albumKurangPopuler = ayleenArray[0];
        for (Album07 album : ayleenArray) {
            if (album.jumlah07 < albumKurangPopuler.jumlah07) {
                albumKurangPopuler = album;
            }
        }
        System.out.println("Album Kurang Populer adalah : ");
        albumKurangPopuler.tampilkan07();
    }

    void terjual(int jml) {
        if (jumlah07 >= jml && jumlah07 > 0) {
            jumlah07 -= jml;
        }
    }
}