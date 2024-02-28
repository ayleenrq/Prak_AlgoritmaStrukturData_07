package Jobsheet_3.ArrayObjects.src.Tugas1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        
        Kerucut[] kerucut = new Kerucut[2];
        Limas[] limas = new Limas[2];
        Bola[] bola = new Bola[2];

        for (int i = 0; i < kerucut.length; i++) {
            kerucut[i] = new Kerucut(i, i);
            System.out.println("Bangun Ruang Kerucut ke-" + (i+1));
            System.out.print("Masukkan Jari-jari : ");
            kerucut[i].jarijari = ayleen07.nextDouble();

            System.out.print("Masukkan Sisi Miring : ");
            kerucut[i].sisimiring = ayleen07.nextDouble();
        }
        System.out.println();
        for (int i = 0; i < limas.length; i++) {
            limas[i] = new Limas(i, i);
            System.out.println("Bangun Ruang Limas Segiempat ke-" + (i+1));
            System.out.print("Masukkan Sisi Alas : ");
            limas[i].sisi = ayleen07.nextDouble();

            System.out.print("Masukkan Tinggi : ");
            limas[i].tinggi = ayleen07.nextDouble();
        }
        System.out.println();
        for (int i = 0; i < bola.length; i++) {
            bola[i] = new Bola(i);
            System.out.println("Bangun Ruang Bola ke-" + (i+1));
            System.out.print("Masukkan Jari-jari : ");
            bola[i].jarijari = ayleen07.nextDouble();
        }
        System.out.println();
        for (int i = 0; i < kerucut.length; i++) {
            System.out.println("Luas Permukaan Kerucut ke-"+ (i+1) +" : " + Math.round(kerucut[i].hitungLuasPermukaan()));
            System.out.println("Volume Kerucut ke-"+ (i+1) +" : " + Math.round(kerucut[i].hitungVolume()));
        }
        System.out.println();
        for (int i = 0; i < limas.length; i++) {
            System.out.println("Luas Permukaan limas segiempat ke-"+ (i+1) +" : " + Math.round(limas[i].hitungLuasPermukaan()));
            System.out.println("Volume limas ke-"+ (i+1) +" : " + Math.round(limas[i].hitungVolume()));
        }
        System.out.println();
        for (int i = 0; i < bola.length; i++) {
            System.out.println("Luas Permukaan bola ke-"+ (i+1) +" : " + Math.round(bola[i].hitungLuasPermukaan()));
            System.out.println("Volume bola ke-"+ (i+1) +" : " + Math.round(bola[i].hitungVolume()));
        }
    }
}
