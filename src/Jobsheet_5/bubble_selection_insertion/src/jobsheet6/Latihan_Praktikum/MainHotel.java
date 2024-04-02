package Jobsheet_5.bubble_selection_insertion.src.jobsheet6.Latihan_Praktikum;

public class MainHotel {
    public static void main(String[] args) {
        HotelService listHotel = new HotelService();

        Hotel hotel1 = new Hotel("Hotel A", "Kota A", 400000, (byte) 4);
        Hotel hotel2 = new Hotel("Hotel B", "Kota B", 180000, (byte) 2);
        Hotel hotel3 = new Hotel("Hotel C", "Kota C", 340000, (byte) 5);
        Hotel hotel4 = new Hotel("Hotel D", "Kota D", 210000, (byte) 1);
        Hotel hotel5 = new Hotel("Hotel E", "Kota E", 300000, (byte) 3);

        listHotel.tambah(hotel1);
        listHotel.tambah(hotel2);
        listHotel.tambah(hotel3);
        listHotel.tambah(hotel4);
        listHotel.tambah(hotel5);

        System.out.println("Daftar Hotel sebelum sorting");
        System.out.println();
        listHotel.tampilAll();
        System.out.println();
        
        System.out.println("Daftar Hotel berdasarkan harga termurah (Bubble Short)");
        System.out.println();
        listHotel.bubbleShortHarga();
        listHotel.tampilAll();
        System.out.println();
        
        System.out.println("Daftar Hotel berdasarkan harga termurah (Selection Short)");
        System.out.println();
        listHotel.selectionSortHarga();
        listHotel.tampilAll();
        System.out.println();
        
        System.out.println("Daftar Hotel berdasarkan bintang tertinggi (Bubble Short)");
        System.out.println();
        listHotel.bubbleShortBintang();
        listHotel.tampilAll();
        System.out.println();
        
        System.out.println("Daftar Hotel berdasarkan bintang tertinggi (Selection Short)");
        System.out.println();
        listHotel.selectionSortBintang();
        listHotel.tampilAll();
        System.out.println();
    }
}