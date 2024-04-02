package Jobsheet_5.bubble_selection_insertion.src.jobsheet6;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting");
        list.tampilMahasiswa();
        
        System.out.println("Data Mahasiswa setelah sorting asc (berdasarkan IPK)");
        System.out.println("Bubble Short");
        list.bubbleShort();
        list.tampilMahasiswa();

        System.out.println("Data Mahasiswa setelah sorting asc (berdasarkan IPK)");
        System.out.println("Selection Short");
        list.selectionSort();
        list.tampilMahasiswa();
        
        System.out.println("Data Mahasiswa setelah sorting asc (berdasarkan IPK)");
        System.out.println("Insertion Short");
        list.insertionSort();
        list.tampilMahasiswa();

        System.out.println("Data Mahasiswa setelah sorting des (berdasarkan IPK)");
        System.out.println("Insertion Short");
        list.insertionSort();
        list.tampilMahasiswa();
    }
} 