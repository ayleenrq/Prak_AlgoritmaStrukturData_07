package Jobsheet_3.ArrayObjects.src.ArraySegitiga;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = t;
        tinggi = t;
    }
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliling() {
        int sisiMiring = (int) Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
        return alas + tinggi + sisiMiring;
    }
}
