package Jobsheet_12;
import java.util.Scanner;

public class GraphMain07 {
    public static void main(String[] args) throws Exception {
        Scanner ayleen07 = new Scanner(System.in);
        // Graph07 gedung = new Graph07(6);
        // boolean lanjut = true;

        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // // langkah 14
        // gedung.degree(0); 
        // gedung.printGraph();                            
        // // langkah 17
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();
        
        // System.out.println("+-------------------------------+");
        // System.out.println("[    Pengecekan Jalur Gedung    ]");
        // System.out.println("+-------------------------------+");
        // System.out.println();
        
        // while (lanjut) {
        //     System.out.print("Masukkan gedung asal : ");
        //     int asal = ayleen07.nextInt();
        //     System.out.print("Masukkan gedung tujuan : ");
        //     int tujuan = ayleen07.nextInt();

        //     if (gedung.adjacency(asal, tujuan)) {
        //         System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        //     } else {
        //         System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        //     }
        //     System.out.println();

        //     System.out.print("Apakah Anda ingin melakukan pengecekan lagi? (y/n) : ");
        //     char pilihan = ayleen07.next().charAt(0);
        //     if (pilihan == 'n' || pilihan == 'N') {
        //         lanjut = false;
        //     }
        //     System.out.println();
        // }
        // ayleen07.close();

        GraphMatriks07 gdg07 = new GraphMatriks07(4);
        gdg07.makeEdge(0, 1, 50);
        gdg07.makeEdge(1, 0, 60);
        gdg07.makeEdge(1, 2, 70);
        gdg07.makeEdge(2, 1, 80);
        gdg07.makeEdge(2, 3, 40);
        gdg07.makeEdge(3, 0, 90);
        gdg07.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg07.removeEdge(2, 1);
        gdg07.printGraph();
    }
}
