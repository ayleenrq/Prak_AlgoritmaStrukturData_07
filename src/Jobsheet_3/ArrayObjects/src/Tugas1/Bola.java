package Jobsheet_3.ArrayObjects.src.Tugas1;

public class Bola {
    public double jarijari;

    public Bola(double r) {
        jarijari = r;
    }
    public double hitungLuasPermukaan() {
        return Math.PI * 4 * jarijari * jarijari;
    }
    public double hitungVolume() {
        return (4.0/3) * Math.PI * Math.pow(jarijari, 3);
    }
}
