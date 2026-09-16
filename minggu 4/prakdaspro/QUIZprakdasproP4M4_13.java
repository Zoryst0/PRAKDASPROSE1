//13_Elia Beril_TI-1D_264107020027
import java.util.Scanner;

public class QUIZprakdasproP4M4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Variabel dan Tipe Data Yang dipakai
        float tarifDasar;
        float jarak;
        float biayaBahanBakar;
        float komisi;
        float resikoKeterlambatan;
        float hargaJual;
        float biayaMakanan;
        float resikoKerusakan;
        float jumlahTransaksi;
        float jumlahTransaksiDriver;
        float keuntunganDriver;
        float keuntunganMerchant;
        float totalKeuntungan;
        float totalTransaksi;

        System.out.println("<=== Menghitung Keuntungan ===>");

//Tarif awal yang diterima driver untuk satu perjalanan.
        System.out.print("Tarif dasar driver (Rp)       : ");
        tarifDasar = sc.nextFloat();

//Jarak perjalanan driver dalam kilometer. Digunakan untuk menghitung pendapatan dan biaya bahan bakar.
        System.out.print("Jarak perjalanan (km)         : ");
        jarak = sc.nextFloat();

//Biaya bensin untuk setiap kilometer perjalanan.
        System.out.print("Biaya bahan bakar per km (Rp) : ");
        biayaBahanBakar = sc.nextFloat();

//Persentase keuntungan yang diambil oleh perusahaan dari setiap transaksi.
        System.out.print("Komisi perusahaan (%)         : ");
        komisi = sc.nextFloat();

//Persentase pengurangan keuntungan driver jika terjadi keterlambatan.
        System.out.print("Resiko keterlambatan (%)      : ");
        resikoKeterlambatan = sc.nextFloat();

//Banyaknya transaksi atau perjalanan yang dilakukan driver.
        System.out.print("Jumlah transaksi driver       : ");
        jumlahTransaksiDriver = sc.nextFloat();

        System.out.println("\nData merchant");

//Harga makanan yang dijual oleh merchant kepada pelanggan.
        System.out.print("Harga jual makanan (Rp)       : ");
        hargaJual = sc.nextFloat();

//Modal atau biaya yang dikeluarkan merchant untuk menyediakan makanan.
        System.out.print("Biaya makanan (Rp)             : ");
        biayaMakanan = sc.nextFloat();

//Persentase pengurangan keuntungan merchant apabila makanan atau barang mengalami kerusakan.
        System.out.print("Resiko kerusakan barang (%)    : ");
        resikoKerusakan = sc.nextFloat();

//Banyaknya transaksi makanan yang dilakukan merchant.
        System.out.print("Jumlah transaksi merchant     : ");
        jumlahTransaksi = sc.nextFloat();


        keuntunganDriver = (tarifDasar * jarak - biayaBahanBakar * jarak)
                * (1 - komisi / 100) * (1 - resikoKeterlambatan / 100)
                * jumlahTransaksiDriver;
        keuntunganMerchant = (hargaJual - biayaMakanan)
                * (1 - komisi / 100) * (1 - resikoKerusakan / 100)
                * jumlahTransaksi;

//total keuntungan dari kedua mitra        
        totalKeuntungan = keuntunganDriver + keuntunganMerchant;
//total transaksi dari kedua mitra
        totalTransaksi = jumlahTransaksiDriver + jumlahTransaksi;

//Menampilkan Total Hasil Keuntungan dari ketiga mitra
        System.out.println("\n<=== Hasil Perhitungan ===>");
//Keuntungan dari mitra driver (Rp)
        System.out.println("\nKeuntungan driver    : Rp " + keuntunganDriver);
//Keuntungan dari mitra merchant (Rp)
        System.out.println("Keuntungan merchant : Rp " + keuntunganMerchant);
//Total Keuntungan dari kedua merchant (Rp)
        System.out.println("Total keuntungan     : Rp " + totalKeuntungan);
//rata" transaksi dari kedua merchant (Rp)
        System.out.println("Rata-rata/transaksi  : Rp " + totalKeuntungan / totalTransaksi);
//Kontribusi driver ke perusahaan ojol (%)
        System.out.println("\nKontribusi driver    : " + keuntunganDriver / totalKeuntungan * 100 + "%");
//Kontribusi merchant ke perusahaan ojol (%)
        System.out.println("Kontribusi merchant : " + keuntunganMerchant / totalKeuntungan * 100 + "%");
        sc.close();
    }
}

//Quiz Praktikum Dasar Pemrograman Minggu4 Pertemuan4
//Rabu, 16/09/26 
//Code selesai pada 13:51
//
