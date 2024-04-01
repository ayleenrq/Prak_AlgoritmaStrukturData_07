package Jobsheet_5.bubble_selection_insertion.src.jobsheet6;

public class Mahasiswa {
    public String nama;
    public int thnMasuk, umur;
    public double ipk;

    Mahasiswa (String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }
    void tampilMahasiswa () {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Tahun Masuk    : " + thnMasuk);
        System.out.println("Umur Mahasiswa : " + umur);
        System.out.println("IPK Mahasiswa  : " + ipk);
    }
}