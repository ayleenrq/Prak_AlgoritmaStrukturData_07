package UTS_Ayleen;

public class NasabahAyleen {
    public String norekAyleen, namaAyleen, nikAyleen;
    public int umurAyleen;
    public double saldoAyleen;

    NasabahAyleen () {

    }
    NasabahAyleen (String norek, String nama, String nik, int umur, double saldo) {
        norekAyleen = norek;
        namaAyleen = nama;
        nikAyleen = nik;
        umurAyleen = umur;
        saldoAyleen = saldo;
    }
    void TampilDataNasabahAyleen() {
        System.out.println("===============================");
        System.out.println("Nomor Rekening  : " + norekAyleen);
        System.out.println("Nama Nasabah    : " + namaAyleen);
        System.out.println("NIK Nasabah     : " + nikAyleen);
        System.out.println("Umur Nasabah    : " + umurAyleen);
        System.out.println("Saldo Rekening  : Rp." + saldoAyleen);
    }
}
