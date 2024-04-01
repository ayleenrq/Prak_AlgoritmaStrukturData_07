package Jobsheet_5.bubble_selection_insertion.src.jobsheet6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampilMahasiswa() {
        for (Mahasiswa mhs : listMhs) {
            mhs.tampilMahasiswa();
            System.out.println("------------------------------");
        }
    }
    void bubbleShort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
}