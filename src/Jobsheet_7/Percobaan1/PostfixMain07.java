package Jobsheet_7.Percobaan1;
import java.util.Scanner;

public class PostfixMain07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        String P, Q;

        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = ayleen07.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix07 post = new Postfix07(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
}