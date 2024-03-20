package Jobsheet_4.Minggu_5.src.BruteForceDivideConquer;

public class Faktorial {
    public int nilai;

    int faktorialBF_while(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }
    int faktorialBF_dowhile(int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto *= i;
            i++;
        } while (i <= n);
        return fakto;
    }
    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } 
        else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}