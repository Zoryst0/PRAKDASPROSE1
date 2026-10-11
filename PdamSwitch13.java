import java.util.Scanner;

public class PdamSwitch13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Format ID pelanggan: digit pertama = golongan (1 = Rumah Tangga, 2 = Niaga, 3 = Industri)
        System.out.print("Masukkan ID pelanggan PDAM (mis. 1001234) : ");
        String idPelanggan = sc.next();
        System.out.print("Pemakaian air (m3)                        : ");
        int pemakaian = sc.nextInt();

        char kodeGolongan = idPelanggan.charAt(0);
        String golongan;
        int tarif;      // per m3
        int biayaAdmin;

        switch (kodeGolongan) {
            case '1':
                golongan = "Rumah Tangga";
                tarif = 3000;
                biayaAdmin = 2500;
                break;
            case '2':
                golongan = "Niaga";
                tarif = 5000;
                biayaAdmin = 5000;
                break;
            case '3':
                golongan = "Industri";
                tarif = 7500;
                biayaAdmin = 7500;
                break;
            default:
                System.out.println("ID pelanggan tidak valid / golongan tidak dikenal!");
                sc.close();
                return;
        }

        int biayaAir = pemakaian * tarif;
        int totalBayar = biayaAir + biayaAdmin;
        String idPembayaran = "PAY-" + idPelanggan + "-" + pemakaian;

        System.out.println("========== STRUK PDAM ==========");
        System.out.println("ID Pembayaran : " + idPembayaran);
        System.out.println("ID Pelanggan  : " + idPelanggan);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Pemakaian     : " + pemakaian + " m3");
        System.out.println("Tarif per m3  : Rp" + tarif);
        System.out.println("Biaya air     : Rp" + biayaAir);
        System.out.println("Biaya admin   : Rp" + biayaAdmin);
        System.out.println("Total bayar   : Rp" + totalBayar);
        sc.close();
    }
}
