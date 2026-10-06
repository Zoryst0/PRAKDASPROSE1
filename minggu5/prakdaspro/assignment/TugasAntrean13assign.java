import java.util.Scanner;

public class TugasAntrean13assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Mesin Antrean Akademik ===");
        System.out.println("1. Pengisian KRS");
        System.out.println("2. Legalisasi Ijazah & Transkrip");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Surat Keterangan Mahasiswa Aktif");
        System.out.print("Pilih kode layanan (1-4): ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Antrean layanan: Pengisian KRS");
                break;
            case 2:
                System.out.println("Antrean layanan: Legalisasi Ijazah & Transkrip");
                break;
            case 3:
                System.out.println("Antrean layanan: Pembayaran UKT");
                break;
            case 4:
                System.out.println("Antrean layanan: Surat Keterangan Mahasiswa Aktif");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }
}