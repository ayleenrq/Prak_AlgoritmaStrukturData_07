package Jobsheet_5.bubble_selection_insertion.src.jobsheet6.tes;

public class Struk {
    String waktuPenjualan, Kasir;
    int Subtotal, Tax, Pembulatan, GrandTotal, Qris, Tamu;
    Menu[] listMenu;

    public Struk() {

    }

    public void Tampil() {
        System.out.println(waktuPenjualan);
        System.out.println(Kasir);
        System.out.println(Subtotal);
        System.out.println(Tax);
        System.out.println(Pembulatan);
        System.out.println(GrandTotal);
        System.out.println(Qris);
        System.out.println(Tamu);
        System.out.println("==================");
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println("Menu ke " + (i + 1));
            System.out.println(listMenu[i].namaMenu);
            System.out.println(listMenu[i].harga);
        }
    }
}
