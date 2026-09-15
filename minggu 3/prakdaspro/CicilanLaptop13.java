import java.util.Scanner;

public class CicilanLaptop13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double hargaLaptop, uangMuka, sisaHarga, bunga, cicilanPokok, totalCicilanPerBulan;
        int lamaCicilan;
        
        System.out.print("Masukkan harga laptop (x): ");
        hargaLaptop = sc.nextDouble();
        System.out.print("Masukkan uang muka (y): ");
        uangMuka = sc.nextDouble();
        System.out.print("Masukkan lama cicilan dalam bulan (z): ");
        lamaCicilan = sc.nextInt();
        
        sisaHarga = hargaLaptop - uangMuka;
        cicilanPokok = sisaHarga / lamaCicilan;
        bunga = 0.02 * sisaHarga;
        totalCicilanPerBulan = cicilanPokok + bunga;
        
        System.out.println("Jumlah cicilan yang harus dibayar per bulan: Rp. " + totalCicilanPerBulan);
        
        sc.close();
    }
}
