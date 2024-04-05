package Jobsheet_5.bubble_selection_insertion.src.jobsheet6.tes;

public class mainStruk {
    public static void main(String[] args) {
        Struk strukHariIni[] = new Struk[10];
        strukHariIni[0] = new Struk();
        strukHariIni[0].waktuPenjualan = "3 April";
        strukHariIni[0].Kasir = "Kasir 1";
        strukHariIni[0].Tamu = 1;
        strukHariIni[0].Subtotal = 24000;
        strukHariIni[0].Tax = 2400;
        strukHariIni[0].Pembulatan = -400;
        strukHariIni[0].GrandTotal = 26000;
        strukHariIni[0].Qris = 26000;

        strukHariIni[0].listMenu = new Menu[2];
        strukHariIni[0].listMenu[0] = new Menu("Es Matcha Latte", 24000);
        strukHariIni[0].listMenu[1] = new Menu("Pisang Goreng", 16000);

        strukHariIni[0].Tampil();
    }
}
