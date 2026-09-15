import java.util.Scanner;

public class BiayaCetak13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahLembar;
        int biayaCetakPerLembar = 500;
        int biayaJilid = 5000;
        int totalBiaya;

        System.out.print("Masukkan jumlah lembar dokumen (x): ");
        jumlahLembar = sc.nextInt();

        totalBiaya = (jumlahLembar * biayaCetakPerLembar) + biayaJilid;

        System.out.println("Total biaya yang harus dibayar: Rp. " + totalBiaya);
        
        sc.close();
    }
}
