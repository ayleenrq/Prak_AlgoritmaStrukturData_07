package Jobsheet_3.ArrayObjects.src.Tugas1;

public class Limas {
    public double sisi;
    public double tinggi;

    public Limas(double s, double t) {
        sisi = s;
        tinggi = t;
    }
    public double hitungLuasPermukaan() {
        double luasAlas = sisi * sisi;
        double setengahSisi = (0.5 * sisi);
        double tinggiSisi = Math.sqrt((tinggi * tinggi) + (setengahSisi * setengahSisi));
        double luasSisiTegak = 4 * 0.5 * sisi * tinggiSisi;
        return luasAlas + luasSisiTegak; 
    }
    public double hitungVolume() {
        return Math.pow(sisi, 2) * tinggi / 3; 
    }
}
