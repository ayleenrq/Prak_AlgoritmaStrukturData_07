package Jobsheet_2;

public class BukuMain07 {
    public static void main(String[] args) {
        Buku07 bk1 = new Buku07();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        System.out.println("Harga total : " + bk1.hitungHargaTotal(5));
        System.out.println("Harga Diskon : " + bk1.hitungDiskon(bk1.hitungHargaTotal(5)));

        System.out.println();

        Buku07 bk2 = new Buku07("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        System.out.println();

        Buku07 bukuAyleen = new Buku07("Sains", "Ayleen Ruhul Qisthy", 236, 17, 99000);
        bukuAyleen.terjual(6);
        bukuAyleen.tampilInformasi();
        System.out.println("Harga total buku terjual : " + bukuAyleen.hitungHargaTotal(6));
    }
}
