package Jobsheet_3.ArrayObjects.src.Tugas2;

public class Mahasiswa {
    public String nama;
    public long nim;
    public String jenisKelamin;
    public double ipk;

    Mahasiswa(String nama, long nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    public static double rataIPK(Mahasiswa[] mahasiswa) {
        double totalIpk = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            totalIpk += mahasiswa[i].ipk;
        }
        return totalIpk / mahasiswa.length;
    }
    public static Mahasiswa IPKterbesar(Mahasiswa[] mahasiswa) {
        Mahasiswa IPKterbesar = mahasiswa[0];
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i].ipk > IPKterbesar.ipk) {
                IPKterbesar = mahasiswa[i];
            }
        }
        return IPKterbesar;
    }
    public static void tampilkanIPKterbesar(Mahasiswa IPKterbesar) {
        System.out.println();
        System.out.println("Mahasiswa dengan IPK terbesar");
        System.out.println("Nama          : " + IPKterbesar.nama);
        System.out.println("NIM           : " + IPKterbesar.nim);
        System.out.println("Jenis Kelamin : " + IPKterbesar.jenisKelamin);
        System.out.println("IPK           : " + IPKterbesar.ipk);
    }

}
