import java.util.Scanner;

public class NusantaraPay13addassign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double LIMIT_HARIAN = 10000;

        System.out.println("=== Nusantara Pay - Evaluasi Transaksi ===");
        System.out.print("Status akun (NORMAL/SUSPICIOUS/BLACK-LISTED): ");
        String statusAkun = sc.nextLine().trim().toUpperCase();
        System.out.print("Sisa saldo ($): ");
        double saldo = sc.nextDouble();
        System.out.print("Nominal transaksi ($): ");
        double nominal = sc.nextDouble();
        System.out.print("Transaksi luar negeri? (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();
        System.out.print("Jam transaksi (0-23): ");
        int jam = sc.nextInt();

        String status;

        if (statusAkun.equals("BLACK-LISTED")) {
            status = "REJECTED_BLACKLIST";
        } else if (nominal > saldo) {
            status = "REJECTED_SALDO";
        } else if (nominal > LIMIT_HARIAN) {
            status = "REJECTED_LIMIT";
        } else if (isBedaNegara && nominal > 2000) {
            status = "FLAGGED_FRAUD";
        } else if (jam >= 0 && jam < 4 && nominal > 1000) {
            status = "REQUIRE_OTP_NIGHT";
        } else if (statusAkun.equals("SUSPICIOUS") && nominal > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            status = "APPROVED";
        }

        System.out.println("Status transaksi: " + status);
        sc.close();
    }
}