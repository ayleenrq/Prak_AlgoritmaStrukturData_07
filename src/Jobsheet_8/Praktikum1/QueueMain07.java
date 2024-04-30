package Jobsheet_8.Praktikum1;
import java.util.Scanner;

public class QueueMain07 {
    public static void menu() {
        System.out.println();
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        int pilih;
        
        System.out.print("Masukkan kapasitas queue : ");
        int n = ayleen07.nextInt();
        Queue07 Q = new Queue07(n);
        
        do {
            menu();
            pilih = ayleen07.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = ayleen07.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang di keluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
            
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}