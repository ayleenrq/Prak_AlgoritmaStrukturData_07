package UTS_Ayleen;
import java.util.Scanner;

public class PencarianNasabah {
    NasabahAyleen listNasabah[] = new NasabahAyleen[6];
    Scanner ayleen07 = new Scanner(System.in);
    int idx;

    void TambahAyleen(NasabahAyleen nasabahAyleen) {
        if (idx < listNasabah.length) {
            listNasabah[idx] = nasabahAyleen;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void TampilDataAyleen() {
        for (NasabahAyleen nasabahAyleen : listNasabah) {
            if (nasabahAyleen != null) {
                nasabahAyleen.TampilDataNasabahAyleen();
            }
        }
    }
    int sequentialSearchAyleen(String nikCari) {
        for (int i = 0; i < idx; i++) {
            if (listNasabah[i].nikAyleen.equals(nikCari)) {
                return i;
            }
        }
        return -1;
    }
    void searchNasabahAyleen() {
        System.out.println("============================================");
        System.out.print("\nMasukkan NIK Nasabah: ");
        String nikCari = ayleen07.next();
        int index = sequentialSearchAyleen(nikCari);
        if (index != -1) {
            System.out.println("--------------------------------------------");
            System.out.println("\nNasabah ditemukan");
            System.out.println("NIK    : " + listNasabah[index].nikAyleen);
            System.out.println("Nama   : " + listNasabah[index].namaAyleen);
            System.out.println("Saldo  : " + listNasabah[index].saldoAyleen);
        } else {
            System.out.println("Nasabah dengan NIK " + nikCari + " tidak ditemukan.");
        }
    }
    void selectionSortDescendingAyleen() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (listNasabah[j].saldoAyleen > listNasabah[maxIdx].saldoAyleen) {
                    maxIdx = j;
                }
            }
            NasabahAyleen temp = listNasabah[i];
            listNasabah[i] = listNasabah[maxIdx];
            listNasabah[maxIdx] = temp;
        }
    }
}
