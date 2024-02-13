package Jobsheet_1;

public class Fungsi07 {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},  //RoyalGarden1
            {6, 11, 9, 12},  //RoyalGarden2
            {2, 10, 10, 5},  //RoyalGarden3
            {5, 7, 12, 9}    //RoyalGarden4
        };
        int[] harga = {75000, 50000, 60000, 10000};
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[] mati = {-1, -2, 0, -5};

        System.out.println("===========================");
        System.out.println("Stock Awal");
        System.out.println("===========================");

        for (int i = 0; i < stock.length; i++) {
            System.out.print("Cabang " + (i+1) + " : ");
            for (int j = 0; j < stock[i].length; j++) {
                System.out.print(stock[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===========================");
        System.out.println("Pendapatan setiap cabang : ");
        System.out.println("===========================");

        int[] pendapatan = new int[cabang.length];
        pendapatan(stock, harga, pendapatan);

        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%s : Rp. %,d%n", cabang[i], pendapatan[i]);
        }

        System.out.println("===========================");
        System.out.println("Stock Terbaru");
        System.out.println("===========================");

        stockUpdate(stock, mati);
        for (int i = 0; i < stock.length; i++) {
            System.out.print(cabang[i] + " : ");
            for (int j = 0; j < stock[i].length; j++) {
                System.out.print(stock[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void pendapatan(int[][] stock, int[] harga, int[] pendapatan) {
        for (int i = 0; i < stock.length; i++) {
            int total = 0;
            for (int j = 0; j < stock[i].length; j++) {
                total += harga[j] * stock[i][j];
            }
            pendapatan[i] = total;
        }
    }
    public static void stockUpdate(int[][] stock, int[] mati) {
        for (int i = 0; i < mati.length; i++) {
                stock[3][i] += mati[i];
        }
    }
}
