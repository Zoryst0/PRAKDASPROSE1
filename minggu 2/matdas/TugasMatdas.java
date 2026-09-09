import java.util.Scanner;

public class TugasMatdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("\n==== PROGRAM CEK KELULUSAN MAHASISWA ====");

        System.out.print("Masukkan nilai mahasiswa (0-100) : ");
        double nilai = input.nextDouble();

        System.out.print("Masukkan kehadiran (0-100%)      : ");
        double kehadiran = input.nextDouble();

        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;

        boolean lulus = p && q;

        System.out.println("\n------------- H  A  S  I  L -------------");
        System.out.println("Nilai                            : " + nilai);
        System.out.println("Kehadiran                        : " + (int) kehadiran + "%");
        System.out.println("p (nilai >= 60)                  : " + p);
        System.out.println("q (kehadiran >= 80%)             : " + q);

        System.out.println("Status                           : "
                + (lulus ? "LULUS" : "TIDAK LULUS"));

        // De Morgan:
        // !(p AND q) ≡ (!p) OR (!q)
        boolean tidakLulusDeMorgan = (!p) || (!q);

        System.out.println("Tidak lulus menurut (De Morgan)  : "
                + tidakLulusDeMorgan);

        input.close();
    }
}
        // this code is 100% created without AI assistance.
        // 013_Elia Beril_TI-1D_TugasMatdasPertemuan2