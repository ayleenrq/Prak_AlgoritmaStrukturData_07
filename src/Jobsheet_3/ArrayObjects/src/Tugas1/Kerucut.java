package Jobsheet_3.ArrayObjects.src.Tugas1;

public class Kerucut {
    public double jarijari;
    public double sisimiring;

    public Kerucut(double r, double s) {
        jarijari = r;
        sisimiring = s;
    }
    public double hitungLuasPermukaan() {
        return Math.PI * jarijari * (jarijari + sisimiring); 
    }
    public double hitungVolume() {
        double tinggi = Math.sqrt(Math.pow(sisimiring, 2) - Math.pow(jarijari, 2));
        return Math.PI * Math.pow(jarijari, 2) * tinggi / 3;
    }
}