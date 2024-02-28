package Jobsheet_3.ArrayObjects.src.Tugas2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama : ");
            String nama = ayleen07.nextLine();
            
            System.out.print("Masukkan NIM : ");  
            long nim = ayleen07.nextLong();
            ayleen07.nextLine();
            
            System.out.print("Masukkan Jenis Kelamin: ");
            String jenisKelamin = ayleen07.nextLine();
            
            System.out.print("Masukkan IPK: ");
            double ipk = ayleen07.nextDouble();
            ayleen07.nextLine();
            
            mahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk); 
        }
        System.out.println();
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1)); 
            System.out.println("Nama          : " + mahasiswa[i].nama);
            System.out.println("NIM           : " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin : " + mahasiswa[i].jenisKelamin);  
            System.out.println("IPK           : " + mahasiswa[i].ipk);
            System.out.println();
        }
    }
}
