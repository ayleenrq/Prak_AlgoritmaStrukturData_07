package Jobsheet_6.TestSearching.src.P7;

public class PencarianBuku07 {
    Buku07 listBuku[] = new Buku07[5];
    int idx;

    void Tambah(Buku07 bk) {
        if (idx < listBuku.length) {
            listBuku[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void TampilDataBuku() {
        for (Buku07 bk : listBuku) {
            bk.TampilDataBuku();
        }
    }
    int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    Buku07 FindBuku(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari){
                posisi = i;
                break;
            }
        }
        System.out.println("=========================");
        System.out.println("Kode Buku: " + posisi);
        System.out.println("Judul: " + listBuku[posisi].judul);
        System.out.println("Tahun terbit: " + listBuku[posisi].tahunTerbit);
        System.out.println("Pengarang: " + listBuku[posisi].pengarang);
        System.out.println("Stock: " + listBuku[posisi].stock);

        return listBuku[posisi];
    }
    void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }
    void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul Buku\t : " + listBuku[pos].judul);
            System.out.println("Tahun Terbit\t : " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBuku[pos].pengarang);
            System.out.println("Stock Buku\t : " + listBuku[pos].stock);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }
}