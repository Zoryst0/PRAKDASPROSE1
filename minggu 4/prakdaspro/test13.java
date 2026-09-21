import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaID;
        float hpaket;
        int pemakaianext;
        float bextr;
        float totsebelumdiskon;
        float diskon;
        float totbay;

        System.out.println("Masukan Nama/ID Pelanggan       : ");
        namaID = sc.nextLine();

        System.out.println("Masukan Harga Paket             : ");
        hpaket = sc.nextFloat();

        System.out.println("Masukan Pemakaian Extra (GB)    : ");
        pemakaianext = sc.nextInt();

        bextr = pemakaianext * 2000;
        totsebelumdiskon = hpaket + bextr;

        if (totsebelumdiskon > 500000) {
                diskon = totsebelumdiskon * 0.10f;} 
        else if (totsebelumdiskon > 300000) {
                diskon = totsebelumdiskon * 0.05f;} 
        else {
            diskon = 0;}
        totbay = totsebelumdiskon - diskon;

        System.out.println("\n <===== Tagihan Internet =====>");
        System.out.println("Nama/ID Pelanggan            : " + namaID);
        System.out.println("Harga Paket yang dipakai     : " + hpaket);
        System.out.println("Pemakaian Extra (GB)         : " + pemakaianext);
        System.out.println("Biaya Extra/GB               : " + bextr);
        System.out.println("Diskon                       : " + diskon);
        System.out.println("Harga Sebelum Diskon         : " + totsebelumdiskon);
        System.out.println("Total Bayar                  : " + totbay);
        
        System.out.print("\n <==== Tipe Pembayaran ====>");
        System.out.print("\n Pilih");
        System.out.println("ak");
        System.out.println("anodized");
        System.out.println("hamparan");
        System.out.println("internal design cant be resolved");

        int tanggal;
        String hari;
        
        System.out.println("<==== Tanggal Pembayaran ====>");
        System.out.println("Hari Transaksi :              ");



    }    
}
